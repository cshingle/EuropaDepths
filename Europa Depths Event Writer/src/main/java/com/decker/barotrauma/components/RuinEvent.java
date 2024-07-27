package com.decker.barotrauma.components;


import java.io.IOException;
import java.io.Writer;

public class RuinEvent extends SpecialEventSet<RuinEvent> {
	
	public RuinEvent() {
		this.getFields().put("identifier", "ruins");
		this.getFields().put("chooserandom", "false");
		this.getFields().put("perruin", "true");
		this.getFields().put("allowatstart", "true");
		this.getFields().put("triggereventcooldown", "false");
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
