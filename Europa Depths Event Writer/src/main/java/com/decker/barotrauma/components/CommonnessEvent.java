package com.decker.barotrauma.components;

import java.util.Arrays;

public class CommonnessEvent extends AbstractEntity<CommonnessEvent> {
	
	public CommonnessEvent(String... biomes) {
		this.getFields().put("commonness", trimZeros(1d));
		for (String biome : Arrays.asList(biomes)) {
			this.leveltype(biome, 1d);
		}
	}
	
	public CommonnessEvent leveltype(String biome, double commonness) {
		this.getFields().put("commonness", trimZeros(0d));
		this.add(new LevelTypeOverride(biome, commonness));
		return this;
	}
	
	@Override
	protected String getTag() {
		return "Commonness";
	}
	
	@Override
	protected CommonnessEvent getThis() {
		return this;
	}
	
	public static class LevelTypeOverride extends AbstractEntity<LevelTypeOverride> {
		
		public LevelTypeOverride(String levelType, double commonness) {
			this.getFields().put("leveltype", levelType);
			this.getFields().put("commonness", trimZeros(commonness));
		}
		
		@Override
		protected String getTag() {
			return "Override";
		}
		
		@Override
		protected LevelTypeOverride getThis() {
			return this;
		}
	}
}
