package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public abstract class EventSet implements Event {
	
	protected List<Event> events = new ArrayList<>();
	
	protected EventSet() {
	}
	
	public EventSet extend(Event... events) {
		this.events.addAll(Arrays.asList(events));
		return this;
	}
	
	public EventSet extend(List<Event> events) {
		this.events.addAll(events);
		return this;
	}
	
	public String getTag() {
		return "EventSet";
	}
	
	public void renderComment(int depth, Writer writer) throws IOException {
	}
	
	public String pre() {
		return String.format("<%s%s>\n", this.getTag(), this.fields(this.getFields()).stripTrailing());
	}
	
	public String post() {
		return String.format("</%s>\n", this.getTag());
	}
	
	@Override
	public void render(int depth, Writer writer) throws IOException {
		this.renderComment(depth, writer);
		
		if (!this.events.isEmpty()) {
			writer.write(this.indent(depth));
			writer.write(this.pre());
			for (Event event : this.events) {
				event.render(depth + 1, writer);
			}
			writer.write(this.indent(depth));
			writer.write(this.post());
		} else {
			writer.write(this.indent(depth));
			writer.write(this.pre().replaceAll(">\\\n$", " />\n"));
		}
	}
	
	public Map<String, Object> getFields() {
		return null;
	}
}
