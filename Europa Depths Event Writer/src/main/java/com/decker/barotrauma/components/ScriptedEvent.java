package com.decker.barotrauma.components;

import java.util.Map;
import java.util.TreeMap;

public class ScriptedEvent extends AbstractEntity<ScriptedEvent> implements Monster {
	
	public ScriptedEvent(String identifier) {
		this.getFields().put("identifier", identifier);
	}
	
	@Override
	public String getTag() {
		return "ScriptedEvent";
	}
	
	@Override
	protected ScriptedEvent getThis() {
		return this;
	}
	
	protected Map<String, Object> createFields() {
		return new TreeMap<>(new FieldComparator());
	}
	
	public static ScriptedEvent beaconClown() {
		return new ScriptedEvent("beaconclown")
				.add(new SpawnAction(
								"abandonedoutpostnpcs",
								"psychoclown",
								"psychoclown",
								"saferoom",
								"beaconstation",
								true,
								"None"),
						new AfflictionAction("psychoclown", "psychoclown", 100));
	}
	
	public static ScriptedEvent beaconBandits1() {
		return new ScriptedEvent("beaconbandits1").add(
				TriggerEventAction.enableLayers(),
				TriggerEventAction.spawnDivingSuit(),
				TriggerEventAction.spawnDivingSuit(),
				SpawnAction.beaconBandit(),
				SpawnAction.beaconBandit(),
				TriggerEventAction.defense());
	}
	
	public static ScriptedEvent beaconBandits2() {
		return new ScriptedEvent("beaconbandits2").add(
				TriggerEventAction.enableLayers(),
				TriggerEventAction.spawnDivingSuit(),
				TriggerEventAction.spawnDivingSuit(),
				SpawnAction.beaconBanditHeavy(),
				SpawnAction.beaconBandit(),
				TriggerEventAction.defense());
	}
	
	public static ScriptedEvent beaconBandits3() {
		return new ScriptedEvent("beaconbandits3").add(
				TriggerEventAction.enableLayers(),
				TriggerEventAction.spawnCombatDivingSuit(),
				TriggerEventAction.spawnCombatDivingSuit(),
				TriggerEventAction.spawnCombatDivingSuit(),
				SpawnAction.beaconBanditLeader(),
				SpawnAction.beaconBandit(),
				SpawnAction.beaconBandit(),
				TriggerEventAction.defense());
	}
	
	public static ScriptedEvent beaconBandits4() {
		return new ScriptedEvent("beaconbandits4").add(
				TriggerEventAction.enableLayers(),
				TriggerEventAction.spawnCombatDivingSuit(),
				TriggerEventAction.spawnCombatDivingSuit(),
				TriggerEventAction.spawnCombatDivingSuit(),
				SpawnAction.beaconBanditLeaderHeavy(),
				SpawnAction.beaconBanditHeavy(),
				SpawnAction.beaconBandit(),
				TriggerEventAction.defense());
	}
	
	public static ScriptedEvent beaconBandits5() {
		return new ScriptedEvent("beaconbandits5").add(
				TriggerEventAction.enableLayers(),
				TriggerEventAction.spawnAbyssDivingSuit(),
				TriggerEventAction.spawnAbyssDivingSuit(),
				TriggerEventAction.spawnAbyssDivingSuit(),
				SpawnAction.beaconBanditLeaderHeavy(),
				SpawnAction.beaconBanditElite(),
				SpawnAction.beaconBanditElite(),
				SpawnAction.beaconBandit(),
				TriggerEventAction.defense());
	}
	
	@Override
	public Monster spawntype(String spawntype) {
		return null;
	}
	@Override
	public Monster spawnpointtag(String spawnpointtag) {
		return null;
	}
	@Override
	public Monster spawnprobability(double spawnprobability) {
		return null;
	}
	@Override
	public Monster delaybetweenspawns(double delaybetweenspawns) {
		return null;
	}
	@Override
	public Monster spawndistance(int spawndistance) {
		return null;
	}
	
}
