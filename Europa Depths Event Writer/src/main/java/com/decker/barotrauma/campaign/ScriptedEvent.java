package com.decker.barotrauma.campaign;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ScriptedEvent extends EventSet implements Monster {
	
	Map<String, Object> fields = new TreeMap<>(new FieldComparator());
	
	public ScriptedEvent(String identifier) {
		fields.put("identifier", identifier);
	}

	public Monster spawnlocation(String spawnlocation) {
		for (Event event : this.events) {
			if (event instanceof SpawnAction) {
				((SpawnAction) event).spawnlocation(spawnlocation);
			}
		}
		return this;
	}
	
	public ScriptedEvent actions(ScriptedAction... actions) {
		this.events.addAll(Arrays.asList(actions));
		return this;
	}
	
	@Override
	public String getTag() {
		return "ScriptedEvent";
	}
	
	@Override
	public Map<String, Object> getFields() {
		return fields;
	}
	
	@Override
	public Monster spawntype(String spawntype) {
		return this;
	}
	
	@Override
	public Monster spawnpointtag(String spawnpointtag) {
		return this;
	}
	
	@Override
	public Monster spawnprobability(double spawnprobability) {
		return this;
	}
	
	@Override
	public Monster delaybetweenspawns(double delaybetweenspawns) {
		return this;
	}

	@Override
	public Monster spawndistance(int spawndistance) {
		return this;
	}
	
}
