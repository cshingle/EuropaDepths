package com.decker.barotrauma.components;

public class BeaconStationEncountersEvent extends EventSet<BeaconStationEncountersEvent> {
	
	private final BeaconStationEncounterSpawn encounterSpawn = new BeaconStationEncounterSpawn();
	
	public BeaconStationEncountersEvent(double disconnectWireProbability, double damageWallProbability, double damageDeviceProbability, int commonness) {
		this.getFields().put("identifier", "beaconstation_encounters");
		this.getFields().put("chooserandom", "false");
		this.getFields().put("triggereventcooldown", "false");
		this.getFields().put("allowatstart", "true");
		this.getFields().put("commonness", commonness);
		
		this.add(new ScriptedEvent("encounterlayer").add(
						new LayerAction("encounters"),
						new DamageBeaconStationAction(disconnectWireProbability, damageWallProbability, damageDeviceProbability)
				),
				this.encounterSpawn);
	}
	
	public BeaconStationEncountersEvent monsters(Monster... monsters) {
		this.encounterSpawn.monsters(monsters);
		return this;
	}
	
	@Override
	protected BeaconStationEncountersEvent getThis() {
		return this;
	}
	
	public static class DamageBeaconStationAction extends AbstractEntity<DamageBeaconStationAction> {
		
		public DamageBeaconStationAction(double disconnectWireProbability, double damageWallProbability, double damageDeviceProbability) {
			this.getFields().put("DisconnectWireProbability", trimZeros(disconnectWireProbability));
			this.getFields().put("DamageWallProbability", trimZeros(damageWallProbability));
			this.getFields().put("DamageDeviceProbability", trimZeros(damageDeviceProbability));
		}
		
		@Override
		protected String getTag() {
			return "DamageBeaconStationAction";
		}
		
		@Override
		protected DamageBeaconStationAction getThis() {
			return this;
		}
	}
	
	public static class BeaconStationEncounterSpawn extends SpecialEventSet<BeaconStationEncounterSpawn> {
		public BeaconStationEncounterSpawn() {
			this.getFields().put("identifier", "beaconstation_encounterspawn");
			this.getFields().put("chooserandom", "true");
			this.getFields().put("triggereventcooldown", "false");
			this.getFields().put("allowatstart", "true");
		}
		@Override
		protected BeaconStationEncounterSpawn getThis() {
			return this;
		}
		
		@Override
		protected String getSpawnType() {
			return "beaconstation";
		}
		
		protected String getSpawnpointtag() {
			return "encounter";
		}
	}
}
