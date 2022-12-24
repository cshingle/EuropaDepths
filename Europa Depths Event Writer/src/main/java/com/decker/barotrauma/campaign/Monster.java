package com.decker.barotrauma.campaign;

import java.util.Map;

public interface Monster extends Event {
	
	public Monster spawntype(String spawntype);
	
	public Monster spawnpointtag(String spawnpointtag);
	
	public Monster spawnprobability(double spawnprobability);
	
	public Monster delaybetweenspawns(double delaybetweenspawns);
	
	public Monster spawndistance(int spawndistance);
	
	public String getTag();
	
	public Map<String, Object> getFields();


}
