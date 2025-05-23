package com.decker.barotrauma;

import com.decker.barotrauma.components.Character;
import com.decker.barotrauma.components.MonsterEvent;
import com.decker.barotrauma.components.MonsterSet;
import com.decker.barotrauma.components.WreckEncountersEvent;
import com.decker.barotrauma.components.WreckEvent;

public class Wrecks {
	
	public static WreckEncountersEvent coldCavernsEncounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 1, 2),
						new MonsterEvent(Character.Crawlerhusk, 1, 2)),
				new MonsterSet("crawler_vs_mudraptor", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 1, 2),
						new MonsterEvent(Character.Mudraptor_unarmored, 1, 2)),
				new MonsterSet("husks", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 2, 3),
						new MonsterEvent(Character.Crawlerhusk, 0, 3)));
	}
	
	public static WreckEvent coldCaverns() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 1, 2).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 1, 2).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Crawlerhusk, 1, 1).spawndistance(1500)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 1, 3).spawnprobability(0.5).spawndistance(1500)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor, 0, 2).spawndistance(1500)),
				new MonsterSet("hammerheads", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Hammerhead, 1, 1).spawndistance(1500)),
				new MonsterSet("fire", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Spineling_red, 3, 6).spawndistance(1500)));
	}
	
	// set 3, 4
	public static WreckEncountersEvent europanRidgeEncounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 3, 4),
						new MonsterEvent(Character.Crawlerhusk, 2, 3)),
				new MonsterSet("crawler_vs_mudraptor", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 2, 4),
						new MonsterEvent(Character.Mudraptor_unarmored, 1, 2)),
				new MonsterSet("crawler_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 2, 4),
						new MonsterEvent(Character.Tigerthresher, 1, 2)),
				new MonsterSet("mudraptor_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Mudraptor, 2, 3),
						new MonsterEvent(Character.Tigerthresher, 1, 2)),
				new MonsterSet("husks", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 2, 5),
						new MonsterEvent(Character.Husk_prowler, 1, 2)));
	}
	
	// Set 3, 4
	public static WreckEvent europanRidge() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 1, 2).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 1, 2).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 0, 2).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 0, 2).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk_prowler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Husk_prowler, 1, 2).spawndistance(1500)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 0, 3).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 0, 3).spawndistance(1500)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_unarmored, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor, 0, 2).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor, 0, 2).spawndistance(1500)),
				new MonsterSet("hammerheads", false, 5).allowatstart(true).monsters(
						new MonsterEvent(Character.Hammerhead, 1, 3).spawndistance(1500).scatter(1000)),
				new MonsterSet("mantises", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Mantis, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 2, 4).spawnprobability(0.5).spawndistance(1500)),
				new MonsterSet("fire", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Spineling_red, 5, 6).spawndistance(1500)));
	}
	
	// Set 5, 6
	public static WreckEncountersEvent aphoticPlateau1Encounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 3, 5),
						new MonsterEvent(Character.Crawlerhusk, 2, 4)),
				new MonsterSet("crawler_vs_mudraptor", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 2, 5),
						new MonsterEvent(Character.Mudraptor_unarmored, 1, 3)),
				new MonsterSet("crawler_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 2, 5),
						new MonsterEvent(Character.Tigerthresher, 1, 3)),
				new MonsterSet("mudraptor_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Mudraptor, 2, 3),
						new MonsterEvent(Character.Tigerthresher, 1, 2)),
				new MonsterSet("husks", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 2, 5).playdeadprobability(1),
						new MonsterEvent(Character.Husk_prowler, 0, 2),
						new MonsterEvent(Character.Husk_prowler, 0, 2),
						new MonsterEvent(Character.Husk_exosuit, 1, 2).spawnprobability(0.5)),
				new MonsterSet("huskcrawlers", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawlerhusk, 4, 6)));
	}
	
	// Set 5, 6
	public static WreckEvent aphoticPlateau1() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 1, 2).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 1, 2).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 1, 2).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 1, 2).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk_prowler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Husk_prowler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Husk_exosuit, 1, 2).spawndistance(1500).spawnprobability(0.5)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Crawlerhusk, 1, 3).spawndistance(1500),
						new MonsterEvent(Character.Crawlerhusk, 1, 3).spawndistance(1500)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_unarmored, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor, 1, 2).spawndistance(1500)),
				new MonsterSet("threshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Tigerthresher, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher, 1, 2).spawndistance(1500)),
				new MonsterSet("hammerhead_juvenile", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 1).spawndistance(1500)),
				new MonsterSet("mantises", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Mantis, 1, 3).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 1, 3).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 1, 3).spawnprobability(0.5).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 1, 3).spawnprobability(0.5).spawndistance(1500)),
				new MonsterSet("fire", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Spineling_red, 6, 6).spawndistance(1500)));
	}
	
	public static WreckEncountersEvent aphoticPlateau2Encounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 3, 5),
						new MonsterEvent(Character.Crawlerhusk, 3, 4)),
				new MonsterSet("crawler_vs_mudraptor", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 2, 5),
						new MonsterEvent(Character.Mudraptor, 1, 3)),
				new MonsterSet("crawler_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 3, 5),
						new MonsterEvent(Character.Tigerthresher, 2, 3)),
				new MonsterSet("mudraptor_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Character.Mudraptor, 2, 4),
						new MonsterEvent(Character.Tigerthresher, 2, 3)),
				new MonsterSet("spinlings", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Spineling, 6, 8),
						new MonsterEvent(Character.Spineling_red, 1, 2)),
				new MonsterSet("husks", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 2, 5).playdeadprobability(1),
						new MonsterEvent(Character.Husk_prowler, 2, 5),
						new MonsterEvent(Character.Husk_exosuit, 1, 2)),
				new MonsterSet("huskcrawlers", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawlerhusk, 5, 6)),
				new MonsterSet("fire", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Spineling_red, 6, 8).spawndistance(1500)));
	}
	
	public static WreckEvent aphoticPlateau2() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 2, 3).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 2, 3).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 2, 3).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 2, 3).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk_prowler, 1, 3).spawndistance(1500),
						new MonsterEvent(Character.Husk_prowler, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Husk_exosuit, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Husk_chimera, 1, 2).spawndistance(1500).spawnprobability(0.75)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 1, 3).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 1, 3).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 1, 3).spawndistance(1500),
						new MonsterEvent(Character.Crawler, 1, 3).spawndistance(1500)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3).spawndistance(1500)),
				new MonsterSet("tigerthreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Tigerthresher, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher, 1, 2).spawndistance(1500)),
				new MonsterSet("cavebonethreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Bonethresher_cave, 1, 1).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 1, 1).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 1, 1).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 0, 1).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 0, 1).spawndistance(1500)),
				new MonsterSet("hammerhead_juvenile", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 2).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 1).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 1, 1).spawndistance(1500)),
				new MonsterSet("hammerheadsblack", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Hammerheadblack, 2, 4).spawndistance(5000),
						new MonsterEvent(Character.Husk, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Husk, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Husk, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Husk_prowler, 2, 3).spawndistance(1500)),
				new MonsterSet("mantises", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Mantis, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.5).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 2, 3).spawnprobability(0.5).spawndistance(1500)));
	}
	
	public static WreckEncountersEvent greatSeaEncounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 40).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler_veteran, 3, 5),
						new MonsterEvent(Character.Crawlerhusk, 2, 5)),
				new MonsterSet("crawler_vs_mudraptor", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 4, 5),
						new MonsterEvent(Character.Mudraptor, 3, 5)),
				new MonsterSet("crawler_vs_thresher", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler, 2, 5),
						new MonsterEvent(Character.Tigerthresher, 2, 4)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Mudraptor_unarmored, 2, 4),
						new MonsterEvent(Character.Mudraptor, 2, 4)),
				new MonsterSet("spinlings", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Spineling, 8, 10),
						new MonsterEvent(Character.Spineling_red, 2, 3)),
				new MonsterSet("husks", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 2, 5).playdeadprobability(1),
						new MonsterEvent(Character.Husk_prowler, 2, 5),
						new MonsterEvent(Character.Husk_exosuit, 2, 2)),
				new MonsterSet("huskcrawlers", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawlerhusk, 5, 6)),
				new MonsterSet("fire", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Spineling_red, 8, 8).spawndistance(1500)));
	}
	
	public static WreckEvent greatSea() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Crawlerhusk, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Crawlerhusk, 3, 5).spawndistance(1500)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler_veteran, 2, 4).spawndistance(1500),
						new MonsterEvent(Character.Crawler_veteran, 2, 4).spawndistance(1500),
						new MonsterEvent(Character.Crawler_veteran, 2, 4).spawndistance(1500),
						new MonsterEvent(Character.Crawler_veteran, 2, 4).spawndistance(1500),
						new MonsterEvent(Character.Crawlerhusk, 3, 4).spawndistance(1500),
						new MonsterEvent(Character.Crawlerhusk, 3, 4).spawndistance(1500)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 2, 3).spawndistance(1500)),
				new MonsterSet("tigerthreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Tigerthresher_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher_veteran, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher_veteran, 2, 3).spawndistance(1500)),
				new MonsterSet("cavebonethreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Bonethresher_cave, 1, 3).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 1, 3).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 1, 3).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 1, 3).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 1, 3).spawndistance(1500)),
				new MonsterSet("hammerhead_juvenile", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Hammerhead_juvenile, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 2, 3).spawndistance(1500)),
				new MonsterSet("hammerheadsblack", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Hammerheadblack, 2, 4).spawndistance(5000),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk_prowler, 2, 5).spawndistance(1500),
						new MonsterEvent(Character.Husk_exosuit, 1, 2).spawndistance(1500)),
				new MonsterSet("mantises", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Mantis, 2, 4).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 2, 5).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 2, 4).spawnprobability(0.5).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 2, 4).spawnprobability(0.5).spawndistance(1500)));
	}
	
	public static WreckEncountersEvent hydrothermalWastesEncounters() {
		return new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 40).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler_veteran, 4, 5),
						new MonsterEvent(Character.Crawlerhusk, 6, 10)),
				new MonsterSet("crawler_vs_mudraptor", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler_veteran, 4, 5),
						new MonsterEvent(Character.Mudraptor_veteran, 3, 5)),
				new MonsterSet("crawler_vs_thresher", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler_veteran, 2, 5),
						new MonsterEvent(Character.Bonethresher_cave, 2, 4)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Mudraptor, 2, 4),
						new MonsterEvent(Character.Mudraptor_veteran, 2, 4)),
				new MonsterSet("spinlings", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Spineling, 10, 15),
						new MonsterEvent(Character.Spineling_red, 6, 8)),
				new MonsterSet("husks", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 5, 6).playdeadprobability(1),
						new MonsterEvent(Character.Crawlerhusk, 6, 10)),
				new MonsterSet("huskcrawlers", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawlerhusk, 10, 15)),
				new MonsterSet("fire", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Spineling_red, 8, 8).spawndistance(1500)));
	}
	
	public static WreckEvent hydrothermalWastes() {
		return new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk_prowler, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Husk_exosuit, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Husk_chimera, 2, 3).spawndistance(1500)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Character.Crawler_veteran, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Crawler_veteran, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Crawler_veteran, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Crawler_veteran, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Crawlerhusk, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Crawlerhusk, 3, 5).spawndistance(1500)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Mudraptor_veteran, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Mudraptor_veteran, 3, 5).spawndistance(1500)),
				new MonsterSet("tigerthreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Tigerthresher_veteran, 3, 4).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher_veteran, 3, 4).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher_veteran, 3, 4).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher_veteran, 3, 4).spawndistance(1500),
						new MonsterEvent(Character.Tigerthresher_veteran, 3, 4).spawndistance(1500)),
				new MonsterSet("cavebonethreshers", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Character.Bonethresher_cave, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Bonethresher_cave, 2, 3).spawndistance(1500)),
				new MonsterSet("bonethreshers", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Bonethresher_veteran, 2, 3).spawndistance(3000),
						new MonsterEvent(Character.Bonethresher_veteran, 2, 3).spawndistance(3000),
						new MonsterEvent(Character.Bonethresher_veteran, 2, 3).spawndistance(3000),
						new MonsterEvent(Character.Bonethresher_veteran, 2, 3).spawndistance(3000),
						new MonsterEvent(Character.Bonethresher_veteran, 2, 3).spawndistance(3000)),
				new MonsterSet("hammerhead_juvenile", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Hammerhead_juvenile, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 2, 3).spawndistance(1500),
						new MonsterEvent(Character.Hammerhead_juvenile, 2, 3).spawndistance(1500)),
				new MonsterSet("hammerheadsblack", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Hammerheadblack, 2, 4).spawndistance(5000),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk, 3, 5).spawndistance(1500).playdeadprobability(1),
						new MonsterEvent(Character.Husk_prowler, 2, 5).spawndistance(1500),
						new MonsterEvent(Character.Husk_exosuit, 3, 4).spawndistance(1500),
						new MonsterEvent(Character.Husk_chimera, 2, 4).spawndistance(1500)),
				new MonsterSet("mantises", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Character.Mantis, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 3, 5).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 3, 5).spawnprobability(0.5).spawndistance(1500),
						new MonsterEvent(Character.Mantis, 3, 5).spawnprobability(0.5).spawndistance(1500)));
	}
}
