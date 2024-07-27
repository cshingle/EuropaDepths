package com.decker.barotrauma.components;


public class WreckEvent extends SpecialEventSet<WreckEvent> {
	
	public WreckEvent() {
		this.getFields().put("identifier", "wrecks");
		this.getFields().put("perwreck", "true");
		this.getFields().put("chooserandom", "true");
		this.getFields().put("allowatstart", "true");
		this.getFields().put("triggereventcooldown", "false");
	}
	
	@Override
	protected WreckEvent getThis() {
		return this;
	}
	
	@Override
	protected String getSpawnType() {
		return "wreck";
	}
	
	@Override
	protected Double getSpawnprobability() {
		return 1D;
	}
	
	@Override
	protected Double getDelaybetweenspawns() {
		return null;
	}
	
	@Override
	protected Boolean getTriggereventcooldown() {
		return false;
	}
}
