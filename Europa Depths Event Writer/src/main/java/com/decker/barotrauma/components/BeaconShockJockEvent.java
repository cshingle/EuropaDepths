package com.decker.barotrauma.components;

public class BeaconShockJockEvent extends SpecialEventSet<BeaconShockJockEvent> {
	
	public BeaconShockJockEvent(TriggerEventAction triggerEventAction, int commonness) {
		this.getFields().put("identifier", "empty");
		this.getFields().put("chooserandom", "false");
		this.getFields().put("triggereventcooldown", "false");
		this.getFields().put("allowatstart", "true");
		this.getFields().put("commonness", commonness);
		
		this.add(triggerEventAction);
	}
	
	public String getSpawnType() {
		return "beaconstation";
	}
	
	public String getSpawnpointtag() {
		return "";
	}
	
	@Override
	protected BeaconShockJockEvent getThis() {
		return this;
	}
	
	public static BeaconShockJockEvent shockJock2Event(int commonness) {
		return new BeaconShockJockEvent(new TriggerEventAction("shockjock2"), commonness);
	}
	
}
