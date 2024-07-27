package com.decker.barotrauma.components;

public class RandomEvents extends EventSet<RandomEvents> {
	
	@Override
	public String getTag() {
		return "Randomevents";
	}
	
	@Override
	protected RandomEvents getThis() {
		return this;
	}
}
