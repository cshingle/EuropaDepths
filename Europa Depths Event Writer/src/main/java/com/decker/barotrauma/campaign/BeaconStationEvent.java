package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;

public class BeaconStationEvent extends SpecialEventSet<BeaconStationEvent> {
	
	public BeaconStationEvent() {
		fields.put("identifier", "beaconstation_presets");
		fields.put("chooserandom", "false");
		fields.put("triggereventcooldown", "false");
		fields.put("allowatstart", "true");
	}
	
	@Override
	public void renderComment(int depth, Writer writer) throws IOException {
		writer.append("\n");
		writer.append(this.indent(depth));
		writer.append("<!-- Populate the beacon stations - Only spawn if there's spawnpoint with tag 'beacon_***' present! -->\n");
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
		return "beacon_mudraptor";
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
