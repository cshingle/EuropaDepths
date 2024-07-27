package com.decker.barotrauma.components;

import java.util.Map;
import java.util.TreeMap;

public class MonsterEvent extends AbstractEntity<MonsterEvent> implements Monster {
	
	public MonsterEvent(Character characterfile, int minamount, int maxamount) {
		this.getFields().put("characterfile", characterfile.toString());
		this.getFields().put("minamount", Integer.valueOf(minamount));
		this.getFields().put("maxamount", Integer.valueOf(maxamount));
		this.getFields().put("spawntype", "false");
	}
	
	@Override
	public Monster spawntype(String spawntype) {
		this.getFields().put("spawntype", spawntype);
		return this;
	}
	
	@Override
	public MonsterEvent spawnpointtag(String spawnpointtag) {
		this.getFields().put("spawnpointtag", spawnpointtag);
		return this;
	}
	
	@Override
	public MonsterEvent spawnprobability(double spawnprobability) {
		this.getFields().putIfAbsent("spawnprobability", Double.toString(spawnprobability).replaceAll(".0$", ""));
		return this;
	}
	
	public MonsterEvent probability(double probability) {
		this.getFields().putIfAbsent("probability", Double.toString(probability).replaceAll(".0$", ""));
		return this;
	}
	
	@Override
	public MonsterEvent spawndistance(int spawndistance) {
		this.getFields().put("spawndistance", spawndistance);
		return this;
	}
	
	public MonsterEvent maxamountperlevel(int maxamountperlevel) {
		this.getFields().put("maxamountperlevel", maxamountperlevel);
		return this;
	}
	
	public MonsterEvent offset(int offset) {
		this.getFields().put("offset", offset);
		return this;
	}
	
	public MonsterEvent scatter(int scatter) {
		this.getFields().put("scatter", scatter);
		return this;
	}
	
	@Override
	public MonsterEvent delaybetweenspawns(double delaybetweenspawns) {
		this.getFields().put("delaybetweenspawns", Double.toString(delaybetweenspawns).replaceAll(".0$", ""));
		return this;
	}
	
	public Monster triggereventcooldown(Boolean triggereventcooldown) {
		if (triggereventcooldown != null) {
			this.getFields().put("triggereventcooldown", Boolean.toString(triggereventcooldown));
		} else {
			this.getFields().remove("triggereventcooldown");
		}
		return this;
	}
	
	@Override
	public String getTag() {
		return "MonsterEvent";
	}
	
	@Override
	protected MonsterEvent getThis() {
		return this;
	}
	protected Map<String, Object> createFields() {
		return new TreeMap<>(new FieldComparator());
	}
}
