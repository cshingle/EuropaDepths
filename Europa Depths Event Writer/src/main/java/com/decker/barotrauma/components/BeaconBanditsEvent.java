package com.decker.barotrauma.components;

public class BeaconBanditsEvent extends EventSet<BeaconBanditsEvent> {
	
	public BeaconBanditsEvent(TriggerEventAction triggerEventAction, int commonness) {
		this.getFields().put("identifier", "bandits");
		this.getFields().put("requiredspawnpointtag", "beacon_bandit");
		this.getFields().put("chooserandom", "false");
		this.getFields().put("triggereventcooldown", "false");
		this.getFields().put("allowatstart", "true");
		this.getFields().put("commonness", commonness);
		
		this.add(new ScriptedEvent("beaconbandit").add(
				triggerEventAction
		));
	}
	
	@Override
	protected BeaconBanditsEvent getThis() {
		return this;
	}
	
	public static BeaconBanditsEvent beaconBandits1(int commoness) {
		return new BeaconBanditsEvent(new TriggerEventAction("beaconbandits1"), commoness);
	}
	
	public static BeaconBanditsEvent beaconBandits2(int commoness) {
		return new BeaconBanditsEvent(new TriggerEventAction("beaconbandits2"), commoness);
	}
	
	public static BeaconBanditsEvent beaconBandits3(int commoness) {
		return new BeaconBanditsEvent(new TriggerEventAction("beaconbandits3"), commoness);
	}
	
	public static BeaconBanditsEvent beaconBandits4(int commoness) {
		return new BeaconBanditsEvent(new TriggerEventAction("beaconbandits4"), commoness);
	}
	
	public static BeaconBanditsEvent beaconBandits5(int commoness) {
		return new BeaconBanditsEvent(new TriggerEventAction("beaconbandits5"), commoness);
	}
	
}
