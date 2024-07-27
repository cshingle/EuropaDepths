package com.decker.barotrauma.components;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SpawnEvent extends EventSet<SpawnEvent> {
	String comment;
	
	public SpawnEvent(String identifier, Double mindistancetraveled, Integer minmissiontime, double maxintensity) {
		this(identifier, mindistancetraveled, minmissiontime, null, maxintensity, false);
	}
	
	public SpawnEvent(String identifier, Double mindistancetraveled, Integer minmissiontime, Boolean triggereventcooldown, double maxintensity, Boolean allowAtStart) {
		this.identifier(identifier);
		this.getFields().put("chooserandom", "true");
		if (mindistancetraveled != null) {
			this.getFields().put("mindistancetraveled", new BigDecimal(mindistancetraveled).setScale(2, RoundingMode.HALF_UP).toString());
		}
		if (minmissiontime != null) {
			this.getFields().put("minmissiontime", minmissiontime);
		}
		if (triggereventcooldown != null) {
			this.getFields().put("triggereventcooldown", Boolean.toString(triggereventcooldown));
		}
		this.getFields().put("minintensity", "0.0");
		this.getFields().put("maxintensity", Double.toString(maxintensity));
		if (allowAtStart != null) {
			this.getFields().put("allowatstart", Boolean.toString(allowAtStart));
		}
		this.getFields().put("delaywhencrewaway", "true");
		
		if (mindistancetraveled != null && minmissiontime != null) {
			this.comment = String.format("<!-- %s%% or %s min -->\n", new BigDecimal(mindistancetraveled).setScale(2, RoundingMode.HALF_UP).toString().replaceFirst(".*[.]0?([0-9]+)", "$1"), minmissiontime / 60);
		} else {
			if (mindistancetraveled != null) {
				this.comment = String.format("<!-- %s%% -->\n", new BigDecimal(mindistancetraveled).setScale(2, RoundingMode.HALF_UP).toString().replaceFirst(".*[.]([0-9]+)", "$1"));
			} else {
				if (minmissiontime != null) {
					this.comment = String.format("<!-- %s min -->\n", minmissiontime / 60);
				}
			}
		}
		
	}
	
	public SpawnEvent spawntype(String spawntype) {
		this.getMonsters().stream()
				.forEach(monster -> monster.spawntype(spawntype));
		return this;
	}
	
	public SpawnEvent monsters(Monster... monsters) {
		for (Monster monsterEvent : Arrays.asList(monsters)) {
			monsterEvent.delaybetweenspawns(1);
			monsterEvent.spawntype("mainpath,sidepath");
			this.add(monsterEvent);
		}
		return this;
	}
	
	@Override
	public void renderComment(int depth, Writer writer) throws IOException {
		if (comment != null) {
			writer.append(this.indent(depth));
			writer.append(comment);
		}
	}
	
	public List<Monster> getMonsters() {
		return this.getEntities().stream()
				.filter(entity -> entity instanceof Monster)
				.map(entity -> ((Monster) entity))
				.toList();
	}
	
	@Override
	protected SpawnEvent getThis() {
		return this;
	}
	
	protected Map<String, Object> createFields() {
		return new TreeMap<>(new FieldComparator());
	}
}
