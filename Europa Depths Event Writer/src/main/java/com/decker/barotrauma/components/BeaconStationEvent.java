package com.decker.barotrauma.components;

import java.io.IOException;
import java.io.Writer;

public class BeaconStationEvent extends SpecialEventSet<BeaconStationEvent> {
	
	public BeaconStationEvent() {
		this.getFields().put("identifier", "beaconstation_populate");
		this.getFields().put("chooserandom", "true");
		this.getFields().put("triggereventcooldown", "false");
		this.getFields().put("allowatstart", "true");
	}
	
	@Override
	public void renderComment(int depth, Writer writer) throws IOException {
		writer.append("\n");
		writer.append(this.indent(depth));
		writer.append("<!-- Populate the beacon stations -->\n");
	}
	
	@Override
	protected BeaconStationEvent getThis() {
		return this;
	}
	
	@Override
	protected String getSpawnType() {
		return "beaconstation";
	}
	
	@Override
	protected String getSpawnpointtag() {
		return null;
	}
	
	@Override
	protected String getSpawnlocation() {
		return "beaconstation";
	}
	
	@Override
	protected Double getSpawnprobability() {
		return 1D;
	}
	
	@Override
	protected Double getDelaybetweenspawns() {
		return null;
	}
	

}
