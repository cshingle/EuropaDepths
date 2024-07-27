package com.decker.barotrauma.components;

import java.util.Arrays;
import java.util.List;

public class RuinEncounters extends EventSet<RuinEncounters> implements Monster {
	
	public RuinEncounters() {
		this.getFields().put("identifier", "ruin_encounters");
		this.getFields().put("chooserandom", "true");
		this.getFields().put("triggereventcooldown", "false");
		this.getFields().put("allowatstart", "true");
	}
	
	public RuinEncounters monsters(Monster... monsterEvents) {
		for (Monster monster : Arrays.asList(monsterEvents)) {
			monster.spawntype("ruin");
			if (monster instanceof MonsterSet monsterSet) {
				monsterSet.allowatstart(true);
				monsterSet.triggereventcooldown(false);
			}
			
			this.add(monster);
		}
		return this;
	}
	
	public RuinEncounters allowatstart(boolean allowatstart) {
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
	
	@Override
	public Monster spawnpointtag(String spawnpointtag) {
		this.getMonsters().stream()
				.forEach(monster -> monster.spawnpointtag(spawnpointtag));
		return this;
	}
	
	@Override
	public Monster spawnprobability(double spawnprobability) {
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
	protected RuinEncounters getThis() {
		return this;
	}
}
