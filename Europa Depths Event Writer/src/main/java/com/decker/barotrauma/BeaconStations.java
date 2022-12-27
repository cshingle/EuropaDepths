package com.decker.barotrauma;

import com.decker.barotrauma.campaign.BeaconStationEncountersEvent;
import com.decker.barotrauma.campaign.BeaconStationEvent;
import com.decker.barotrauma.campaign.Character;
import com.decker.barotrauma.campaign.MonsterEvent;
import com.decker.barotrauma.campaign.MonsterSet;
import com.decker.barotrauma.campaign.ScriptedEvent;
import com.decker.barotrauma.campaign.SpawnAction;

public class BeaconStations {
	
	public static BeaconStationEvent coldCaverns() {
		return new BeaconStationEvent().monsters(
				new MonsterEvent(Character.Crawler, 2, 4),
				new MonsterEvent(Character.Mudraptor_unarmored, 2, 4),
				new ScriptedEvent("beaconbandit").actions(
						new SpawnAction("abandonedoutpostnpcs", "bandit", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcs", "banditbrute", "beacon_bandit", "beacon_bandit")));
	}
	
	public static BeaconStationEncountersEvent coldCavernsEncounters() {
		return new BeaconStationEncountersEvent().monsters(
				new MonsterSet("husks", false, 10).monsters(
						new MonsterEvent(Character.Husk, 2, 3),
						new MonsterEvent(Character.Crawlerhusk, 2, 3)),
				new MonsterSet("crawlers", false, 10).monsters(
						new MonsterEvent(Character.Crawler, 3, 4)),
				new MonsterSet("mudraptors", false, 5).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 3)));
	}
	
	public static BeaconStationEvent europanRidge() {
		return new BeaconStationEvent().monsters(
				new MonsterEvent(Character.Crawler, 3, 4),
				new MonsterEvent(Character.Mudraptor_unarmored, 2, 4),
				new ScriptedEvent("beaconbandit").actions(
						new SpawnAction("abandonedoutpostnpcs", "bandit", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcs", "banditbrute", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcs", "banditbrute", "beacon_bandit", "beacon_bandit")));
	}
	
	public static BeaconStationEncountersEvent europanRidgeEncounters() {
		return new BeaconStationEncountersEvent().monsters(
				new MonsterSet("husks", false, 10).monsters(
						new MonsterEvent(Character.Husk, 2, 3),
						new MonsterEvent(Character.Crawlerhusk, 2, 3)),
				new MonsterSet("crawlers", false, 10).monsters(
						new MonsterEvent(Character.Crawler, 3, 4)),
				new MonsterSet("mudraptors", false, 5).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 3)));
	}
	
	public static BeaconStationEvent aphoticPlateau() {
		return new BeaconStationEvent().monsters(
				new MonsterEvent(Character.Crawler, 3, 5),
				new MonsterEvent(Character.Mudraptor_unarmored, 3, 4),
				new MonsterEvent(Character.Bonethresher_cave, 1, 2),
				new ScriptedEvent("beaconbandit").actions(
						new SpawnAction("abandonedoutpostnpcsdire", "banditleader", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "bandit", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "bandit", "banditmedic", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "banditbrute", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "banditbrute", "beacon_bandit", "beacon_bandit")));
	}
	
	public static BeaconStationEncountersEvent aphoticPlateauEncounters() {
		return new BeaconStationEncountersEvent().monsters(
				new MonsterSet("husks", false, 10).monsters(
						new MonsterEvent(Character.Husk, 3, 5),
						new MonsterEvent(Character.Crawlerhusk, 3, 5)),
				new MonsterSet("crawlers", false, 10).monsters(
						new MonsterEvent(Character.Crawler, 3, 5)),
				new MonsterSet("crawlers_veteran", false, 5).monsters(
						new MonsterEvent(Character.Crawler, 3, 5),
						new MonsterEvent(Character.Crawler_veteran, 1, 3)),
				new MonsterSet("mudraptors", false, 10).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 3)),
				new MonsterSet("mudraptors_veteran", false, 5).monsters(
						new MonsterEvent(Character.Mudraptor, 2, 3),
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3)),
				new MonsterSet("clown", false, 5).monsters(
						new ScriptedEvent("beaconclown")));
	}
	
	public static BeaconStationEvent greatSea() {
		return new BeaconStationEvent().monsters(
				new MonsterEvent(Character.Crawler, 4, 5),
				new MonsterEvent(Character.Mudraptor, 4, 5),
				new MonsterEvent(Character.Bonethresher_cave, 2, 3),
				new ScriptedEvent("beaconbandit").actions(
						new SpawnAction("abandonedoutpostnpcsdire", "banditleader_heavy", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "bandit", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "bandit", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "bandit", "banditmedic", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "banditbrute", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "banditbrute", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "banditbrute", "beacon_bandit", "beacon_bandit")));
	}
	
	public static BeaconStationEncountersEvent greatSeaEncounters() {
		return new BeaconStationEncountersEvent().monsters(
				new MonsterSet("husks", false, 10).monsters(
						new MonsterEvent(Character.Husk, 4, 5),
						new MonsterEvent(Character.Crawlerhusk, 4, 5)),
				new MonsterSet("crawlers", false, 10).monsters(
						new MonsterEvent(Character.Crawler, 4, 5)),
				new MonsterSet("crawlers_veteran", false, 5).monsters(
						new MonsterEvent(Character.Crawler_veteran, 3, 5)),
				new MonsterSet("mudraptors_veteran", false, 5).monsters(
						new MonsterEvent(Character.Mudraptor_veteran, 3, 5)),
				new MonsterSet("clown", false, 5).monsters(
						new ScriptedEvent("beaconclown")));
	}
	
	public static BeaconStationEvent hydrothermalWastes() {
		return new BeaconStationEvent().monsters(
				new MonsterEvent(Character.Crawler_veteran, 3, 5),
				new MonsterEvent(Character.Mudraptor_veteran, 3, 5),
				new MonsterEvent(Character.Bonethresher_cave, 2, 3),
				new ScriptedEvent("beaconbandit").actions(
						new SpawnAction("abandonedoutpostnpcsdire", "banditleader_heavy", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "bandit", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "bandit", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "bandit", "banditmedic", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "banditbrute", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcsdire", "banditbrute", "beacon_bandit", "beacon_bandit")));
	}
	
	public static BeaconStationEncountersEvent hydrothermalWastesEncounters() {
		return new BeaconStationEncountersEvent().monsters(
				new MonsterSet("husks", false, 10).monsters(
						new MonsterEvent(Character.Husk, 3, 5),
						new MonsterEvent(Character.Crawlerhusk, 3, 5)),
				new MonsterSet("crawlers", false, 10).monsters(
						new MonsterEvent(Character.Crawler, 3, 5)),
				new MonsterSet("crawlers_veteran", false, 5).monsters(
						new MonsterEvent(Character.Crawler, 3, 5),
						new MonsterEvent(Character.Crawler_veteran, 1, 3)),
				new MonsterSet("mudraptors_veteran", false, 5).monsters(
						new MonsterEvent(Character.Mudraptor, 2, 3),
						new MonsterEvent(Character.Mudraptor_veteran, 2, 4)),
				new MonsterSet("clown", false, 5).monsters(
						new ScriptedEvent("beaconclown")));
	}
}
