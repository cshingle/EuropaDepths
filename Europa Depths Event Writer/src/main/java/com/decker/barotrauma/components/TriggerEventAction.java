package com.decker.barotrauma.components;

public class TriggerEventAction extends AbstractEntity<TriggerEventAction> {
	
	public TriggerEventAction(String identifier) {
		this.getFields().put("identifier", identifier);
	}
	
	@Override
	protected String getTag() {
		return "TriggerEventAction";
	}
	
	@Override
	protected TriggerEventAction getThis() {
		return this;
	}
	
	public static TriggerEventAction enableLayers() {
		return new TriggerEventAction("beaconbandit_enablelayers");
	}
	
	public static TriggerEventAction spawnDivingSuit() {
		return new TriggerEventAction("beaconbandit_spawndivingsuit");
	}
	
	public static TriggerEventAction spawnCombatDivingSuit() {
		return new TriggerEventAction("beaconbandit_spawncombatdivingsuit");
	}
	
	public static TriggerEventAction spawnAbyssDivingSuit() {
		return new TriggerEventAction("beaconbandit_spawnabyssdivingsuit");
	}
	
	public static TriggerEventAction defense() {
		return new TriggerEventAction("beaconbandit_defense");
	}
}
