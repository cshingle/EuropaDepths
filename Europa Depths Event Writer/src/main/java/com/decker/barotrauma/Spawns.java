package com.decker.barotrauma;

import com.decker.barotrauma.components.Character;
import com.decker.barotrauma.components.Monster;
import com.decker.barotrauma.components.MonsterEvent;
import com.decker.barotrauma.components.MonsterSet;

public class Spawns {
	public static Monster[] coldCaverns1() {
		return new Monster[] {
				new MonsterSet("crawlers", false, 40).monsters(
						new MonsterEvent(Character.Crawler, 3, 4)),
				new MonsterSet("mudraptors", false, 20).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 4),
						new MonsterEvent(Character.Mudraptor, 0, 2))
		};
	}
	
	/**
	 * Introduces Spinelings and Hammerheads
	 *
	 * @return
	 */
	public static Monster[] coldCaverns2() {
		return new Monster[] {
				new MonsterSet("crawlers", false, 40).monsters(
						new MonsterEvent(Character.Crawler, 4, 5)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 3),
						new MonsterEvent(Character.Mudraptor, 0, 3)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 4, 6),
						new MonsterEvent(Character.Spineling_red, 4, 6))
		};
	}
	
	/**
	 * Introduces (armored/regular) Mudraptors, Golden Hammerhead (rare), Crawler Broodmother (rare), Husks, Husked Crawlers, and the first abyss monster.
	 *
	 * @return
	 */
	public static Monster[] coldCavernsTransition() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 40).monsters(
						new MonsterEvent(Character.Crawler, 5, 6),
						new MonsterEvent(Character.Crawlerbroodmother, 0, 1)),
				new MonsterSet("husks", false, 20).monsters(
						new MonsterEvent(Character.Husk, 6, 10).scatter(800)),
				new MonsterSet("Crawlerhusk", false, 40).monsters(
						new MonsterEvent(Character.Crawlerhusk, 5, 6)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 4),
						new MonsterEvent(Character.Mudraptor, 1, 5)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 4, 10)),
				new MonsterSet("spinglings_red", false, 10).monsters(
						new MonsterEvent(Character.Spineling_red, 4, 6),
						new MonsterEvent(Character.Spineling, 4, 6)),
				new MonsterSet("hammerheads", false, 10).monsters(
						new MonsterEvent(Character.Hammerhead, 2, 3),
						new MonsterEvent(Character.Hammerheadgold, 0, 2),
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 2).spawnprobability(0.5))
		};
	}
	
	/**
	 * Introduces Moloch
	 *
	 * @return
	 */
	public static Monster[] europanRidge() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 40).monsters(
						new MonsterEvent(Character.Crawler, 5, 6),
						new MonsterEvent(Character.Crawlerbroodmother, 0, 1)),
				new MonsterSet("husks", false, 20).monsters(
						new MonsterEvent(Character.Husk, 6, 10).scatter(800)),
				new MonsterSet("Crawlerhusk", false, 40).monsters(
						new MonsterEvent(Character.Crawlerhusk, 5, 6)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 4),
						new MonsterEvent(Character.Mudraptor, 1, 5)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 4, 10)),
				new MonsterSet("spinglings_red", false, 10).monsters(
						new MonsterEvent(Character.Spineling_red, 4, 6),
						new MonsterEvent(Character.Spineling, 4, 4)),
				new MonsterSet("hammerheads", false, 10).monsters(
						new MonsterEvent(Character.Hammerhead, 2, 3),
						new MonsterEvent(Character.Hammerheadgold, 0, 2),
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 2).spawnprobability(0.5)),
				new MonsterSet("threshers", false, 5).monsters(
						new MonsterEvent(Character.Bonethresher, 1, 2),
						new MonsterEvent(Character.Tigerthresher, 2, 3)),
				new MonsterSet("molochs", false, 10).monsters(
						new MonsterEvent(Character.Moloch, 1, 1).offset(3000).scatter(3000))
		};
	}
	
	public static Monster[] europanRidgeToPlateau() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 20).monsters(
						new MonsterEvent(Character.Crawler, 6, 10),
						new MonsterEvent(Character.Crawlerbroodmother, 1, 1)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Character.Crawlerhusk, 6, 10)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor, 3, 6),
						new MonsterEvent(Character.Mudraptor_veteran, 1, 2)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 7, 12)),
				new MonsterSet("spinglings", false, 10).monsters(
						new MonsterEvent(Character.Spineling, 3, 5),
						new MonsterEvent(Character.Spineling_red, 5, 6)),
				new MonsterSet("hammerheads", false, 30).monsters(
						new MonsterEvent(Character.Hammerhead, 2, 3),
						new MonsterEvent(Character.Hammerheadgold, 1, 2),
						new MonsterEvent(Character.Hammerhead_juvenile, 0, 1),
						new MonsterEvent(Character.Hammerheadblack, 0, 1)),
				new MonsterSet("threshers", false, 40).monsters(
						new MonsterEvent(Character.Bonethresher, 1, 3),
						new MonsterEvent(Character.Tigerthresher, 2, 3)),
				new MonsterSet("molochs", false, 10).monsters(
						new MonsterEvent(Character.Moloch, 1, 1).offset(3000).scatter(3000)) };
	}
	
	public static Monster[] aphoticPlateau1NearStation() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 40).monsters(
						new MonsterEvent(Character.Crawler, 6, 10)),
				new MonsterSet("Crawlerhusk", false, 40).monsters(
						new MonsterEvent(Character.Crawlerhusk, 6, 10).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor, 3, 6),
						new MonsterEvent(Character.Mudraptor_unarmored, 1, 2)),
				new MonsterSet("spinelings", false, 5).monsters(
						new MonsterEvent(Character.Spineling, 4, 6),
						new MonsterEvent(Character.Spineling_red, 6, 6).offset(1000).scatter(1000)),
				new MonsterSet("fire", false, 5).monsters(
						new MonsterEvent(Character.Spineling_red, 6, 9).offset(1000).scatter(1000))
		};
	}
	
	/**
	 * Introduces Watcher
	 *
	 * @return
	 */
	public static Monster[] aphoticPlateau1() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 20).monsters(
						new MonsterEvent(Character.Crawler, 6, 10),
						new MonsterEvent(Character.Crawlerbroodmother, 1, 1)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Character.Crawlerhusk, 6, 10)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor, 3, 6),
						new MonsterEvent(Character.Mudraptor_veteran, 1, 2)),
				new MonsterSet("watcher1", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Mudraptor, 3, 5)),
				new MonsterSet("watcher2", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Spineling, 4, 5),
						new MonsterEvent(Character.Spineling_red, 6, 6)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 10, 15),
						new MonsterEvent(Character.Spineling_red, 4, 6),
						new MonsterEvent(Character.Spineling_giant, 1, 2)),
				new MonsterSet("hammerheads", false, 30).monsters(
						new MonsterEvent(Character.Hammerhead, 2, 4),
						new MonsterEvent(Character.Hammerheadgold, 1, 3),
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 1),
						new MonsterEvent(Character.Hammerheadblack, 1, 1).spawnprobability(0.5)),
				new MonsterSet("threshers", false, 40).monsters(
						new MonsterEvent(Character.Bonethresher, 1, 3),
						new MonsterEvent(Character.Tigerthresher, 2, 3)),
				new MonsterSet("molochs", false, 10).monsters(
						new MonsterEvent(Character.Moloch, 1, 1).offset(3000).scatter(3000))
		};
	}
	
	public static Monster[] aphoticPlateau2NearStation() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 20).monsters(
						new MonsterEvent(Character.Crawler, 8, 15)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Character.Crawlerhusk, 10, 15).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor, 3, 8),
						new MonsterEvent(Character.Mudraptor_veteran, 1, 3)),
				new MonsterSet("spinelings", false, 5).monsters(
						new MonsterEvent(Character.Spineling, 5, 7),
						new MonsterEvent(Character.Spineling_red, 6, 6).offset(1000).scatter(1000)),
				new MonsterSet("fire", false, 5).monsters(
						new MonsterEvent(Character.Spineling_red, 9, 12).offset(1000).scatter(1000))
		};
	}
	
	/**
	 * Introduces Watcher
	 *
	 * @return
	 */
	public static Monster[] aphoticPlateau2() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 20).monsters(
						new MonsterEvent(Character.Crawler, 8, 15),
						new MonsterEvent(Character.Crawlerbroodmother, 1, 2)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Character.Crawlerhusk, 10, 15).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor, 3, 6),
						new MonsterEvent(Character.Mudraptor_veteran, 1, 2)),
				new MonsterSet("watcher1", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Mudraptor, 3, 5)),
				new MonsterSet("watcher2", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Spineling, 4, 5),
						new MonsterEvent(Character.Spineling_red, 4, 5)),
				new MonsterSet("watcher3", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Crawler, 5, 15)),
				new MonsterSet("watcher4", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Bonethresher, 1, 2),
						new MonsterEvent(Character.Tigerthresher, 3, 5)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 6, 8),
						new MonsterEvent(Character.Spineling_red, 6, 7),
						new MonsterEvent(Character.Spineling_giant, 1, 2)),
				new MonsterSet("hammerheads", false, 30).monsters(
						new MonsterEvent(Character.Hammerhead, 2, 6),
						new MonsterEvent(Character.Hammerheadgold, 1, 3),
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 2),
						new MonsterEvent(Character.Hammerheadblack, 1, 3).spawnprobability(0.5)),
				new MonsterSet("threshers", false, 40).monsters(
						new MonsterEvent(Character.Bonethresher, 2, 3).scatter(1000),
						new MonsterEvent(Character.Tigerthresher, 4, 6)),
				new MonsterSet("molochs", false, 10).monsters(
						new MonsterEvent(Character.Moloch, 1, 3).offset(3000).scatter(3000))
		};
	}
	
	public static Monster[] greatSeaNearStation() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 20).monsters(
						new MonsterEvent(Character.Crawler_veteran, 10, 15)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Character.Crawlerhusk, 12, 16).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor_veteran, 6, 10)),
				new MonsterSet("thrashers", false, 40).monsters(
						new MonsterEvent(Character.Tigerthresher_veteran, 5, 8)),
				new MonsterSet("spinelings", false, 5).monsters(
						new MonsterEvent(Character.Spineling, 5, 7),
						new MonsterEvent(Character.Spineling_red, 6, 7),
						new MonsterEvent(Character.Spineling_morbusine, 0, 3).spawnprobability(0.5).scatter(2000))
		};
	}
	
	/**
	 * Introduces Black Moloch. Smaller creatures are less frequent and appear in even larger swarms, more bigger guys.
	 *
	 * @return
	 */
	public static Monster[] greatSea() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 10).monsters(
						new MonsterEvent(Character.Crawler_veteran, 10, 14),
						new MonsterEvent(Character.Crawlerbroodmother, 2, 3)),
				new MonsterSet("Crawlerhusk", false, 10).monsters(
						new MonsterEvent(Character.Crawlerhusk, 15, 18).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor, 8, 10),
						new MonsterEvent(Character.Mudraptor_veteran, 3, 4)),
				new MonsterSet("watcher1", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Mudraptor_veteran, 3, 5)),
				new MonsterSet("watcher2", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Spineling, 4, 5),
						new MonsterEvent(Character.Spineling_morbusine, 3, 4),
						new MonsterEvent(Character.Spineling_red, 4, 5)),
				new MonsterSet("watcher3", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Crawler_veteran, 5, 15)),
				new MonsterSet("watcher4", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Bonethresher_veteran, 1, 2),
						new MonsterEvent(Character.Tigerthresher_veteran, 3, 5)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 10, 20),
						new MonsterEvent(Character.Spineling_red, 6, 7),
						new MonsterEvent(Character.Spineling_giant, 2, 3)),
				new MonsterSet("threshers", false, 40).monsters(
						new MonsterEvent(Character.Bonethresher, 2, 3),
						new MonsterEvent(Character.Bonethresher_veteran, 1, 1),
						new MonsterEvent(Character.Tigerthresher, 6, 8),
						new MonsterEvent(Character.Tigerthresher_veteran, 1, 1)),
				new MonsterSet("hammerheads", true, 30).monsters(
						new MonsterSet("nomatriarch").monsters(
								new MonsterEvent(Character.Hammerhead, 3, 5),
								new MonsterEvent(Character.Hammerhead_veteran, 1, 1),
								new MonsterEvent(Character.Hammerheadgold, 2, 3),
								new MonsterEvent(Character.Hammerheadgold_veteran, 1, 1),
								new MonsterEvent(Character.Hammerheadblack, 1, 3).spawnprobability(0.5)),
						new MonsterSet("matriarch").monsters(
								new MonsterEvent(Character.Hammerhead, 3, 5),
								new MonsterEvent(Character.Hammerhead_veteran, 1, 1),
								new MonsterEvent(Character.Hammerheadgold, 2, 3),
								new MonsterEvent(Character.Hammerhead_veteran, 1, 1),
								new MonsterEvent(Character.Hammerhead_juvenile, 1, 2),
								new MonsterEvent(Character.Hammerheadmatriarch, 1, 2),
								new MonsterEvent(Character.Hammerheadspawn, 5, 10),
								new MonsterEvent(Character.Hammerheadblack, 1, 2).spawnprobability(0.5))),
				new MonsterSet("molochs", true, 20).monsters(
						new MonsterSet("nobabies").monsters(
								new MonsterEvent(Character.Moloch, 1, 2).scatter(3000),
								new MonsterEvent(Character.Molochblack, 1, 1).offset(5000).scatter(3000)),
						new MonsterSet("babies").monsters(
								new MonsterEvent(Character.Moloch, 2, 3).offset(10000).scatter(3000),
								new MonsterEvent(Character.Molochbaby, 10, 20).scatter(3000),
								new MonsterEvent(Character.Molochblack, 1, 1).offset(10000).scatter(3000))),
				new MonsterSet("charybdisjuvenile", false, 1).monsters(
						new MonsterEvent(Character.Charybdis_juvenile, 1, 1))
		};
	}
	
	public static Monster[] hydrothermalWastesNearStation() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 20).monsters(
						new MonsterEvent(Character.Crawler_veteran, 8, 14)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Character.Crawlerhusk, 12, 15).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor_veteran, 4, 8)),
				new MonsterSet("molochs", true, 5).monsters(
						new MonsterEvent(Character.Moloch, 2, 3).offset(1000).scatter(3000),
						new MonsterEvent(Character.Molochbaby, 10, 20).scatter(3000),
						new MonsterEvent(Character.Molochblack, 1, 1).offset(10000).scatter(3000)),
				new MonsterSet("spinelings", false, 5).monsters(
						new MonsterEvent(Character.Spineling, 5, 7),
						new MonsterEvent(Character.Spineling_red, 6, 7),
						new MonsterEvent(Character.Spineling_morbusine, 5, 7).spawnprobability(0.75).scatter(2000))
		};
	}
	
	/**
	 * Introduces Hammerhead Matriarch, Moloch Baby, Giant Spineling Introduces Black Moloch. Smaller creatures are less frequent and appear in even larger swarms, more bigger guys.
	 *
	 * @return
	 */
	public static Monster[] hydrothermalWastes() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 10).monsters(
						new MonsterEvent(Character.Crawler_veteran, 12, 14),
						new MonsterEvent(Character.Crawlerbroodmother, 2, 3)),
				new MonsterSet("Crawlerhusk", false, 10).monsters(
						new MonsterEvent(Character.Crawlerhusk, 15, 18).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Character.Mudraptor_veteran, 10, 12)),
				new MonsterSet("watcher1", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Mudraptor_veteran, 3, 5)),
				new MonsterSet("watcher2", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Spineling, 5, 7),
						new MonsterEvent(Character.Spineling_morbusine, 5, 7),
						new MonsterEvent(Character.Spineling_red, 5, 7)),
				new MonsterSet("watcher3", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Crawler_veteran, 8, 15)),
				new MonsterSet("watcher4", false, 15).monsters(
						new MonsterEvent(Character.Watcher, 1, 1),
						new MonsterEvent(Character.Bonethresher_veteran, 2, 3),
						new MonsterEvent(Character.Tigerthresher_veteran, 3, 5)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 10, 14),
						new MonsterEvent(Character.Spineling_morbusine, 2, 3),
						new MonsterEvent(Character.Spineling_red, 4, 6),
						new MonsterEvent(Character.Spineling_giant, 2, 3)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 7, 10),
						new MonsterEvent(Character.Spineling_morbusine, 7, 9)),
				new MonsterSet("threshers", false, 40).monsters(
						new MonsterEvent(Character.Bonethresher_veteran, 3, 4).scatter(1000),
						new MonsterEvent(Character.Tigerthresher_veteran, 5, 8)),
				new MonsterSet("hammerheads", true, 30).monsters(
						new MonsterSet("nomatriarch").monsters(
								new MonsterEvent(Character.Hammerhead_veteran, 3, 5),
								new MonsterEvent(Character.Hammerheadgold_veteran, 3, 4),
								new MonsterEvent(Character.Hammerheadblack, 1, 3).spawnprobability(0.5)),
						new MonsterSet("matriarch").monsters(
								new MonsterEvent(Character.Hammerhead_veteran, 3, 5),
								new MonsterEvent(Character.Hammerheadgold_veteran, 3, 4),
								new MonsterEvent(Character.Hammerhead_juvenile, 1, 3),
								new MonsterEvent(Character.Hammerheadmatriarch, 1, 2),
								new MonsterEvent(Character.Hammerheadspawn, 5, 10),
								new MonsterEvent(Character.Hammerheadblack, 1, 1).spawnprobability(0.5))),
				new MonsterSet("molochs", true, 20).monsters(
						new MonsterSet("nobabies").monsters(
								new MonsterEvent(Character.Moloch, 1, 2).scatter(3000),
								new MonsterEvent(Character.Molochblack, 1, 1).offset(5000).scatter(3000)),
						new MonsterSet("babies").monsters(
								new MonsterEvent(Character.Moloch, 2, 3).offset(10000).scatter(3000),
								new MonsterEvent(Character.Molochbaby, 10, 20).scatter(3000),
								new MonsterEvent(Character.Molochblack, 1, 1).offset(10000).scatter(3000))),
				new MonsterSet("portalguardians", false, 3).monsters(
						new MonsterEvent(Character.Portalguardian, 1, 2)),
				new MonsterSet("latcher", false, 5).monsters(
						new MonsterEvent(Character.Latcher, 1, 1)),
				new MonsterSet("destroyer", false, 1).monsters(
						new MonsterEvent(Character.Ed_Fractaldestroyer, 1, 1),
						new MonsterEvent(Character.Portalguardian, 1, 2)),
				new MonsterSet("charybdisjuvenile", false, 5).monsters(
						new MonsterEvent(Character.Charybdis_juvenile, 1, 1))
		};
	}
}
