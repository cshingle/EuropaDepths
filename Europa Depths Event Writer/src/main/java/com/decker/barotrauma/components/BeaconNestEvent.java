package com.decker.barotrauma.components;

public class BeaconNestEvent extends SpecialEventSet<BeaconNestEvent> {
	
	private final String spawnType;
	private final String spawnPointTag;
	
	public BeaconNestEvent(String identifier, String requiredlayer, int commonness, String spawnType, String spawnPointTag) {
		this.spawnType = spawnType;
		this.spawnPointTag = spawnPointTag;
		
		this.getFields().put("identifier", identifier);
		this.getFields().put("requiredlayer", requiredlayer);
		this.getFields().put("chooserandom", "false");
		this.getFields().put("triggereventcooldown", "false");
		this.getFields().put("allowatstart", "true");
		this.getFields().put("commonness", commonness);
		
		this.add(new ScriptedEvent("nestlayer").add(
				new LayerAction(requiredlayer)
		));
	}
	
	public String getSpawnType() {
		return spawnType;
	}
	
	public String getSpawnpointtag() {
		return spawnPointTag;
	}
	
	@Override
	protected BeaconNestEvent getThis() {
		return this;
	}
	
	public static BeaconNestEvent crawlerNest(String identifier, int commonness) {
		return new BeaconNestEvent(identifier, "crawler_nest", commonness, "beaconstation", "beacon_crawler");
	}
	
	public static BeaconNestEvent mudraptorNest(String identifier, int commonness) {
		return new BeaconNestEvent(identifier, "mudraptor_nest", commonness, "beaconstation", "beacon_mudraptor");
	}
	
}
