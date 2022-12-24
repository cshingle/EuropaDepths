package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;

public class BeaconStationEncountersEvent extends SpecialEventSet<BeaconStationEncountersEvent> {
	
	public BeaconStationEncountersEvent() {
		fields.put("identifier", "beaconstation_encounters");
		fields.put("chooserandom", "true");
		fields.put("triggereventcooldown", "false");
		fields.put("allowatstart", "true");
	}
	
	@Override
	public void renderComment(int depth, Writer writer) throws IOException {
		writer.append("\n");
		writer.append(this.indent(depth));
		writer.append("<!-- Populate the beacon stations - Only spawn if there's spawnpoint with tag 'encounter' present! -->\n");
	}
	
	@Override
	protected BeaconStationEncountersEvent getThis() {
		return this;
	}
	
	@Override
	protected String getSpawnType() {
		return "beaconstation";
	}
	
	@Override
	protected String getSpawnpointtag() {
		return "encounter";
	}
	
	@Override
	protected boolean getAllowAtStart() {
		return true;
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
