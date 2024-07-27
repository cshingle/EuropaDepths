package com.decker.barotrauma.components;

public interface Monster extends Entity {
	
	public Monster spawntype(String spawntype);
	
	public Monster spawnpointtag(String spawnpointtag);
	
	public Monster spawnprobability(double spawnprobability);
	
	public Monster delaybetweenspawns(double delaybetweenspawns);
	
	public Monster spawndistance(int spawndistance);
	
}
