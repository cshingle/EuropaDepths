package com.decker.barotrauma;

import com.decker.barotrauma.components.*;
import com.decker.barotrauma.components.Character;

public class BeaconStations {
	
	public static BeaconStationEvent coldCaverns() {
		return new BeaconStationEvent().add(
				new BeaconStationEncountersEvent(0d, 0.25d, 0.5d, 40)
						.monsters(coldCavernsEncounters()),
				BeaconBanditsEvent.beaconBandits1(5),
				BeaconNestEvent.crawlerNest("crawlernest", 25).monsters(
						new MonsterEvent(Character.Crawler, 2, 2),
						new MonsterEvent(Character.Crawler, 1, 2)),
				BeaconNestEvent.mudraptorNest("mudraptornest", 5).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 1, 2))
		);
	}
	
	private static Monster[] coldCavernsEncounters() {
		return new Monster[] {
				new MonsterSet("husks", false, 10).monsters(
						new MonsterEvent(Character.Husk, 2, 3),
						new MonsterEvent(Character.Crawlerhusk, 1, 2)),
				new MonsterSet("crawlers", false, 10).monsters(
						new MonsterEvent(Character.Crawler, 3, 4)),
				new MonsterSet("mudraptors", false, 5).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 3))
		};
	}
	
	public static BeaconStationEvent europanRidge() {
		return new BeaconStationEvent().add(
				new BeaconStationEncountersEvent(0.05d, 0.25d, 0.5d, 40)
						.monsters(europanRidgeEncounters()),
				BeaconBanditsEvent.beaconBandits2(5),
				BeaconNestEvent.crawlerNest("crawlernest", 25).monsters(
						new MonsterEvent(Character.Crawler, 2, 2),
						new MonsterEvent(Character.Crawler, 2, 2)),
				BeaconNestEvent.mudraptorNest("mudraptornest", 5).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 3))
		);
	}
	
	public static Monster[] europanRidgeEncounters() {
		return new Monster[] {
				new MonsterSet("husks", false, 10).monsters(
						new MonsterEvent(Character.Husk, 2, 3),
						new MonsterEvent(Character.Crawlerhusk, 1, 2)),
				new MonsterSet("crawlers", false, 10).monsters(
						new MonsterEvent(Character.Crawler, 3, 4)),
				new MonsterSet("mudraptors", false, 10).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 3))
		};
	}
	
	public static BeaconStationEvent aphoticPlateau() {
		return new BeaconStationEvent().add(
				new BeaconStationEncountersEvent(0.20d, 0.25d, 0.5d, 40)
						.monsters(aphoticPlateauEncounters()),
				BeaconBanditsEvent.beaconBandits3(5),
				BeaconNestEvent.crawlerNest("crawlernest", 25).monsters(
						new MonsterEvent(Character.Crawler, 2, 2),
						new MonsterEvent(Character.Crawler, 2, 3)),
				BeaconNestEvent.mudraptorNest("mudraptornest", 5).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 3))
		);
	}
	
	public static Monster[] aphoticPlateauEncounters() {
		return new Monster[] {
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
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3))
		};
	}
	
	public static BeaconStationEvent aphoticPlateau2() {
		return new BeaconStationEvent().add(
				new BeaconStationEncountersEvent(0.25d, 0.25d, 0.5d, 40)
						.monsters(aphoticPlateauEncounters2()),
				BeaconBanditsEvent.beaconBandits3(5),
				BeaconNestEvent.crawlerNest("crawlernest", 25).monsters(
						new MonsterEvent(Character.Crawler, 2, 2),
						new MonsterEvent(Character.Crawler, 2, 3)),
				BeaconNestEvent.mudraptorNest("mudraptornest", 5).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 3))
		);
	}
	
	public static Monster[] aphoticPlateauEncounters2() {
		return new Monster[] {
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
				new MonsterSet("threshers", false, 5).monsters(
						new MonsterEvent(Character.Tigerthresher, 2, 3)),
				new MonsterSet("clown", false, 2).monsters(
						new ScriptedEvent("beaconclown"))
		};
	}
	
	public static BeaconStationEvent greatSea() {
		return new BeaconStationEvent().add(
				new BeaconStationEncountersEvent(0.25d, 0.35d, 0.5d, 20)
						.monsters(greatSeaEncounters()),
				BeaconBanditsEvent.beaconBandits5(10),
				BeaconNestEvent.crawlerNest("crawlernest", 10).monsters(
						new MonsterEvent(Character.Crawler, 3, 4),
						new MonsterEvent(Character.Crawler, 3, 4),
						new MonsterEvent(Character.Crawler_veteran, 3, 4)),
				BeaconNestEvent.mudraptorNest("mudraptornest", 10).monsters(
						new MonsterEvent(Character.Mudraptor, 3, 5),
						new MonsterEvent(Character.Mudraptor_veteran, 3, 5))
		);
	}
	
	public static Monster[] greatSeaEncounters() {
		return new Monster[] {
				new MonsterSet("husks", false, 10).monsters(
						new MonsterEvent(Character.Husk, 4, 5),
						new MonsterEvent(Character.Crawlerhusk, 4, 5)),
				new MonsterSet("crawlers", false, 10).monsters(
						new MonsterEvent(Character.Crawler, 4, 5)),
				new MonsterSet("crawlers_veteran", false, 5).monsters(
						new MonsterEvent(Character.Crawler_veteran, 3, 5)),
				new MonsterSet("mudraptors_veteran", false, 5).monsters(
						new MonsterEvent(Character.Mudraptor_veteran, 3, 5)),
				new MonsterSet("threshers", false, 5).monsters(
						new MonsterEvent(Character.Tigerthresher_veteran, 3, 4)),
				new MonsterSet("mantis", false, 5).monsters(
						new MonsterEvent(Character.Mantis, 2, 3),
						new MonsterEvent(Character.Mantis, 2, 3)),
				new MonsterSet("clown", false, 5).monsters(
						new ScriptedEvent("beaconclown"))
		};
	}
	
	public static BeaconStationEvent hydrothermalWastes() {
		return new BeaconStationEvent().add(
				new BeaconStationEncountersEvent(0.3d, 0.35d, 0.5d, 20)
						.monsters(hydrothermalWastesEncounters()),
				BeaconBanditsEvent.beaconBandits5(10),
				BeaconNestEvent.crawlerNest("crawlernest", 10).monsters(
						new MonsterEvent(Character.Crawler, 3, 5),
						new MonsterEvent(Character.Crawler_veteran, 4, 5)),
				BeaconNestEvent.mudraptorNest("mudraptornest", 10).monsters(
						new MonsterEvent(Character.Mudraptor_veteran, 4, 5))
		);
	}
	
	public static Monster[] hydrothermalWastesEncounters() {
		return new Monster[] {
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
				new MonsterSet("threshers", false, 5).monsters(
						new MonsterEvent(Character.Tigerthresher_veteran, 3, 4)),
				new MonsterSet("clown", false, 5).monsters(
						new ScriptedEvent("beaconclown"))
		};
	}
}
