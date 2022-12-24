package com.decker.barotrauma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.decker.barotrauma.campaign.Charactor;
import com.decker.barotrauma.campaign.Monster;
import com.decker.barotrauma.campaign.MonsterEvent;
import com.decker.barotrauma.campaign.MonsterSet;

public class Spawns {
	public static Monster[] coldCaverns1() {
		return new Monster[] {
				new MonsterSet("crawlers", false, 40).monsters(
						new MonsterEvent(Charactor.Crawler, 3, 4)),
				new MonsterSet("mudraptors", false, 20).monsters(
						new MonsterEvent(Charactor.Mudraptor_unarmored, 2, 4),
						new MonsterEvent(Charactor.Mudraptor, 0, 2))
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
						new MonsterEvent(Charactor.Crawler, 4, 5)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Charactor.Mudraptor_unarmored, 2, 4),
						new MonsterEvent(Charactor.Mudraptor, 0, 3)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Charactor.Spineling, 4, 6)),
				new MonsterSet("hammerheads", false, 20).monsters(
						new MonsterEvent(Charactor.Hammerhead, 1, 2))
		};
	}
	
	/**
	 * Introduces (armored/regular) Mudraptors, Threshers, Golden Hammerhead (rare), Crawler Broodmother, Husks, Husked Crawlers, and the first abyss monster.
	 * 
	 * @return
	 */
	public static Monster[] coldCavernsTransition() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 40).monsters(
						new MonsterEvent(Charactor.Crawler, 5, 6),
						new MonsterEvent(Charactor.Crawlerbroodmother, 0, 1)),
				new MonsterSet("husks", false, 20).monsters(
						new MonsterEvent(Charactor.Husk, 6, 10).scatter(800)),
				new MonsterSet("Crawlerhusk", false, 40).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 5, 6)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Charactor.Mudraptor_unarmored, 2, 4),
						new MonsterEvent(Charactor.Mudraptor, 1, 5)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Charactor.Spineling, 4, 10)),
				new MonsterSet("hammerheads", false, 10).monsters(
						new MonsterEvent(Charactor.Hammerhead, 2, 3),
						new MonsterEvent(Charactor.Hammerheadgold, 0, 2),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 1, 2).spawnprobability(0.5)),
				new MonsterSet("threshers", false, 20).monsters(
						new MonsterEvent(Charactor.Bonethresher, 1, 2),
						new MonsterEvent(Charactor.Tigerthresher, 2, 3))
		};
	}
	
	/**
	 * Introduces Moloch
	 * 
	 * @return
	 */
	public static Monster[] europanRidge() {
		List<Monster> monsters = new ArrayList<>();
		monsters.addAll(Arrays.asList(coldCavernsTransition()));
		monsters.add(
				new MonsterSet("molochs", false, 10).monsters(
						new MonsterEvent(Charactor.Moloch, 1, 1).offset(3000).scatter(3000)));
		return monsters.toArray(new Monster[0]);
	}
	
	public static Monster[] europanRidgeToPlateau() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 20).monsters(
						new MonsterEvent(Charactor.Crawler, 6, 10),
						new MonsterEvent(Charactor.Crawlerbroodmother, 1, 1)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 6, 10)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Charactor.Mudraptor, 3, 6),
						new MonsterEvent(Charactor.Mudraptor_veteran, 1, 2)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Charactor.Spineling, 7, 12)),
				new MonsterSet("hammerheads", false, 30).monsters(
						new MonsterEvent(Charactor.Hammerhead, 2, 3),
						new MonsterEvent(Charactor.Hammerheadgold, 1, 2),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 1, 2),
						new MonsterEvent(Charactor.Hammerheadblack, 0, 1)),
				new MonsterSet("threshers", false, 40).monsters(
						new MonsterEvent(Charactor.Bonethresher, 1, 3),
						new MonsterEvent(Charactor.Tigerthresher, 2, 3)),
				new MonsterSet("molochs", false, 10).monsters(
						new MonsterEvent(Charactor.Moloch, 1, 1).offset(3000).scatter(3000)) };
	}
	
	public static Monster[] aphoticPlateau1NearStation() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 40).monsters(
						new MonsterEvent(Charactor.Crawler, 6, 10)),
				new MonsterSet("Crawlerhusk", false, 40).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 6, 10).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Charactor.Mudraptor, 3, 6),
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2)) };
	}
	
	/**
	 * Introduces Watcher
	 * 
	 * @return
	 */
	public static Monster[] aphoticPlateau1() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 20).monsters(
						new MonsterEvent(Charactor.Crawler, 6, 10),
						new MonsterEvent(Charactor.Crawlerbroodmother, 1, 1)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 6, 10)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Charactor.Mudraptor, 3, 6),
						new MonsterEvent(Charactor.Mudraptor_veteran, 1, 2)),
				new MonsterSet("watcher", false, 20).monsters(
						new MonsterEvent(Charactor.Watcher, 0, 1),
						new MonsterEvent(Charactor.Mudraptor, 1, 2)),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Charactor.Spineling, 10, 15),
						new MonsterEvent(Charactor.Spineling_giant, 1, 2)),
				new MonsterSet("hammerheads", false, 30).monsters(
						new MonsterEvent(Charactor.Hammerhead, 2, 4),
						new MonsterEvent(Charactor.Hammerheadgold, 1, 3),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 1, 2),
						new MonsterEvent(Charactor.Hammerheadblack, 1, 1).spawnprobability(0.5)),
				new MonsterSet("threshers", false, 40).monsters(
						new MonsterEvent(Charactor.Bonethresher, 1, 3),
						new MonsterEvent(Charactor.Tigerthresher, 2, 3)),
				new MonsterSet("molochs", false, 10).monsters(
						new MonsterEvent(Charactor.Moloch, 1, 1).offset(3000).scatter(3000))
		};
	}
	
	public static Monster[] aphoticPlateau2NearStation() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 20).monsters(
						new MonsterEvent(Charactor.Crawler, 8, 15)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 10, 15).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Charactor.Mudraptor, 3, 8),
						new MonsterEvent(Charactor.Mudraptor_veteran, 1, 3))
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
						new MonsterEvent(Charactor.Crawler, 8, 15),
						new MonsterEvent(Charactor.Crawlerbroodmother, 1, 2)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 10, 15).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Charactor.Mudraptor, 3, 6),
						new MonsterEvent(Charactor.Mudraptor_veteran, 1, 2)),
				new MonsterSet("watcher", 10).monsters(
						new MonsterEvent(Charactor.Watcher, 1, 1).triggereventcooldown(false),
						new MonsterSet(true).monsters(
								new MonsterSet("crawlers").monsters(
										new MonsterEvent(Charactor.Crawler, 5, 15)),
								new MonsterSet("mudraptors").monsters(
										new MonsterEvent(Charactor.Mudraptor, 3, 5)),
								new MonsterSet("threshers").monsters(
										new MonsterEvent(Charactor.Bonethresher, 1, 2),
										new MonsterEvent(Charactor.Tigerthresher, 3, 5)))),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Charactor.Spineling, 10, 18),
						new MonsterEvent(Charactor.Spineling_giant, 1, 3)),
				new MonsterSet("hammerheads", false, 30).monsters(
						new MonsterEvent(Charactor.Hammerhead, 2, 6),
						new MonsterEvent(Charactor.Hammerheadgold, 1, 3),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 1, 2),
						new MonsterEvent(Charactor.Hammerheadblack, 1, 3).spawnprobability(0.5)),
				new MonsterSet("threshers", false, 40).monsters(
						new MonsterEvent(Charactor.Bonethresher, 2, 3).scatter(1000),
						new MonsterEvent(Charactor.Tigerthresher, 4, 6)),
				new MonsterSet("molochs", false, 10).monsters(
						new MonsterEvent(Charactor.Moloch, 1, 3).offset(3000).scatter(3000))
		};
	}
	
	public static Monster[] greatSeaNearStation() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 20).monsters(
						new MonsterEvent(Charactor.Crawler_veteran, 12, 16)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 15, 18).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Charactor.Mudraptor_veteran, 8, 12)),
				new MonsterSet("thrashers", false, 40).monsters(
						new MonsterEvent(Charactor.Tigerthresher_veteran, 5, 8))
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
						new MonsterEvent(Charactor.Crawler_veteran, 12, 15),
						new MonsterEvent(Charactor.Crawlerbroodmother, 2, 3)),
				new MonsterSet("Crawlerhusk", false, 10).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 15, 18).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Charactor.Mudraptor_veteran, 10, 12)),
				new MonsterSet("watcher", 10).monsters(
						new MonsterEvent(Charactor.Watcher, 1, 1).triggereventcooldown(false),
						new MonsterSet(true).monsters(
								new MonsterSet("crawlers").monsters(
										new MonsterEvent(Charactor.Crawler_veteran, 8, 15)),
								new MonsterSet("mudraptors").monsters(
										new MonsterEvent(Charactor.Mudraptor_veteran, 5, 7)),
								new MonsterSet("threshers").monsters(
										new MonsterEvent(Charactor.Bonethresher_veteran, 2, 3),
										new MonsterEvent(Charactor.Tigerthresher_veteran, 3, 8)))),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Charactor.Spineling, 10, 20),
						new MonsterEvent(Charactor.Spineling_giant, 2, 3)),
				new MonsterSet("threshers", false, 40).monsters(
						new MonsterEvent(Charactor.Bonethresher_veteran, 3, 5).scatter(1000),
						new MonsterEvent(Charactor.Tigerthresher_veteran, 5, 6)),
				new MonsterSet("hammerheads", true, 30).monsters(
						new MonsterSet("nomatriarch").monsters(
								new MonsterEvent(Charactor.Hammerhead_veteran, 3, 6),
								new MonsterEvent(Charactor.Hammerheadgold_veteran, 3, 4),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 3).spawnprobability(0.5)),
						new MonsterSet("matriarch").monsters(
								new MonsterEvent(Charactor.Hammerhead_veteran, 3, 6),
								new MonsterEvent(Charactor.Hammerheadgold_veteran, 3, 4),
								new MonsterEvent(Charactor.Hammerhead_juvenile, 3, 4),
								new MonsterEvent(Charactor.Hammerheadmatriarch, 1, 2),
								new MonsterEvent(Charactor.Hammerheadspawn, 5, 10),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 3).spawnprobability(0.5))),
				new MonsterSet("molochs", true, 20).monsters(
						new MonsterSet("nobabies").monsters(
								new MonsterEvent(Charactor.Moloch, 1, 2).scatter(3000),
								new MonsterEvent(Charactor.Molochblack, 1, 2).offset(5000).scatter(3000)),
						new MonsterSet("babies").monsters(
								new MonsterEvent(Charactor.Moloch, 2, 3).offset(10000).scatter(3000),
								new MonsterEvent(Charactor.Molochbaby, 10, 20).scatter(3000),
								new MonsterEvent(Charactor.Molochblack, 1, 2).offset(10000).scatter(3000))),
				new MonsterSet("charybdisjuvenile", false, 1).monsters(
						new MonsterEvent(Charactor.Charybdis_juvenile, 1, 1))
		};
	}
	
	public static Monster[] hydrothermalWastesNearStation() {
		return new Monster[] {
				new MonsterSet("crawlerswarm", false, 20).monsters(
						new MonsterEvent(Charactor.Crawler_veteran, 8, 15)),
				new MonsterSet("Crawlerhusk", false, 20).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 15, 18).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Charactor.Mudraptor_veteran, 4, 8)),
				new MonsterSet("molochs", true, 5).monsters(
						new MonsterEvent(Charactor.Moloch, 2, 3).offset(1000).scatter(3000),
						new MonsterEvent(Charactor.Molochbaby, 10, 20).scatter(3000),
						new MonsterEvent(Charactor.Molochblack, 1, 2).offset(10000).scatter(3000))
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
						new MonsterEvent(Charactor.Crawler_veteran, 12, 15),
						new MonsterEvent(Charactor.Crawlerbroodmother, 2, 3)),
				new MonsterSet("Crawlerhusk", false, 10).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 15, 18).scatter(1000)),
				new MonsterSet("mudraptors", false, 40).monsters(
						new MonsterEvent(Charactor.Mudraptor_veteran, 10, 12)),
				new MonsterSet("watcher", 10).monsters(
						new MonsterEvent(Charactor.Watcher, 1, 1).triggereventcooldown(false),
						new MonsterSet(true).monsters(
								new MonsterSet("crawlers").monsters(
										new MonsterEvent(Charactor.Crawler_veteran, 8, 15)),
								new MonsterSet("mudraptors").monsters(
										new MonsterEvent(Charactor.Mudraptor_veteran, 5, 7)),
								new MonsterSet("threshers").monsters(
										new MonsterEvent(Charactor.Bonethresher_veteran, 2, 3),
										new MonsterEvent(Charactor.Tigerthresher_veteran, 3, 8)))),
				new MonsterSet("spinglings", false, 20).monsters(
						new MonsterEvent(Charactor.Spineling, 10, 20),
						new MonsterEvent(Charactor.Spineling_giant, 2, 3)),
				new MonsterSet("threshers", false, 40).monsters(
						new MonsterEvent(Charactor.Bonethresher_veteran, 3, 6).scatter(1000),
						new MonsterEvent(Charactor.Tigerthresher_veteran, 5, 8)),
				new MonsterSet("hammerheads", true, 30).monsters(
						new MonsterSet("nomatriarch").monsters(
								new MonsterEvent(Charactor.Hammerhead_veteran, 3, 6),
								new MonsterEvent(Charactor.Hammerheadgold_veteran, 3, 4),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 3).spawnprobability(0.5)),
						new MonsterSet("matriarch").monsters(
								new MonsterEvent(Charactor.Hammerhead_veteran, 3, 6),
								new MonsterEvent(Charactor.Hammerheadgold_veteran, 3, 4),
								new MonsterEvent(Charactor.Hammerhead_juvenile, 3, 4),
								new MonsterEvent(Charactor.Hammerheadmatriarch, 1, 2),
								new MonsterEvent(Charactor.Hammerheadspawn, 5, 10),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 3).spawnprobability(0.5))),
				new MonsterSet("molochs", true, 20).monsters(
						new MonsterSet("nobabies").monsters(
								new MonsterEvent(Charactor.Moloch, 1, 2).scatter(3000),
								new MonsterEvent(Charactor.Molochblack, 1, 2).offset(5000).scatter(3000)),
						new MonsterSet("babies").monsters(
								new MonsterEvent(Charactor.Moloch, 2, 3).offset(10000).scatter(3000),
								new MonsterEvent(Charactor.Molochbaby, 10, 20).scatter(3000),
								new MonsterEvent(Charactor.Molochblack, 1, 2).offset(10000).scatter(3000))),
				new MonsterSet("latcher", false, 5).monsters(
						new MonsterEvent(Charactor.Latcher, 1, 1)),
				new MonsterSet("charybdisjuvenile", false, 5).monsters(
						new MonsterEvent(Charactor.Charybdis_juvenile, 1, 1))
		};
	}
}
