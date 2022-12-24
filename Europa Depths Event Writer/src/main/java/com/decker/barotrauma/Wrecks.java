package com.decker.barotrauma;

import com.decker.barotrauma.campaign.Charactor;
import com.decker.barotrauma.campaign.MonsterEvent;
import com.decker.barotrauma.campaign.MonsterSet;
import com.decker.barotrauma.campaign.WreckEncountersEvent;
import com.decker.barotrauma.campaign.WreckEvent;

public class Wrecks {
	
	public static WreckEncountersEvent coldCavernsEncounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 1, 2),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2)),
				new MonsterSet("crawler_vs_mudraptor", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 1, 2),
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2)),
				new MonsterSet("husks", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 2, 3),
						new MonsterEvent(Charactor.Crawlerhusk, 0, 3)));
	}
	
	public static WreckEvent coldCaverns() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 1).spawndistance(1000)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 3).spawnprobability(0.5).spawndistance(1000)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor, 0, 2).spawndistance(1000)),
				new MonsterSet("hammerheads", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Hammerhead, 1, 1).spawndistance(1000)));
	}
	
	public static WreckEncountersEvent europanRidgeEncounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 3, 4),
						new MonsterEvent(Charactor.Crawlerhusk, 2, 3)),
				new MonsterSet("crawler_vs_mudraptor", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 2, 4),
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2)),
				new MonsterSet("crawler_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 2, 4),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2)),
				new MonsterSet("mudraptor_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor, 2, 3),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2)),
				new MonsterSet("husks", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 2, 5),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2)));
	}
	
	public static WreckEvent europanRidge() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 0, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 0, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2).spawndistance(1000)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 0, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 0, 3).spawndistance(1000)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor, 0, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor, 0, 2).spawndistance(1000)),
				new MonsterSet("hammerheads", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Hammerhead, 1, 3).spawndistance(1000).scatter(1000)));
	}
	
	public static WreckEncountersEvent aphoticPlateau1Encounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 3, 5),
						new MonsterEvent(Charactor.Crawlerhusk, 2, 4)),
				new MonsterSet("crawler_vs_mudraptor", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 2, 5),
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 3)),
				new MonsterSet("crawler_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 2, 5),
						new MonsterEvent(Charactor.Tigerthresher, 1, 3)),
				new MonsterSet("mudraptor_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor, 2, 3),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2)),
				new MonsterSet("husks", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 2, 5),
						new MonsterEvent(Charactor.Crawlerhusk, 0, 5)),
				new MonsterSet("huskcrawlers", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 4, 6)));
	}
	
	public static WreckEvent aphoticPlateau1() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2).spawndistance(1000)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 3).spawndistance(1000)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Watcher, 0, 1).spawndistance(1000)),
				new MonsterSet("threshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Tigerthresher, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2).spawndistance(1000)),
				new MonsterSet("hammerheads", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Hammerhead, 1, 3).spawndistance(2000).scatter(1000),
						new MonsterEvent(Charactor.Hammerheadgold, 1, 2).spawndistance(2000).scatter(1000),
						new MonsterEvent(Charactor.Hammerheadblack, 1, 3).spawndistance(2000).scatter(1000)),
				new MonsterSet("hammerheadsblack", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Hammerheadgold, 2, 2).spawndistance(2000).scatter(1000),
						new MonsterEvent(Charactor.Hammerheadblack, 2, 3).spawndistance(2000).scatter(1000)));
	}
	
	public static WreckEncountersEvent aphoticPlateau2Encounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 3, 5),
						new MonsterEvent(Charactor.Crawlerhusk, 3, 4)),
				new MonsterSet("crawler_vs_mudraptor", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 2, 5),
						new MonsterEvent(Charactor.Mudraptor, 1, 3)),
				new MonsterSet("crawler_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 3, 5),
						new MonsterEvent(Charactor.Tigerthresher, 2, 3)),
				new MonsterSet("mudraptor_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor, 2, 4),
						new MonsterEvent(Charactor.Tigerthresher, 2, 3)),
				new MonsterSet("husks", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 2, 5),
						new MonsterEvent(Charactor.Crawlerhusk, 2, 5)),
				new MonsterSet("huskcrawlers", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 5, 6)));
	}
	
	public static WreckEvent aphoticPlateau2() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2).spawndistance(1000)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 1, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 3).spawndistance(1000)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 3).spawndistance(1000)),
				new MonsterSet("tigerthreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Tigerthresher, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2).spawndistance(1000)),
				new MonsterSet("cavebonethreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Bonethresher_cave, 1, 1).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 1, 1).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 1, 1).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 0, 1).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 0, 1).spawndistance(1000)),
				new MonsterSet("hammerhead_juvenile", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Hammerhead_juvenile, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 1, 1).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 1, 1).spawndistance(1000)),
				new MonsterSet("hammerheadsblack", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Hammerheadblack, 2, 4).spawndistance(5000),
						new MonsterEvent(Charactor.Husk, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 2, 3).spawndistance(1000)));
	}
	
	public static WreckEncountersEvent greatSeaEncounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 40).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 3, 5),
						new MonsterEvent(Charactor.Crawlerhusk, 2, 5)),
				new MonsterSet("crawler_vs_mudraptor", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 4, 5),
						new MonsterEvent(Charactor.Mudraptor, 3, 5)),
				new MonsterSet("crawler_vs_thresher", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 2, 5),
						new MonsterEvent(Charactor.Tigerthresher, 2, 4)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor_unarmored, 2, 4),
						new MonsterEvent(Charactor.Mudraptor, 2, 4)),
				new MonsterSet("husks", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 4, 5),
						new MonsterEvent(Charactor.Crawlerhusk, 2, 5)),
				new MonsterSet("huskcrawlers", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 5, 6)));
	}
	
	public static WreckEvent greatSea() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 3, 5).spawndistance(1000)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler_veteran, 2, 4).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler_veteran, 2, 4).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler_veteran, 2, 4).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler_veteran, 2, 4).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 3, 4).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 3, 4).spawndistance(1000)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 3).spawndistance(1000)),
				new MonsterSet("tigerthreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Tigerthresher_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher_veteran, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher_veteran, 2, 3).spawndistance(1000)),
				new MonsterSet("cavebonethreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Bonethresher_cave, 1, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 1, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 1, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 1, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 1, 3).spawndistance(1000)),
				new MonsterSet("hammerhead_juvenile", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Hammerhead_juvenile, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 2, 3).spawndistance(1000)),
				new MonsterSet("hammerheadsblack", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Hammerheadblack, 2, 4).spawndistance(5000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000)),
				new MonsterSet("charybdisjuvenile", false, 1).monsters(
						new MonsterEvent(Charactor.Charybdis_juvenile, 1, 1).spawndistance(5000)));
	}
	
	public static WreckEncountersEvent hydrothermalWastesEncounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 40).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler_veteran, 4, 5),
						new MonsterEvent(Charactor.Crawlerhusk, 6, 10)),
				new MonsterSet("crawler_vs_mudraptor", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler_veteran, 4, 5),
						new MonsterEvent(Charactor.Mudraptor_veteran, 3, 5)),
				new MonsterSet("crawler_vs_thresher", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler_veteran, 2, 5),
						new MonsterEvent(Charactor.Bonethresher_cave, 2, 4)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor, 2, 4),
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 4)),
				new MonsterSet("husks", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 5, 6),
						new MonsterEvent(Charactor.Crawlerhusk, 6, 10)),
				new MonsterSet("huskcrawlers", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 10, 15)));
	}
	
	public static WreckEvent hydrothermalWastes() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 3, 5).spawndistance(1000)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler_veteran, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler_veteran, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler_veteran, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler_veteran, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 3, 5).spawndistance(1000)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor_veteran, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_veteran, 3, 5).spawndistance(1000)),
				new MonsterSet("tigerthreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Tigerthresher_veteran, 3, 4).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher_veteran, 3, 4).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher_veteran, 3, 4).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher_veteran, 3, 4).spawndistance(1000),
						new MonsterEvent(Charactor.Tigerthresher_veteran, 3, 4).spawndistance(1000)),
				new MonsterSet("cavebonethreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Bonethresher_cave, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Bonethresher_cave, 2, 3).spawndistance(1000)),
				new MonsterSet("bonethreshers", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Bonethresher_veteran, 2, 3).spawndistance(3000),
						new MonsterEvent(Charactor.Bonethresher_veteran, 2, 3).spawndistance(3000),
						new MonsterEvent(Charactor.Bonethresher_veteran, 2, 3).spawndistance(3000),
						new MonsterEvent(Charactor.Bonethresher_veteran, 2, 3).spawndistance(3000),
						new MonsterEvent(Charactor.Bonethresher_veteran, 2, 3).spawndistance(3000)),
				new MonsterSet("hammerhead_juvenile", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Hammerhead_juvenile, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 2, 3).spawndistance(1000),
						new MonsterEvent(Charactor.Hammerhead_juvenile, 2, 3).spawndistance(1000)),
				new MonsterSet("hammerheadsblack", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Hammerheadblack, 2, 4).spawndistance(5000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 3, 5).spawndistance(1000)),
				new MonsterSet("charybdisjuvenile", false, 1).monsters(
						new MonsterEvent(Charactor.Charybdis_juvenile, 1, 1).spawndistance(5000)));
	}
}
