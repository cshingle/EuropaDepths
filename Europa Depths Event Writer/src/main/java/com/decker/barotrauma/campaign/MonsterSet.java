package com.decker.barotrauma.campaign;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MonsterSet extends EventSet implements Monster {
	Map<String, Object> fields = new TreeMap<>(new FieldComparator());
	
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
			fields.put("identifier", identifier);
		}
		if (chooserandom != null) {
			fields.put("chooserandom", Boolean.valueOf(chooserandom));
		}
		if (commonness != null) {
			fields.put("commonness", Integer.toString(commonness));
		}
	}
	
	public MonsterSet(boolean chooserandom) {
		fields.put("chooserandom", Boolean.valueOf(chooserandom));
	}
	
	public MonsterSet monsters(Monster... monsterEvents) {
		for (Monster monster : Arrays.asList(monsterEvents)) {
			this.events.add(monster);
		}
		return this;
	}
	
	public MonsterSet allowatstart(boolean allowatstart) {
		this.fields.put("allowatstart", allowatstart);
		return this;
	}
	
	@Override
	public Monster spawntype(String spawntype) {
		for (Event event : this.events) {
			((Monster) event).spawntype(spawntype);
		}
		return this;
	}
	
	public Monster triggereventcooldown(Boolean triggereventcooldown) {
		if (triggereventcooldown != null) {
			fields.put("triggereventcooldown", Boolean.toString(triggereventcooldown));
		} else {
			fields.remove("triggereventcooldown");
		}
		return this;
	}
	
	@Override
	public Monster spawnpointtag(String spawnpointtag) {
		for (Event event : this.events) {
			((Monster) event).spawnpointtag(spawnpointtag);
		}
		return this;
	}
	
	@Override
	public Monster spawnprobability(double spawnprobability) {
		for (Event event : this.events) {
			((Monster) event).spawnprobability(spawnprobability);
		}
		return this;
	}
	
	@Override
	public Monster delaybetweenspawns(double delaybetweenspawns) {
		for (Event event : this.events) {
			((Monster) event).delaybetweenspawns(delaybetweenspawns);
		}
		return this;
	}
	
	@Override
	public Monster spawndistance(int spawndistance) {
		for (Event event : this.events) {
			((Monster) event).spawndistance(spawndistance);
		}
		return this;
	}
	
	@Override
	public Map<String, Object> getFields() {
		return this.fields;
	}
}
