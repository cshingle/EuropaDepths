package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;

public class WreckEncountersEvent extends SpecialEventSet<WreckEncountersEvent> {
	
	public WreckEncountersEvent() {
		fields.put("identifier", "wreck_encounters");
		fields.put("chooserandom", "true");
		fields.put("perwreck", "true");
		fields.put("triggereventcooldown", "false");
		fields.put("allowatstart", "true");
	}
	
	@Override
	public void renderComment(int depth, Writer writer) throws IOException {
		writer.append("\n");
		writer.append(this.indent(depth));
		writer.append("<!-- Populate the wrecks -->\n");
	}
	
	@Override
	protected WreckEncountersEvent getThis() {
		return this;
	}
	
	@Override
	protected String getSpawnType() {
		return "wreck";
	}
	
	@Override
	protected String getSpawnpointtag() {
		return "encounter";
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
