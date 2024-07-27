package com.decker.barotrauma.components;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MonsterSet extends EventSet<MonsterSet> implements Monster {
	
	public MonsterSet(String identifier) {
		this(identifier, null, null);
	}
	
	public MonsterSet(String identifier, boolean chooserandom) {
		this(identifier, chooserandom, null);
	}
	
	public MonsterSet(String identifier, Integer commonness) {
		this(identifier, null, commonness);
	}
	
	public MonsterSet(String identifier, Boolean chooserandom, Integer commonness) {
		if (identifier != null) {
			this.getFields().put("identifier", identifier);
		}
		if (chooserandom != null) {
			this.getFields().put("chooserandom", Boolean.valueOf(chooserandom));
		}
		if (commonness != null) {
			this.getFields().put("commonness", Integer.toString(commonness));
		}
		this.getFields().put("triggereventcooldown", Boolean.toString(false));
	}
	
	public MonsterSet(boolean chooserandom) {
		this.getFields().put("chooserandom", Boolean.valueOf(chooserandom));
	}
	
	public MonsterSet monsters(Monster... monsterEvents) {
		this.add(Arrays.asList(monsterEvents));
		return this;
	}
	
	public MonsterSet allowatstart(boolean allowatstart) {
		this.getFields().put("allowatstart", allowatstart);
		return this;
	}
	
	public List<Monster> getMonsters() {
		return this.getEntities().stream()
				.filter(entity -> entity instanceof Monster)
				.map(entity -> ((Monster) entity))
				.toList();
	}
	
	@Override
	public Monster spawntype(String spawntype) {
		this.getMonsters().stream()
				.forEach(monster -> monster.spawntype(spawntype));
		return this;
	}
	
	public Monster triggereventcooldown(Boolean triggereventcooldown) {
		if (triggereventcooldown != null) {
			this.getFields().put("triggereventcooldown", Boolean.toString(triggereventcooldown));
		}
		return this;
	}
	
	@Override
	public Monster spawnpointtag(String spawnpointtag) {
		this.getMonsters().stream()
				.forEach(monster -> monster.spawnpointtag(spawnpointtag));
		return this;
	}
	
	@Override
	public Monster spawnprobability(double spawnprobability) {
		this.getMonsters().stream()
				.forEach(monster -> monster.spawnprobability(spawnprobability));
		return this;
	}
	
	@Override
	public Monster delaybetweenspawns(double delaybetweenspawns) {
		this.getMonsters().stream()
				.forEach(monster -> monster.delaybetweenspawns(delaybetweenspawns));
		return this;
	}
	
	@Override
	public Monster spawndistance(int spawndistance) {
		this.getMonsters().stream()
				.forEach(monster -> monster.spawndistance(spawndistance));
		return this;
	}
	
	@Override
	protected MonsterSet getThis() {
		return this;
	}
	protected Map<String, Object> createFields() {
		return new TreeMap<>(new FieldComparator());
	}
}
