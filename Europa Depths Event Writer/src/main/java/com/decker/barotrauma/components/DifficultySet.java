package com.decker.barotrauma.components;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.TreeMap;

public class DifficultySet extends EventSet<DifficultySet> {
	
	int id;
	String comment = null;
	Map<String, Object> fields = new TreeMap<>(new FieldComparator());
	
	public DifficultySet(int id) {
		this.id = id;
		fields.put("identifier", "");
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
	
	public DifficultySet biome(String biome) {
		this.getFields().put("biome", biome);
		return this;
	}
	
	public DifficultySet minleveldifficulty(int minleveldifficulty) {
		this.getFields().put("minleveldifficulty", Integer.toString(minleveldifficulty));
		return this;
	}
	
	public DifficultySet maxleveldifficulty(int maxleveldifficulty) {
		this.getFields().put("maxleveldifficulty", Integer.toString(maxleveldifficulty));
		return this;
	}
	
	public DifficultySet comment(String comment) {
		this.comment = comment;
		return this;
	}
	
	@Override
	protected DifficultySet getThis() {
		return this;
	}
	
	protected Map<String, Object> createFields() {
		return new TreeMap<>(new FieldComparator());
	}
}
