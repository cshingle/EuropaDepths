package com.decker.barotrauma.components;

import java.io.IOException;
import java.io.Writer;
import java.util.*;

public abstract class AbstractEntity<T extends AbstractEntity> implements Entity {
	
	private final List<Entity> entities = new ArrayList<>();
	private final Map<String, Object> fields;
	
	protected AbstractEntity() {
		this.fields = this.createFields();
	}
	
	protected abstract String getTag();
	
	public T add(Entity... entities) {
		this.entities.addAll(Arrays.asList(entities));
		return this.getThis();
	}
	
	public T add(List<Entity> entities) {
		this.entities.addAll(entities);
		return this.getThis();
	}
	
	public List<Entity> getEntities() {
		return this.entities;
	}
	
	protected void renderComment(int depth, Writer writer) throws IOException {
	}
	
	public void render(int depth, Writer writer) throws IOException {
		this.renderComment(depth, writer);
		writer.write(this.indent(depth));
		renderStartTag(writer);
		
		if (!this.entities.isEmpty()) {
			for (Entity entity : this.entities) {
				entity.render(depth + 1, writer);
			}
			writer.write(this.indent(depth));
			renderEndTag(writer);
		}
	}
	
	protected void renderStartTag(Writer writer) throws IOException {
		if (!this.getFields().isEmpty()) {
			writer.write(String.format("<%s", this.getTag()));
			for (Map.Entry<String, Object> entry : this.getFields().entrySet()) {
				writer.write(" ");
				writer.write(entry.getKey());
				writer.write("=\"");
				// We may need to format different objects differently
				writer.write(entry.getValue().toString());
				writer.write("\"");
			}
			if (this.entities.isEmpty()) {
				writer.write(" />\n");
			} else {
				writer.write(">\n");
			}
		} else {
			if (this.entities.isEmpty()) {
				writer.write(String.format("</%s>\n", this.getTag()));
			} else {
				writer.write(String.format("<%s>\n", this.getTag()));
			}
		}
		
	}
	
	protected void renderEndTag(Writer writer) throws IOException {
		if (!this.entities.isEmpty()) {
			writer.write(String.format("</%s>\n", this.getTag()));
		}
	}
	
	protected Map<String, Object> getFields() {
		return this.fields;
	}
	
	protected String indent(int depth) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			sb.append("\t");
		}
		return sb.toString();
	}
	
	protected abstract T getThis();
	
	protected Map<String, Object> createFields() {
		return new LinkedHashMap<>();
	}
	
	protected String trimZeros(double value) {
		String stringValue = Double.toString(value).replaceAll("\\.0$", "");
		return stringValue;
	}
}
