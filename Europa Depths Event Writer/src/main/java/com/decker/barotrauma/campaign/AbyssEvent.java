package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;

public class AbyssEvent extends SpecialEventSet<AbyssEvent> {
	
	protected String comment;
	
	public AbyssEvent() {
		this("abyss");
	}
	
	public AbyssEvent(String identifier) {
		fields.put("identifier", identifier);
		fields.put("chooserandom", "true");
		fields.put("allowatstart", "true");
		fields.put("triggereventcooldown", "false");
		fields.put("allowatstart", "true");
		fields.put("disableinhuntinggrounds", "true");
		

		if (identifier.equals("abyss")) {
			this.comment = "<!-- Populate the abyss -->\n";
			fields.put("resettime", "900");
		}
	}
	
	public AbyssEvent identifier(String identifier) {
		fields.put("identifier", identifier);
		return this;
	}
	
	public AbyssEvent mindistancetraveled(double mindistancetraveled) {
		fields.put("allowatstart", "false");
		fields.put("mindistancetraveled", Double.toString(mindistancetraveled));
		return this;
	}
	
	public AbyssEvent chooserandom(boolean chooserandom) {
		this.fields.put("chooserandom", Boolean.toString(chooserandom));
		return this;
	}
	
	public AbyssEvent resettime(int resettime) {
		this.fields.put("resettime", Integer.toString(resettime));
		return this;
	}
	
	public AbyssEvent minmissiontime(int minmissiontime) {
		fields.put("minmissiontime", Integer.toString(minmissiontime));
		return this;
	}
	
	public AbyssEvent disableinhuntinggrounds(boolean disableinhuntinggrounds) {
		fields.put("disableinhuntinggrounds", Boolean.toString(disableinhuntinggrounds));
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
