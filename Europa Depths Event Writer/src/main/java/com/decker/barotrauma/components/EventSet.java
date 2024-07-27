package com.decker.barotrauma.components;

public abstract class EventSet<T extends EventSet> extends AbstractEntity<T> {
	
	@Override
	protected String getTag() {
		return "EventSet";
	}
	
	public T identifier(String identifier) {
		this.getFields().put("identifier", identifier);
		return this.getThis();
	}
	
}
