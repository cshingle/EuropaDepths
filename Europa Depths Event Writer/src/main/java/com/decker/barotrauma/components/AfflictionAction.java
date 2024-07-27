package com.decker.barotrauma.components;

public class AfflictionAction extends AbstractEntity<AfflictionAction> {
	
	public AfflictionAction(String targetTag, String affliction, int strength) {
		this.getFields().put("targettag", targetTag);
		this.getFields().put("affliction", affliction);
		this.getFields().put("strength", strength);
	}
	
	@Override
	public String getTag() {
		return "AfflictionAction";
	}
	
	@Override
	protected AfflictionAction getThis() {
		return this;
	}
}
