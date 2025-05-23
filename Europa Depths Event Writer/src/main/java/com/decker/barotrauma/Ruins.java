package com.decker.barotrauma;

import com.decker.barotrauma.components.Character;
import com.decker.barotrauma.components.MonsterEvent;
import com.decker.barotrauma.components.MonsterSet;
import com.decker.barotrauma.components.RuinEncounters;
import com.decker.barotrauma.components.RuinEvent;

public class Ruins {
	
	public static RuinEvent europanRidge() {
		return new RuinEvent().monsters(
				new MonsterEvent(Character.Swarmfeeder, 5, 6).probability(1).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Character.Fractalguardian2, 1, 2).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalguardian, 0, 2).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalbrain1, 0, 1).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Husk, 2, 3).probability(0.8).spawnpointtag("husk"),
				new MonsterEvent(Character.Husk, 2, 3).probability(0.6).spawnpointtag("husk"),
				new MonsterEvent(Character.Husk_prowler, 2, 3).probability(0.4).spawnpointtag("husk"),
				new MonsterEvent(Character.Crawlerhusk, 1, 2).probability(0.3).spawnpointtag("husk"),
				new MonsterEvent(Character.Fractalguardian, 1, 2).probability(1).spawnpointtag("workshopguardian"),
				
				new RuinEncounters().monsters(
						new MonsterSet("entrance1", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 2),
								new MonsterEvent(Character.Fractalbrain1, 1, 1),
								new MonsterEvent(Character.Crawler, 1, 3)).spawnpointtag("encounter_entrance1"),
						new MonsterSet("entrance2", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 2).spawndistance(1500),
								new MonsterEvent(Character.Fractalbrain1, 0, 1).spawndistance(1500),
								new MonsterEvent(Character.Crawler, 1, 3)).spawnpointtag("encounter_entrance2"),
						new MonsterSet("entrance3", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 2),
								new MonsterEvent(Character.Fractalbrain1, 0, 1),
								new MonsterEvent(Character.Crawler, 1, 3)).spawnpointtag("encounter_entrance3"),
						new MonsterSet("chambers1", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 2),
								new MonsterEvent(Character.Fractalbrain1, 0, 1),
								new MonsterEvent(Character.Crawler, 1, 3)).spawnpointtag("encounter_chambers1"),
						new MonsterSet("maze_husks", false).monsters(
								new MonsterEvent(Character.Husk, 1, 2),
								new MonsterEvent(Character.Husk, 1, 2)).spawnpointtag("mazehusk")));
	}
	
	public static RuinEvent aphoticPlateau1() {
		return new RuinEvent().monsters(
				new MonsterEvent(Character.Swarmfeeder, 5, 8).probability(1).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Character.Swarmfeeder, 4, 6).probability(0.3).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Character.Fractalguardian2, 2, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalguardian, 2, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalbrain1, 1, 2).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Husk, 2, 5).probability(0.8).spawnpointtag("husk"),
				new MonsterEvent(Character.Husk, 2, 5).probability(0.6).spawnpointtag("husk"),
				new MonsterEvent(Character.Husk, 2, 5).probability(0.4).spawnpointtag("husk"),
				new MonsterEvent(Character.Crawlerhusk, 1, 2).probability(0.3).spawnpointtag("husk"),
				
				new RuinEncounters().monsters(
						new MonsterSet("entrance1", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 2),
								new MonsterEvent(Character.Fractalbrain1, 1, 2)).spawnpointtag("encounter_entrance1"),
						new MonsterSet("entrance2", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 2),
								new MonsterEvent(Character.Fractalbrain1, 1, 2)).spawnpointtag("encounter_entrance2"),
						new MonsterSet("entrance3", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 2, 3),
								new MonsterEvent(Character.Fractalbrain1, 1, 2)).spawnpointtag("encounter_entrance3"),
						new MonsterSet("chambers1", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 2),
								new MonsterEvent(Character.Fractalbrain1, 1, 2)).spawnpointtag("encounter_chambers1"),
						new MonsterSet("workshop_guardians", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 2).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalguardian2, 1, 2).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalbrain1, 1, 2).spawnpointtag("workshopguardian")),
						new MonsterSet("maze_husks", false).monsters(
								new MonsterEvent(Character.Husk, 1, 2),
								new MonsterEvent(Character.Husk_prowler, 0, 2),
								new MonsterEvent(Character.Husk_chimera, 0, 2)).spawnpointtag("mazehusk")));
	}
	
	public static RuinEvent aphoticPlateau2() {
		return new RuinEvent().monsters(
				new MonsterEvent(Character.Swarmfeeder, 5, 8).probability(1).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Character.Swarmfeeder, 4, 6).probability(0.3).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Character.Fractalguardian2, 1, 2).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalguardian, 1, 2).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalbrain1, 1, 2).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalguardian3, 0, 2).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Husk, 2, 5).probability(0.8).spawnpointtag("husk"),
				new MonsterEvent(Character.Husk, 2, 5).probability(0.6).spawnpointtag("husk"),
				new MonsterEvent(Character.Husk, 2, 5).probability(0.4).spawnpointtag("husk"),
				new MonsterEvent(Character.Crawlerhusk, 1, 2).probability(0.3).spawnpointtag("husk"),
				
				new RuinEncounters().monsters(
						new MonsterSet("entrance1", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 3),
								new MonsterEvent(Character.Fractalbrain1, 1, 2),
								new MonsterEvent(Character.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance1"),
						new MonsterSet("entrance2", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 3).spawndistance(1500),
								new MonsterEvent(Character.Fractalbrain1, 1, 2).spawndistance(1500),
								new MonsterEvent(Character.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance2"),
						new MonsterSet("entrance3", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 2, 3),
								new MonsterEvent(Character.Fractalbrain1, 1, 2),
								new MonsterEvent(Character.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_entrance3"),
						new MonsterSet("chambers1", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 3),
								new MonsterEvent(Character.Fractalbrain1, 1, 2),
								new MonsterEvent(Character.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_chambers1"),
						new MonsterSet("workshop_guardians", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 2).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalguardian, 0, 1).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalguardian2, 1, 2).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalbrain1, 1, 2).spawnpointtag("workshopguardian")),
						new MonsterSet("maze_husks", false).monsters(
								new MonsterEvent(Character.Husk, 1, 2),
								new MonsterEvent(Character.Husk_prowler, 1, 2),
								new MonsterEvent(Character.Husk_chimera, 1, 2)).spawnpointtag("mazehusk")));
	}
	
	public static RuinEvent greatSea() {
		return new RuinEvent().monsters(
				new MonsterEvent(Character.Swarmfeeder, 6, 9).probability(1).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Character.Swarmfeeder, 6, 9).probability(0.3).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Character.Fractalguardian2, 2, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalguardian, 2, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalbrain1, 1, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalguardian3, 1, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalguardian_veteran, 1, 2).offset(3000).scatter(1000).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Husk, 3, 5).probability(0.5).spawnpointtag("husk"),
				new MonsterEvent(Character.Husk, 3, 5).probability(0.5).spawnpointtag("husk"),
				new MonsterEvent(Character.Crawlerhusk, 1, 2).probability(0.5).spawnpointtag("husk"),
				
				new RuinEncounters().monsters(
						new MonsterSet("entrance1", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 2, 3),
								new MonsterEvent(Character.Fractalguardian2, 2, 3),
								new MonsterEvent(Character.Fractalbrain1, 2, 2),
								new MonsterEvent(Character.Hammerheadblack, 1, 2).spawndistance(3000)).spawnpointtag("encounter_entrance1"),
						new MonsterSet("entrance2", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 2, 3).spawndistance(1500),
								new MonsterEvent(Character.Fractalguardian2, 2, 3).spawndistance(1500),
								new MonsterEvent(Character.Fractalbrain1, 2, 2).spawndistance(1500),
								new MonsterEvent(Character.Hammerheadblack, 1, 2).spawndistance(3000)).spawnpointtag("encounter_entrance2"),
						new MonsterSet("entrance3", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 2, 3),
								new MonsterEvent(Character.Fractalguardian2, 2, 3),
								new MonsterEvent(Character.Fractalbrain1, 2, 2),
								new MonsterEvent(Character.Hammerheadblack, 1, 2).spawndistance(3000)).spawnpointtag("encounter_entrance3"),
						new MonsterSet("chambers1", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 2, 3),
								new MonsterEvent(Character.Fractalguardian2, 2, 3),
								new MonsterEvent(Character.Fractalbrain1, 2, 2),
								new MonsterEvent(Character.Hammerheadblack, 1, 2).spawndistance(1500)).spawnpointtag("encounter_chambers1"),
						new MonsterSet("workshop_guardians", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 2).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalguardian, 0, 1).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalguardian2, 1, 2).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalguardian3, 1, 2).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalbrain1, 1, 2).spawnpointtag("workshopguardian")),
						new MonsterSet("maze_husks", false).monsters(
								new MonsterEvent(Character.Husk, 1, 3),
								new MonsterEvent(Character.Husk_prowler, 1, 2),
								new MonsterEvent(Character.Husk_chimera, 1, 2)).spawnpointtag("mazehusk")));
	}
	
	public static RuinEvent wastes() {
		return new RuinEvent().monsters(
				new MonsterEvent(Character.Swarmfeeder, 6, 9).probability(1).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Character.Swarmfeeder, 6, 9).probability(0.3).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Character.Fractalguardian2, 3, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalguardian, 3, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalbrain1, 2, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalguardian3, 2, 3).probability(1).spawnpointtag("fractalguardian"),
				new MonsterEvent(Character.Fractalguardian_veteran, 2, 2).offset(3000).scatter(1000).spawnpointtag("workshopguardian"),
				new MonsterEvent(Character.Husk, 2, 5).probability(0.5).spawnpointtag("husk"),
				new MonsterEvent(Character.Husk, 2, 5).probability(0.5).spawnpointtag("husk"),
				new MonsterEvent(Character.Crawlerhusk, 1, 2).probability(0.5).spawnpointtag("husk"),
				
				new RuinEncounters().monsters(
						new MonsterSet("entrance1", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 2, 3),
								new MonsterEvent(Character.Fractalguardian2, 2, 3),
								new MonsterEvent(Character.Fractalbrain1, 2, 2),
								new MonsterEvent(Character.Portalguardian, 1, 2).spawndistance(3000)).spawnpointtag("encounter_entrance1"),
						new MonsterSet("entrance2", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 2, 3).spawndistance(1500),
								new MonsterEvent(Character.Fractalguardian2, 2, 3).spawndistance(1500),
								new MonsterEvent(Character.Fractalbrain1, 2, 2).spawndistance(1500),
								new MonsterEvent(Character.Portalguardian, 1, 2).spawndistance(3000)).spawnpointtag("encounter_entrance2"),
						new MonsterSet("entrance3", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 2, 3),
								new MonsterEvent(Character.Fractalguardian2, 2, 3),
								new MonsterEvent(Character.Fractalbrain1, 2, 2),
								new MonsterEvent(Character.Portalguardian, 1, 2).spawndistance(3000)).spawnpointtag("encounter_entrance3"),
						new MonsterSet("chambers1", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 2, 3),
								new MonsterEvent(Character.Fractalguardian2, 2, 3),
								new MonsterEvent(Character.Fractalbrain1, 2, 2),
								new MonsterEvent(Character.Portalguardian, 1, 2).spawndistance(1500)).spawnpointtag("encounter_chambers1"),
						new MonsterSet("workshop_guardians", false).monsters(
								new MonsterEvent(Character.Fractalguardian, 1, 2).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalguardian, 1, 2).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalguardian2, 1, 2).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalguardian3, 2, 2).spawnpointtag("workshopguardian"),
								new MonsterEvent(Character.Fractalbrain1, 2, 3).spawnpointtag("workshopguardian")),
						new MonsterSet("maze_husks", false).monsters(
								new MonsterEvent(Character.Husk, 1, 3),
								new MonsterEvent(Character.Husk_prowler, 1, 2),
								new MonsterEvent(Character.Husk_chimera, 1, 2)).spawnpointtag("mazehusk")));
	}
}
