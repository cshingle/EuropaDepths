package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;

public class CaveEvent extends SpecialEventSet<CaveEvent> {
	
	public CaveEvent() {
		fields.put("identifier", "caves");
		fields.put("chooserandom", "true");
		fields.put("percave", "true");
		fields.put("triggereventcooldown", "false");
		fields.put("allowatstart", "true");
	}
	
	@Override
	public String getSpawnType() {
		return "cave";
	}
	
	@Override
	protected CaveEvent getThis() {
		return this;
	}
	
	@Override
	public void renderComment(int depth, Writer writer) throws IOException {
		writer.append("\n");
		writer.append(this.indent(depth));
		writer.append("<!-- Populate the caves -->\n");
	}
}
