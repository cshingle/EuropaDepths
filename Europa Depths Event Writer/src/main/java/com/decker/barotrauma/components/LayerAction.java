package com.decker.barotrauma.components;

public class LayerAction extends AbstractEntity<LayerAction> {
	
	public LayerAction(String layer) {
		this.getFields().put("layer", layer);
		this.getFields().put("enabled", "true");
	}
	
	@Override
	public String getTag() {
		return "LayerAction";
	}
	
	@Override
	protected LayerAction getThis() {
		return this;
	}
	
}
