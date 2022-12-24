package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;

public class RuinEvent extends SpecialEventSet<RuinEvent> {
	
	public RuinEvent() {
		fields.put("identifier", "ruins");
		fields.put("chooserandom", "false");
		fields.put("perruin", "true");
		fields.put("allowatstart", "true");
		fields.put("triggereventcooldown", "false");
	}
	
	@Override
	public void renderComment(int depth, Writer writer) throws IOException {
		writer.append("\n");
		writer.append(this.indent(depth));
		writer.append("<!-- populate the ruins -->\n");
	}
	
	@Override
	protected RuinEvent getThis() {
		return this;
	}
	
	@Override
	protected String getSpawnType() {
		return "ruin";
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
