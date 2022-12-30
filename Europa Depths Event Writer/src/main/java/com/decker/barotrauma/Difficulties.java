package com.decker.barotrauma;

import com.decker.barotrauma.campaign.Character;
import com.decker.barotrauma.campaign.Comment;
import com.decker.barotrauma.campaign.CommonnessEvent;
import com.decker.barotrauma.campaign.DifficultySet;
import com.decker.barotrauma.campaign.EventSet;
import com.decker.barotrauma.campaign.MonsterEvent;
import com.decker.barotrauma.campaign.SpawnEvent;

public class Difficulties {
	
	public static EventSet coldCaverns0() {
		double maxIntensity = 0.25;
		
		return new DifficultySet(0)
				.identifier("Caverns entry")
				.biome("coldcaverns")
				.maxleveldifficulty(1)
				.extend(
						new CommonnessEvent(),
						
						new Comment(),
						new SpawnEvent("1_fifty", 0.50D, 300, maxIntensity).monsters(Spawns.coldCaverns1()));
	}
	
	public static EventSet coldCaverns1() {
		double maxIntensity = 0.25;
		
		return new DifficultySet(1)
				.identifier("Caverns1")
				.biome("coldcaverns")
				.minleveldifficulty(1)
				.extend(
						new CommonnessEvent("ColdCavernsBasic"),
						
						new Comment(),
						new SpawnEvent("1_twenty", 0.20D, 300, maxIntensity).monsters(Spawns.coldCaverns1()),
						new SpawnEvent("1_forty", 0.40D, 600, maxIntensity).monsters(Spawns.coldCaverns1()),
						new SpawnEvent("1_sixty", 0.60D, 900, maxIntensity).monsters(Spawns.coldCaverns1()),
						new SpawnEvent("1_eighty", 0.80D, 3660, maxIntensity).monsters(Spawns.coldCaverns1()));
	}
	
	public static EventSet coldCaverns2() {
		double maxIntensity = 0.35;
		
		return new DifficultySet(2)
				.identifier("Caverns2")
				.biome("coldcaverns")
				.comment("Introduces Spinelings and Hammerheads")
				.extend(
						new CommonnessEvent("ColdCavernsAdvanced", "ColdCavernsMaze"),
						
						Caves.coldCaverns(),
						BeaconStations.coldCavernsEncounters(),
						BeaconStations.coldCaverns(),
						Wrecks.coldCavernsEncounters(),
						Wrecks.coldCaverns(),
						Abyss.coldCaverns(),
						
						new Comment(),
						new SpawnEvent("2_five", 0.05D, 60, maxIntensity).monsters(Spawns.coldCaverns2()),
						new SpawnEvent("2_twenty", 0.20D, 360, maxIntensity).monsters(Spawns.coldCaverns2()),
						new SpawnEvent("2_forty", 0.40D, 660, maxIntensity).monsters(Spawns.coldCaverns2()),
						new SpawnEvent("2_fifty", 0.50D, 960, maxIntensity).monsters(Spawns.coldCaverns2()),
						new SpawnEvent("2_sixty", 0.60D, 1260, maxIntensity).monsters(Spawns.coldCaverns2()),
						new SpawnEvent("2_eighty", 0.80D, 3660, maxIntensity).monsters(Spawns.coldCaverns2()));
	}
	
	public static EventSet coldCavernsTransition() {
		double maxIntensity = 0.45;
		
		return new DifficultySet(3)
				.identifier("Caverns Transition")
				.maxleveldifficulty(15)
				.comment("Introduces (armored/regular) Mudraptors, Threshers, Golden Hammerhead (rare), Crawler Broodmother, Husks, Husked Crawlers, and the first abyss monster.")
				.extend(
						new CommonnessEvent("ColdCavernsTransition"),
						
						Caves.europanRidge(),
						BeaconStations.europanRidgeEncounters(),
						BeaconStations.europanRidge(),
						Ruins.europanRidge(),
						Wrecks.europanRidgeEncounters(),
						Wrecks.europanRidge(),
						
						Abyss.europanRidge(),
						Abyss.europanRidgeB1(),
						
						new Comment(),
						new SpawnEvent("3_five", 0.05D, 60, maxIntensity).monsters(Spawns.coldCavernsTransition()),
						new SpawnEvent("3_fifteen", 0.15D, 360, maxIntensity).monsters(Spawns.coldCavernsTransition()),
						new SpawnEvent("3_thirty", 0.30D, 660, maxIntensity).monsters(Spawns.coldCavernsTransition()),
						new SpawnEvent("3_forty", 0.40D, 960, maxIntensity).monsters(Spawns.coldCavernsTransition()),
						new SpawnEvent("3_fifty", 0.50D, 1560, maxIntensity).monsters(Spawns.coldCavernsTransition()),
						new SpawnEvent("3_sixty", 0.60D, 1860, maxIntensity).monsters(Spawns.coldCavernsTransition()),
						new SpawnEvent("3_eighty", 0.80D, 3660, maxIntensity).monsters(Spawns.coldCavernsTransition()));
	}
	
	public static EventSet europanRidge() {
		double maxIntensity = 0.55;
		
		return new DifficultySet(4)
				.identifier("Ridge")
				.biome("europanridge")
				.maxleveldifficulty(30)
				.comment("Introduces Moloch.")
				.extend(
						new CommonnessEvent("RidgeBasic").leveltype("RidgeAdvanced", 0.5),
						
						Caves.europanRidge(),
						BeaconStations.europanRidgeEncounters(),
						BeaconStations.europanRidge(),
						Ruins.europanRidge(),
						Wrecks.europanRidgeEncounters(),
						Wrecks.europanRidge(),
						
						Abyss.europanRidge(),
						Abyss.europanRidgeB2(),
						
						new Comment(),
						new SpawnEvent("4_five", 0.05D, 60, maxIntensity).monsters(Spawns.europanRidge()),
						new SpawnEvent("4_fifteen", 0.15D, 360, maxIntensity).monsters(Spawns.europanRidge()),
						new SpawnEvent("4_thirty", 0.30D, 660, maxIntensity).monsters(Spawns.europanRidge()),
						new SpawnEvent("4_forty", 0.40D, 960, maxIntensity).monsters(Spawns.europanRidge()),
						new SpawnEvent("4_fifty", 0.50D, 1560, maxIntensity).monsters(Spawns.europanRidge()),
						new SpawnEvent("4_sixty", 0.60D, 1860, maxIntensity).monsters(Spawns.europanRidge()),
						new SpawnEvent("4_eighty", 0.80D, 3660, maxIntensity).monsters(Spawns.europanRidge()));
	}
	
	public static EventSet europanRidgeToPlateau() {
		double maxIntensity = 0.65;
		
		return new DifficultySet(5)
				.identifier("Ridge to Plateau")
				.maxleveldifficulty(35)
				.comment("Introduces Veteran Mudraptor and Charybdis. Threshers get more common.")
				.extend(
						new CommonnessEvent("RidgeAdvanced"),
						
						Caves.aphoticPlateau(),
						BeaconStations.aphoticPlateauEncounters(),
						BeaconStations.aphoticPlateau(),
						Ruins.aphoticPlateau1(),
						Wrecks.aphoticPlateau1Encounters(),
						Wrecks.aphoticPlateau1(),
						
						Abyss.aphoticPlateau1(),
						Abyss.aphoticPlateau1B(),
						
						new Comment(),
						new SpawnEvent("5_five", 0.05D, 60, maxIntensity).monsters(Spawns.europanRidgeToPlateau()),
						new SpawnEvent("5_fifteen", 0.15D, 360, maxIntensity).monsters(Spawns.europanRidgeToPlateau()),
						new SpawnEvent("5_twentyfive", 0.25D, 660, maxIntensity).monsters(Spawns.europanRidgeToPlateau()),
						new SpawnEvent("5_forty", 0.40D, 960, maxIntensity).monsters(Spawns.europanRidgeToPlateau()),
						new SpawnEvent("5_fifty", 0.50D, 1560, maxIntensity).monsters(Spawns.europanRidgeToPlateau()),
						new SpawnEvent("5_sixty", 0.60D, 1860, maxIntensity).monsters(Spawns.europanRidgeToPlateau()),
						new SpawnEvent("5_eighty", 0.80D, 3660, maxIntensity).monsters(Spawns.europanRidgeToPlateau()),
						new SpawnEvent("5_nintyFive", 0.95D, null, maxIntensity).monsters(Spawns.aphoticPlateau1NearStation()));
	}
	
	public static EventSet aphoticPlateau1() {
		double maxIntensity = 0.75;
		
		return new DifficultySet(6)
				.identifier("Plateau1")
				.biome("theaphoticplateau")
				.maxleveldifficulty(40)
				.comment("Introduces Watcher")
				.extend(
						new CommonnessEvent(),
						
						Caves.aphoticPlateau(),
						BeaconStations.aphoticPlateauEncounters(),
						BeaconStations.aphoticPlateau(),
						Ruins.aphoticPlateau1(),
						Wrecks.aphoticPlateau1Encounters(),
						Wrecks.aphoticPlateau1(),
						
						Abyss.aphoticPlateau1(),
						Abyss.aphoticPlateau1B(),
						

						new Comment(),
						new SpawnEvent("6_five", 0.05D, 60, maxIntensity).monsters(Spawns.aphoticPlateau1NearStation()),
						new SpawnEvent("6_fifteen", 0.15D, 360, maxIntensity).monsters(Spawns.aphoticPlateau1()),
						new SpawnEvent("6_twentyfive", 0.25D, 660, maxIntensity).monsters(Spawns.aphoticPlateau1()),
						new SpawnEvent("6_forty", 0.40D, 960, maxIntensity).monsters(Spawns.aphoticPlateau1()),
						new SpawnEvent("6_sixty", 0.60D, 1560, maxIntensity).monsters(Spawns.aphoticPlateau1()),
						new SpawnEvent("6_eighty", 0.80D, 3660, maxIntensity).monsters(Spawns.aphoticPlateau1()),
						new SpawnEvent("6_nintyFive", 0.95D, null, maxIntensity).monsters(Spawns.aphoticPlateau1NearStation()));
	}
	
	public static EventSet aphoticPlateau2() {
		double maxIntensity = 0.80;
		
		return new DifficultySet(7)
				.identifier("Plateau2")
				.biome("theaphoticplateau")
				.maxleveldifficulty(40)
				.comment("Introduces Watcher")
				.extend(
						new CommonnessEvent(),
						
						Caves.aphoticPlateau(),
						BeaconStations.aphoticPlateauEncounters(),
						BeaconStations.aphoticPlateau(),
						Ruins.aphoticPlateau2(),
						Wrecks.aphoticPlateau2Encounters(),
						Wrecks.aphoticPlateau2(),
						
						Abyss.aphoticPlateau2(),
						Abyss.aphoticPlateau2B(),
						
						new Comment(),
						new SpawnEvent("7_five", 0.05D, 60, maxIntensity).monsters(Spawns.aphoticPlateau2NearStation()),
						new SpawnEvent("7_fifteen", 0.15D, 360, maxIntensity).monsters(Spawns.aphoticPlateau2()),
						new SpawnEvent("7_twentyfive", 0.25D, 660, maxIntensity).monsters(Spawns.aphoticPlateau2()),
						new SpawnEvent("7_forty", 0.40D, 1260, maxIntensity).monsters(Spawns.aphoticPlateau2()),
						new SpawnEvent("7_sixty", 0.60D, 1560, maxIntensity).monsters(Spawns.aphoticPlateau2()),
						new SpawnEvent("7_eighty", 0.80D, 3660, maxIntensity).monsters(Spawns.aphoticPlateau2()),
						new SpawnEvent("7_nintyFive", 0.95D, null, maxIntensity).monsters(Spawns.aphoticPlateau2NearStation()));
	}
	
	public static EventSet plateauToSea() {
		double maxIntensity = 0.85;
		
		return new DifficultySet(8)
				.identifier("Plateau to Sea")
				.minleveldifficulty(45)
				.maxleveldifficulty(50)
				.comment("Introduces Hammerhead Matriarch, Moloch Baby, Giant Spineling")
				.extend(
						new CommonnessEvent("PlateauBasic"),
						
						Caves.greatSea(),
						BeaconStations.greatSeaEncounters(),
						BeaconStations.greatSea(),
						Ruins.greatSea(),
						Wrecks.greatSeaEncounters(),
						Wrecks.greatSea(),
						
						Abyss.greatSea(),
						Abyss.greatSeaB(),
						
						new Comment(),
						new SpawnEvent("8_five", 0.05D, 60, maxIntensity).monsters(Spawns.aphoticPlateau2NearStation()),
						new SpawnEvent("8_fifteen", 0.15D, 360, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("8_twentyfive", 0.25D, 660, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("8_forty", 0.40D, 1260, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("8_fifty", 0.50D, 1560, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("8_sixty", 0.60D, 1860, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("8_eighty", 0.80D, 3660, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("8_nintyFive", 0.95D, null, maxIntensity).monsters(Spawns.greatSeaNearStation()));
	}
	
	public static EventSet greatSea() {
		double maxIntensity = 0.85;
		
		return new DifficultySet(9)
				.identifier("GreatSea")
				.biome("thegreatsea")
				.comment("Introduces Black Moloch. Smaller creatures are less frequent and appear in even larger swarms, more bigger guys.")
				.extend(
						new CommonnessEvent(),
						
						Caves.greatSea(),
						BeaconStations.greatSeaEncounters(),
						BeaconStations.greatSea(),
						Ruins.greatSea(),
						Wrecks.greatSeaEncounters(),
						Wrecks.greatSea(),
						
						Abyss.greatSea(),
						Abyss.greatSeaB(),
						
						new Comment(),
						new SpawnEvent("9_five", 0.05D, 60, maxIntensity).monsters(Spawns.greatSeaNearStation()),
						new SpawnEvent("9_fifteen", 0.15D, 360, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("9_twentyfive", 0.25D, 660, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("9_forty", 0.40D, 1260, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("9_fifty", 0.50D, 1560, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("9_sixty", 0.60D, 1860, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("9_eighty", 0.80D, 3660, maxIntensity).monsters(Spawns.greatSea()),
						new SpawnEvent("9_nintyFive", 0.95D, null, maxIntensity).monsters(Spawns.greatSeaNearStation()));
	}
	
	public static EventSet wastes() {
		double maxIntensity = 0.9;
		return new DifficultySet(10)
				.identifier("Wastes")
				.biome("hydrothermalwastes")
				.comment("Smaller guys make a return")
				.extend(
						new CommonnessEvent(),
						
						Caves.hydrothermalWastes(),
						BeaconStations.hydrothermalWastesEncounters(),
						BeaconStations.hydrothermalWastes(),
						Ruins.wastes(),
						Wrecks.hydrothermalWastesEncounters(),
						Wrecks.hydrothermalWastes(),
						
						Abyss.hydrothermalWastes(),
						Abyss.hydrothermalWastesB(),
						
						new Comment(),
						new SpawnEvent("10_five", 0.05D, 60, maxIntensity).monsters(Spawns.hydrothermalWastesNearStation()),
						new SpawnEvent("10_fifteen", 0.15D, 360, maxIntensity).monsters(Spawns.hydrothermalWastes()),
						new SpawnEvent("10_twentyfive", 0.25D, 660, maxIntensity).monsters(Spawns.hydrothermalWastes()),
						new SpawnEvent("10_forty", 0.40D, 1260, maxIntensity).monsters(Spawns.hydrothermalWastes()),
						new SpawnEvent("10_fifty", 0.50D, 1560, maxIntensity).monsters(Spawns.hydrothermalWastes()),
						new SpawnEvent("10_sixty", 0.60D, 1860, maxIntensity).monsters(Spawns.hydrothermalWastes()),
						new SpawnEvent("10_eighty", 0.80D, 3660, maxIntensity).monsters(Spawns.hydrothermalWastes()),
						new SpawnEvent("10_nintyFive", 0.95D, null, maxIntensity).monsters(Spawns.hydrothermalWastesNearStation()));
	}
	
	public static EventSet end() {
		return new DifficultySet(11)
				.identifier("End")
				.biome("endzone")
				.extend(
						new SpawnEvent("boss", 0.05D, 60, 1).monsters(
								new MonsterEvent(Character.Doomworm, 1, 1)).spawntype("mainpath"));
	}
}
