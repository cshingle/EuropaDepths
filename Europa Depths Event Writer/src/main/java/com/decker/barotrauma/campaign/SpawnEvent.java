package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SpawnEvent extends EventSet {
	String comment;
	Map<String, Object> fields = new TreeMap<>(new FieldComparator());
	
	public SpawnEvent(String identifier, Double mindistancetraveled, Integer minmissiontime, double maxintensity) {
		this(identifier, mindistancetraveled, minmissiontime, null, maxintensity);
	}
	
	public SpawnEvent(String identifier, Double mindistancetraveled, Integer minmissiontime, Boolean triggereventcooldown, double maxintensity) {
		fields.put("identifier", identifier);
		fields.put("chooserandom", "true");
		if (mindistancetraveled != null) {
			fields.put("mindistancetraveled", new BigDecimal(mindistancetraveled).setScale(2, RoundingMode.HALF_UP).toString());
		}
		if (minmissiontime != null) {
			fields.put("minmissiontime", minmissiontime);
		}
		if (triggereventcooldown != null) {
			fields.put("triggereventcooldown", Boolean.toString(triggereventcooldown));
		}
		fields.put("minintensity", "0.0");
		fields.put("maxintensity", Double.toString(maxintensity));
		fields.put("delaywhencrewaway", "true");
		
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
		for (Event event : this.events) {
			((Monster) event).spawntype(spawntype);
		}
		return this;
	}
	
	public SpawnEvent monsters(Monster... monsters) {
		for (Monster monsterEvent : Arrays.asList(monsters)) {
			monsterEvent.spawntype("mainpath,sidepath");
			this.events.add(monsterEvent);
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
	
	@Override
	public Map<String, Object> getFields() {
		return this.fields;
	}
}
