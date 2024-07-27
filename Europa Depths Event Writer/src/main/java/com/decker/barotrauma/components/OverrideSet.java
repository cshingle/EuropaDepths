package com.decker.barotrauma.components;

public class OverrideSet extends EventSet<OverrideSet> {
	
	public String getTag() {
		return "Override";
	}
	
	@Override
	protected OverrideSet getThis() {
		return this;
	}
}
