package com.decker.barotrauma.campaign;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class RuinEncounters extends EventSet implements Monster {
	Map<String, Object> fields = new TreeMap<>(new FieldComparator());
	
	public RuinEncounters() {
		fields.put("identifier", "ruin_encounters");
		fields.put("chooserandom", "true");
		fields.put("triggereventcooldown", "false");
		fields.put("allowatstart", "true");
	}
	
	public RuinEncounters monsters(Monster... monsterEvents) {
		for (Monster monster : Arrays.asList(monsterEvents)) {
			monster.spawntype("ruin");
			if (monster instanceof MonsterSet) {
				((MonsterSet) monster).allowatstart(true);
				((MonsterSet) monster).triggereventcooldown(false);
			}
			
			this.events.add(monster);
		}
		return this;
	}
	
	public RuinEncounters allowatstart(boolean allowatstart) {
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
	
	@Override
	public Monster spawnpointtag(String spawnpointtag) {
		for (Event event : this.events) {
			((Monster) event).spawnpointtag(spawnpointtag);
		}
		return this;
	}
	
	@Override
	public Monster spawnprobability(double spawnprobability) {
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
