package com.decker.barotrauma.components;

import java.io.IOException;
import java.io.Writer;

public class Comment implements Entity {
	
	private String text;
	
	public Comment() {
		this(null);
	}
	
	public Comment(String text) {
		this.text = text;
	}
	
	@Override
	public void render(int depth, Writer writer) throws IOException {
		if (this.text == null) {
			writer.write("\n");
		} else {
			writer.append(this.indent(depth));
			writer.append(String.format("<!-- %s -->", this.text));
		}
	}
	
	protected String indent(int depth) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			sb.append("\t");
		}
		return sb.toString();
	}
}
