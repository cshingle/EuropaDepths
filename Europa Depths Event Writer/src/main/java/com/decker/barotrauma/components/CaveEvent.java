package com.decker.barotrauma.components;

import java.io.IOException;
import java.io.Writer;

public class CaveEvent extends SpecialEventSet<CaveEvent> {
	
	public CaveEvent() {
		this.getFields().put("identifier", "caves");
		this.getFields().put("chooserandom", "true");
		this.getFields().put("percave", "true");
		this.getFields().put("triggereventcooldown", "false");
		this.getFields().put("allowatstart", "true");
	}
	
	@Override
	public String getSpawnType() {
		return "cave";
	}
	
	@Override
	protected CaveEvent getThis() {
		return this;
	}
	
	public CaveEvent chooseRandom(boolean chooseRandom) {
		if (chooseRandom) {
			this.getFields().put("chooserandom", Boolean.valueOf(chooseRandom).toString());
		} else {
			this.getFields().remove("chooserandom");
		}
		return this;
	}
	
	@Override
	public void renderComment(int depth, Writer writer) throws IOException {
		writer.append("\n");
		writer.append(this.indent(depth));
		writer.append("<!-- Populate the caves -->\n");
	}
}
