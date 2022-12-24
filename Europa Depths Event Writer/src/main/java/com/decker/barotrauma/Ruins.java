package com.decker.barotrauma;

import com.decker.barotrauma.campaign.Charactor;
import com.decker.barotrauma.campaign.MonsterEvent;
import com.decker.barotrauma.campaign.MonsterSet;
import com.decker.barotrauma.campaign.RuinEncounters;
import com.decker.barotrauma.campaign.RuinEvent;

public class Ruins {
	
	public static RuinEvent europanRidge() {
		return new RuinEvent().monsters(
				new MonsterEvent(Charactor.Swarmfeeder, 5, 6).probability(1).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Charactor.Fractalguardian2, 1, 2).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Fractalguardian, 0, 2).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Fractalbrain1, 0, 1).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Husk, 2, 3).probability(0.8).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Husk, 2, 3).probability(0.6).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Husk, 2, 3).probability(0.4).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Crawlerhusk, 1, 2).probability(0.3).spawnpointtag("husk"),
				
				new RuinEncounters().monsters(
						new MonsterSet("entrance1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 1, 2),
								new MonsterEvent(Charactor.Fractalbrain1, 1, 1),
								new MonsterEvent(Charactor.Crawler, 1, 3)).spawnpointtag("encounter_entrance1"),
						new MonsterSet("entrance2", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 1, 2),
								new MonsterEvent(Charactor.Fractalbrain1, 0, 1),
								new MonsterEvent(Charactor.Crawler, 1, 3)).spawnpointtag("encounter_entrance2"),
						new MonsterSet("entrance3", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 1, 2),
								new MonsterEvent(Charactor.Fractalbrain1, 0, 1),
								new MonsterEvent(Charactor.Crawler, 1, 3)).spawnpointtag("encounter_entrance3"),
						new MonsterSet("chambers1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 1, 2),
								new MonsterEvent(Charactor.Fractalbrain1, 0, 1),
								new MonsterEvent(Charactor.Crawler, 1, 3)).spawnpointtag("encounter_chambers1")));
	}
	
	public static RuinEvent aphoticPlateau1() {
		return new RuinEvent().monsters(
				new MonsterEvent(Charactor.Swarmfeeder, 5, 8).probability(1).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Charactor.Swarmfeeder, 4, 6).probability(0.3).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Charactor.Fractalguardian2, 2, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Fractalguardian, 2, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Fractalbrain1, 1, 2).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Husk, 2, 5).probability(0.8).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Husk, 2, 5).probability(0.6).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Husk, 2, 5).probability(0.4).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Crawlerhusk, 1, 2).probability(0.3).spawnpointtag("husk"),
				
				new RuinEncounters().monsters(
						new MonsterSet("entrance1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 1, 2),
								new MonsterEvent(Charactor.Fractalbrain1, 1, 2)).spawnpointtag("encounter_entrance1"),
						new MonsterSet("entrance2", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 1, 2),
								new MonsterEvent(Charactor.Fractalbrain1, 1, 2)).spawnpointtag("encounter_entrance2"),
						new MonsterSet("entrance3", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 1, 2)).spawnpointtag("encounter_entrance3"),
						new MonsterSet("chambers1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 1, 2),
								new MonsterEvent(Charactor.Fractalbrain1, 1, 2)).spawnpointtag("encounter_chambers1")));
	}
	
	public static RuinEvent aphoticPlateau2() {
		return new RuinEvent().monsters(
				new MonsterEvent(Charactor.Swarmfeeder, 5, 8).probability(1).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Charactor.Swarmfeeder, 4, 6).probability(0.3).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Charactor.Fractalguardian2, 2, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Fractalguardian, 2, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Fractalbrain1, 0, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Husk, 2, 5).probability(0.8).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Husk, 2, 5).probability(0.6).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Husk, 2, 5).probability(0.4).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Crawlerhusk, 1, 2).probability(0.3).spawnpointtag("husk"),
				
				new RuinEncounters().monsters(
						new MonsterSet("entrance1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 1, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 1, 2),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance1"),
						new MonsterSet("entrance2", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 1, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 1, 2),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance2"),
						new MonsterSet("entrance3", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 1, 2),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance3"),
						new MonsterSet("chambers1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 1, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 1, 2),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_chambers1")));
	}
	
	public static RuinEvent greatSea() {
		return new RuinEvent().monsters(
				new MonsterEvent(Charactor.Swarmfeeder, 6, 9).probability(1).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Charactor.Swarmfeeder, 6, 9).probability(0.3).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Charactor.Fractalguardian2, 3, 6).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Fractalguardian, 3, 6).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Fractalbrain1, 0, 6).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Husk, 3, 5).probability(0.5).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Husk, 3, 5).probability(0.5).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Crawlerhusk, 1, 2).probability(0.5).spawnpointtag("husk"),
				
				new RuinEncounters().monsters(
						new MonsterSet("entrance1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Fractalguardian2, 2, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 2, 2),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance1"),
						new MonsterSet("entrance2", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Fractalguardian2, 2, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 2, 2),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance2"),
						new MonsterSet("entrance3", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Fractalguardian2, 2, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 2, 2),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance3"),
						new MonsterSet("chambers1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Fractalguardian2, 2, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 2, 2),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_chambers1")));
	}
	
	public static RuinEvent wastes() {
		return new RuinEvent().monsters(
				new MonsterEvent(Charactor.Swarmfeeder, 6, 9).probability(1).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Charactor.Swarmfeeder, 6, 9).probability(0.3).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Charactor.Fractalguardian2, 3, 6).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Fractalguardian, 3, 6).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Fractalbrain1, 3, 6).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Husk, 2, 5).probability(0.5).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Husk, 2, 5).probability(0.5).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Crawlerhusk, 1, 2).probability(0.5).spawnpointtag("husk"),
				
				new RuinEncounters().monsters(
						new MonsterSet("entrance1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Fractalguardian2, 2, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 2, 3),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance1"),
						new MonsterSet("entrance2", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Fractalguardian2, 2, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 2, 3),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance2"),
						new MonsterSet("entrance3", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Fractalguardian2, 2, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 2, 3),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance3"),
						new MonsterSet("chambers1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Fractalguardian2, 2, 3),
								new MonsterEvent(Charactor.Fractalbrain1, 2, 3),
								new MonsterEvent(Charactor.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_chambers1")));
	}
}
