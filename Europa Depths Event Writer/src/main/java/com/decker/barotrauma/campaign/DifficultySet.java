package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.TreeMap;

public class DifficultySet extends EventSet {
	
	int id;
	String comment = null;
	Map<String, Object> fields = new TreeMap<>(new FieldComparator());
	
	public DifficultySet(int id) {
		this.id = id;
		fields.put("identifier", "");
		// fields.put("biome", "");
		fields.put("chooserandom", "false");
		fields.put("allowatstart", "true");
		fields.put("campaign", "true");
	}
	
	@Override
	public void renderComment(int depth, Writer writer) throws IOException {
		writer.write(this.indent(depth));
		writer.write("\n");
		writer.write(this.indent(depth));
		writer.write("<!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->\n");
		writer.write(this.indent(depth));
		writer.write(String.format("<!--                               Set %s                                       -->\n", this.id));
		writer.write(this.indent(depth));
		writer.write("<!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->\n");
		if (comment != null) {
			writer.write(this.indent(depth));
			writer.write(String.format("<!-- %s -->\n", this.comment));
		}
	}
	
	public DifficultySet identifier(String identifier) {
		this.fields.put("identifier", identifier);
		return this;
	}
	
	public DifficultySet biome(String biome) {
		this.fields.put("biome", biome);
		return this;
	}
	
	public DifficultySet minleveldifficulty(int minleveldifficulty) {
		this.fields.put("minleveldifficulty", Integer.toString(minleveldifficulty));
		return this;
	}
	
	public DifficultySet maxleveldifficulty(int maxleveldifficulty) {
		this.fields.put("maxleveldifficulty", Integer.toString(maxleveldifficulty));
		return this;
	}
	
	public DifficultySet comment(String comment) {
		this.comment = comment;
		return this;
	}
	
	@Override
	public Map<String, Object> getFields() {
		return this.fields;
	}
}
