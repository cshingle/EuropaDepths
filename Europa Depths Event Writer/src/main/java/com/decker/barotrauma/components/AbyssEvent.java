package com.decker.barotrauma.components;

import java.io.IOException;
import java.io.Writer;

public class AbyssEvent extends SpecialEventSet<AbyssEvent> {
	
	protected String comment;
	
	public AbyssEvent() {
		this("abyss");
	}
	
	public AbyssEvent(String identifier) {
		this.getFields().put("identifier", identifier);
		this.getFields().put("chooserandom", "true");
		this.getFields().put("allowatstart", "true");
		this.getFields().put("triggereventcooldown", "false");
		this.getFields().put("allowatstart", "true");
		this.getFields().put("disableinhuntinggrounds", "true");
		

		if (identifier.equals("abyss")) {
			this.comment = "<!-- Populate the abyss -->\n";
			this.getFields().put("resettime", "900");
		}
	}
	
	public AbyssEvent identifier(String identifier) {
		this.getFields().put("identifier", identifier);
		return this;
	}
	
	public AbyssEvent mindistancetraveled(double mindistancetraveled) {
		this.getFields().put("allowatstart", "false");
		this.getFields().put("mindistancetraveled", Double.toString(mindistancetraveled));
		return this;
	}
	
	public AbyssEvent chooserandom(boolean chooserandom) {
		this.getFields().put("chooserandom", Boolean.toString(chooserandom));
		return this;
	}
	
	public AbyssEvent resettime(int resettime) {
		this.getFields().put("resettime", Integer.toString(resettime));
		return this;
	}
	
	public AbyssEvent minmissiontime(int minmissiontime) {
		this.getFields().put("minmissiontime", Integer.toString(minmissiontime));
		return this;
	}
	
	public AbyssEvent disableinhuntinggrounds(boolean disableinhuntinggrounds) {
		this.getFields().put("disableinhuntinggrounds", Boolean.toString(disableinhuntinggrounds));
		return this;
	}
	
	@Override
	public void renderComment(int depth, Writer writer) throws IOException {
		if (comment != null) {
			writer.append("\n");
			writer.append(this.indent(depth));
			writer.append(comment);
		}
	}
	
	@Override
	protected AbyssEvent getThis() {
		return this;
	}
	
	@Override
	protected String getSpawnType() {
		return "abyss";
	}
}
