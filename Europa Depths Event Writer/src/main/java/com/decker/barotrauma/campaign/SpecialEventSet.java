package com.decker.barotrauma.campaign;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public abstract class SpecialEventSet<T extends Event> extends EventSet {
	protected final Map<String, Object> fields = new TreeMap<>(new FieldComparator());
	
	public T monsters(Monster... monsters) {
		for (Monster monster : Arrays.asList(monsters)) {
			if (this.getSpawnType() != null) {
				monster.spawntype(this.getSpawnType());
			}
			if (this.getSpawnpointtag() != null) {
				monster.spawnpointtag(getSpawnpointtag());
			}
			if (this.getAllowAtStart() && monster instanceof MonsterSet) {
				((MonsterSet) monster).allowatstart(true);
			}
			if (this.getSpawnlocation() != null && monster instanceof ScriptedEvent) {
				((ScriptedEvent) monster).spawnlocation(this.getSpawnlocation());
			}
			if (this.getSpawnprobability() != null) {
				monster.spawnprobability(this.getSpawnprobability());
			}
			if (this.getDelaybetweenspawns() != null) {
				monster.delaybetweenspawns(this.getDelaybetweenspawns());
			}
			if (monster instanceof MonsterSet) {
				((MonsterSet) monster).triggereventcooldown(getTriggereventcooldown());
			}
			
			this.events.add(monster);
		}
		return getThis();
	}
	
	protected abstract T getThis();
	
	protected abstract String getSpawnType();
	
	protected String getSpawnpointtag() {
		return null;
	}
	
	protected String getSpawnlocation() {
		return null;
	}
	
	protected boolean getAllowAtStart() {
		return true;
	}
	
	protected Double getSpawnprobability() {
		return null;
	}
	
	protected Double getDelaybetweenspawns() {
		return 1D;
	}
	
	protected Boolean getTriggereventcooldown() {
		return null;
	}
	
	@Override
	public Map<String, Object> getFields() {
		return this.fields;
	}
}
