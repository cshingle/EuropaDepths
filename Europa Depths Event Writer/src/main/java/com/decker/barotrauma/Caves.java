package com.decker.barotrauma;

import com.decker.barotrauma.components.*;
import com.decker.barotrauma.components.Character;

public class Caves {
	
	public static CaveEvent coldCaverns() {
		return new CaveEvent().monsters(
				new MonsterSet("Crawlers", false, 20).monsters(
						new MonsterEvent(Character.Crawler, 2, 3),
						new MonsterEvent(Character.Mantis, 1, 1).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Crawlerhusks", false, 20).monsters(
						new MonsterEvent(Character.Crawlerhusk, 2, 3),
						new MonsterEvent(Character.Mantis, 1, 1).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Spinelings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 2, 3),
						new MonsterEvent(Character.Mantis, 1, 1).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Mudraptors", false, 20).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 2),
						new MonsterEvent(Character.Mantis, 1, 1).spawnprobability(0.33).scatter(2000)
				));
	}
	
	public static CaveEvent europanRidge() {
		return new CaveEvent().monsters(
				new MonsterSet("Crawlers", false, 20).monsters(
						new MonsterEvent(Character.Crawler, 2, 5),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Crawlerhusks", false, 20).monsters(
						new MonsterEvent(Character.Crawlerhusk, 2, 5),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Spinelings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 2, 5),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Mudraptors", false, 20).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 5),
						new MonsterEvent(Character.Mudraptor, 1, 1).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Bonethresher_caves", false, 20).monsters(
						new MonsterEvent(Character.Bonethresher_cave, 1, 2),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Tigerthreshers", false, 20).monsters(
						new MonsterEvent(Character.Tigerthresher, 1, 3),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Mantis", false, 20).monsters(
						new MonsterEvent(Character.Mantis, 1, 3).scatter(2000),
						new MonsterEvent(Character.Bonethresher_cave, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Bonethresher_cave, 1, 2).spawnprobability(0.33).scatter(2000)
				));
	}
	
	public static CaveEvent aphoticPlateau() {
		return new CaveEvent().monsters(
				new MonsterSet("Crawlers", false, 20).monsters(
						new MonsterEvent(Character.Crawler, 3, 5),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Crawlerhusks", false, 20).monsters(
						new MonsterEvent(Character.Crawlerhusk, 3, 6),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Spinelings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 3, 6),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Mudraptors", false, 15).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 3, 6),
						new MonsterEvent(Character.Mudraptor, 1, 1).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Mudraptors2", false, 15).monsters(
						new MonsterEvent(Character.Mudraptor, 3, 6),
						new MonsterEvent(Character.Mudraptor_veteran, 1, 1).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Bonethresher_caves", false, 20).monsters(
						new MonsterEvent(Character.Bonethresher_cave, 2, 3),
						new MonsterEvent(Character.Tigerthresher, 1, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Tigerthreshers", false, 20).monsters(
						new MonsterEvent(Character.Tigerthresher, 2, 4),
						new MonsterEvent(Character.Bonethresher_cave, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 1, 2).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Mantis", false, 20).monsters(
						new MonsterEvent(Character.Mantis, 2, 3).scatter(2000),
						new MonsterEvent(Character.Bonethresher_cave, 1, 2).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Bonethresher_cave, 1, 2).spawnprobability(0.33).scatter(2000)
				));
	}
	
	public static CaveEvent greatSea() {
		return new CaveEvent().monsters(
				new MonsterSet("Crawlers", false, 20).monsters(
						new MonsterEvent(Character.Crawler_veteran, 4, 7),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Crawlerhusks", false, 20).monsters(
						new MonsterEvent(Character.Crawlerhusk, 8, 10),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Spinelings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 5, 6),
						new MonsterEvent(Character.Spineling_morbusine, 2, 3),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Mudraptors", false, 15).monsters(
						new MonsterEvent(Character.Mudraptor, 4, 6),
						new MonsterEvent(Character.Mudraptor_veteran, 1, 2).spawnprobability(0.5).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Mudraptors2", false, 15).monsters(
						new MonsterEvent(Character.Mudraptor_veteran, 3, 4),
						new MonsterEvent(Character.Mudraptor, 2, 3).spawnprobability(0.5).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Bonethresher_caves", false, 20).monsters(
						new MonsterEvent(Character.Bonethresher_cave, 4, 5),
						new MonsterEvent(Character.Bonethresher_veteran, 1, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Tigerthreshers", false, 20).monsters(
						new MonsterEvent(Character.Tigerthresher_veteran, 3, 4),
						new MonsterEvent(Character.Bonethresher_cave, 1, 2).spawnprobability(0.5).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Mantis", false, 20).monsters(
						new MonsterEvent(Character.Mantis, 3, 5).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Bonethresher_cave, 2, 3).spawnprobability(0.5).scatter(2000),
						new MonsterEvent(Character.Bonethresher_cave, 2, 3).spawnprobability(0.5).scatter(2000)
				));
	}
	
	public static CaveEvent hydrothermalWastes() {
		return new CaveEvent().monsters(
				new MonsterSet("Crawlers", false, 20).monsters(
						new MonsterEvent(Character.Crawler_veteran, 5, 10),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Crawlerhusks", false, 20).monsters(
						new MonsterEvent(Character.Crawlerhusk, 8, 10),
						new MonsterEvent(Character.Crawlerhusk, 8, 10).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Spinelings", false, 20).monsters(
						new MonsterEvent(Character.Spineling, 5, 10),
						new MonsterEvent(Character.Spineling_morbusine, 2, 3),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Mudraptors", false, 20).monsters(
						new MonsterEvent(Character.Mudraptor_veteran, 5, 6),
						new MonsterEvent(Character.Mudraptor_veteran, 1, 2).spawnprobability(0.5).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Bonethresher_caves", false, 20).monsters(
						new MonsterEvent(Character.Bonethresher_cave, 5, 6),
						new MonsterEvent(Character.Bonethresher_veteran, 1, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Tigerthreshers", false, 20).monsters(
						new MonsterEvent(Character.Tigerthresher_veteran, 3, 5),
						new MonsterEvent(Character.Bonethresher_cave, 2, 3).spawnprobability(0.5).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000)
				),
				new MonsterSet("Mantis", false, 20).monsters(
						new MonsterEvent(Character.Mantis, 3, 5).scatter(2000),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.33).scatter(2000),
						new MonsterEvent(Character.Bonethresher_cave, 2, 3).spawnprobability(0.5).scatter(2000),
						new MonsterEvent(Character.Bonethresher_cave, 2, 3).spawnprobability(0.5).scatter(2000)
				));
	}
}
