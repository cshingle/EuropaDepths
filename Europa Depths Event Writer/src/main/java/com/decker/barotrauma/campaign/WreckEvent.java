package com.decker.barotrauma.campaign;

public class WreckEvent extends SpecialEventSet<WreckEvent> {
	
	public WreckEvent() {
		fields.put("identifier", "wrecks");
		fields.put("perwreck", "true");
		fields.put("chooserandom", "true");
		fields.put("allowatstart", "true");
		fields.put("triggereventcooldown", "false");
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
