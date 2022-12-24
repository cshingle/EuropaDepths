package com.decker.barotrauma;

import com.decker.barotrauma.campaign.CaveEvent;
import com.decker.barotrauma.campaign.Charactor;
import com.decker.barotrauma.campaign.MonsterEvent;

public class Caves {
	
	public static CaveEvent coldCaverns() {
		return new CaveEvent().monsters(
				new MonsterEvent(Charactor.Crawler, 2, 4),
				new MonsterEvent(Charactor.Crawlerhusk, 2, 3),
				new MonsterEvent(Charactor.Spineling, 2, 3),
				new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2));
	}
	
	public static CaveEvent europanRidge() {
		return new CaveEvent().monsters(
				new MonsterEvent(Charactor.Crawler, 2, 5),
				new MonsterEvent(Charactor.Crawlerhusk, 2, 5),
				new MonsterEvent(Charactor.Spineling, 2, 5),
				new MonsterEvent(Charactor.Mudraptor_unarmored, 2, 5),
				new MonsterEvent(Charactor.Bonethresher_cave, 1, 2),
				new MonsterEvent(Charactor.Tigerthresher, 1, 3));
	}
	
	public static CaveEvent aphoticPlateau() {
		return new CaveEvent().monsters(
				new MonsterEvent(Charactor.Crawler, 3, 6),
				new MonsterEvent(Charactor.Crawlerhusk, 3, 6),
				new MonsterEvent(Charactor.Spineling, 4, 6),
				new MonsterEvent(Charactor.Mudraptor_unarmored, 3, 6),
				new MonsterEvent(Charactor.Mudraptor, 2, 4),
				new MonsterEvent(Charactor.Tigerthresher, 2, 4),
				new MonsterEvent(Charactor.Mudraptor_veteran, 2, 3),
				new MonsterEvent(Charactor.Bonethresher_cave, 2, 3));
	}
	
	public static CaveEvent greatSea() {
		return new CaveEvent().monsters(
				new MonsterEvent(Charactor.Crawler_veteran, 4, 7),
				new MonsterEvent(Charactor.Crawlerhusk, 8, 10),
				new MonsterEvent(Charactor.Spineling, 5, 6),
				new MonsterEvent(Charactor.Mudraptor, 4, 6),
				new MonsterEvent(Charactor.Mudraptor_veteran, 3, 4),
				new MonsterEvent(Charactor.Tigerthresher_veteran, 3, 4),
				new MonsterEvent(Charactor.Bonethresher_cave, 4, 5),
				new MonsterEvent(Charactor.Bonethresher_veteran, 2, 3));
	}
	
	public static CaveEvent hydrothermalWastes() {
		return new CaveEvent().monsters(
				new MonsterEvent(Charactor.Crawler_veteran, 5, 10),
				new MonsterEvent(Charactor.Crawlerhusk, 8, 10),
				new MonsterEvent(Charactor.Spineling, 5, 10),
				new MonsterEvent(Charactor.Mudraptor_veteran, 5, 6),
				new MonsterEvent(Charactor.Tigerthresher_veteran, 3, 5),
				new MonsterEvent(Charactor.Bonethresher_cave, 4, 6),
				new MonsterEvent(Charactor.Bonethresher_veteran, 3, 4));
	}
	
}
