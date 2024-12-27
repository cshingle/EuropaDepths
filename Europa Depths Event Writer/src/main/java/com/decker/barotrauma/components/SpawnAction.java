package com.decker.barotrauma.components;

public class SpawnAction extends AbstractEntity<SpawnAction> {
	
	public SpawnAction(String npcSetIdentifier, String npcidentifier, String targettag, String spawnpointtag, String spawnlocation, boolean requirespawnpointtag, String team) {
		this.getFields().put("npcsetidentifier", npcSetIdentifier);
		this.getFields().put("npcidentifier", npcidentifier);
		this.getFields().put("targettag", targettag);
		this.getFields().put("spawnpointtag", spawnpointtag);
		this.getFields().put("spawnlocation", spawnlocation);
		this.getFields().put("requirespawnpointtag", requirespawnpointtag);
		this.getFields().put("team", team);
	}
	
	@Override
	protected String getTag() {
		return "SpawnAction";
	}
	
	@Override
	protected SpawnAction getThis() {
		return this;
	}
	
	public static SpawnAction beaconBandit() {
		return new SpawnAction("abandonedoutpostnpcs", "bandit", "beacon_bandit", "beacon_bandit", "beaconstation", true, "None");
	}
	
	public static SpawnAction beaconBanditHeavy() {
		return new SpawnAction("abandonedoutpostnpcs", "bandit_heavy", "beacon_bandit", "beacon_bandit", "beaconstation", true, "None");
	}
	
	public static SpawnAction beaconBanditLeader() {
		return new SpawnAction("abandonedoutpostnpcs", "banditleader", "beacon_bandit", "beacon_bandit", "beaconstation", true, "None");
	}
	
	public static SpawnAction beaconBanditLeaderHeavy() {
		return new SpawnAction("abandonedoutpostnpcs", "banditleader_heavy", "beacon_bandit", "beacon_bandit", "beaconstation", true, "None");
	}
	
	public static SpawnAction beaconBanditElite() {
		return new SpawnAction("abandonedoutpostnpcs", "bandit_elite", "beacon_bandit", "beacon_bandit", "beaconstation", true, "None");
	}

}
