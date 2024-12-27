package com.decker.barotrauma;

import com.decker.barotrauma.components.AbyssEvent;
import com.decker.barotrauma.components.MonsterEvent;
import com.decker.barotrauma.components.Character;
import com.decker.barotrauma.components.MonsterSet;

public class Abyss {
	public static AbyssEvent coldCaverns() {
		return new AbyssEvent().monsters(
				new MonsterEvent(Character.Latcher, 0, 1));
	}
	
	public static AbyssEvent europanRidge() {
		return new AbyssEvent().monsters(
				new MonsterSet("latchers", false, 100).monsters(
						new MonsterEvent(Character.Latcher, 1, 1)));
	}
	
	public static AbyssEvent europanRidgeB1() {
		return new AbyssEvent("abyss2")
				.mindistancetraveled(0.5d)
				.disableinhuntinggrounds(false)
				.minmissiontime(900)
				.monsters(
						new MonsterSet("latchers", false, 100).monsters(
								new MonsterEvent(Character.Latcher, 0, 1)));
	}
	
	public static AbyssEvent europanRidgeB2() {
		return new AbyssEvent("abyss2")
				.mindistancetraveled(0.5d)
				.disableinhuntinggrounds(false)
				.minmissiontime(900)
				.monsters(
						new MonsterSet("latchers", false, 70).monsters(
								new MonsterEvent(Character.Latcher, 1, 1)),
						new MonsterSet("Charybdis", false, 30).monsters(
								new MonsterEvent(Character.Charybdis_juvenile, 1, 1)));
	}
	
	public static AbyssEvent aphoticPlateau1() {
		return new AbyssEvent().monsters(
				new MonsterSet("latchers", false, 50).monsters(
						new MonsterEvent(Character.Latcher, 1, 1)),
				new MonsterSet("Charybdis", false, 50).monsters(
						new MonsterEvent(Character.Charybdis, 1, 1)));
	}
	
	public static AbyssEvent aphoticPlateau1B() {
		return new AbyssEvent("abyss2")
				.mindistancetraveled(0.5d)
				.disableinhuntinggrounds(false)
				.minmissiontime(600)
				.monsters(
						new MonsterSet("latchers", false, 50).monsters(
								new MonsterEvent(Character.Latcher, 1, 1)),
						new MonsterSet("Charybdis", false, 50).monsters(
								new MonsterEvent(Character.Charybdis, 1, 1)));
	}
	
	public static AbyssEvent aphoticPlateau2() {
		return new AbyssEvent().resettime(600).monsters(
				new MonsterSet("latchers", false, 40).monsters(
						new MonsterEvent(Character.Latcher, 1, 2)),
				new MonsterSet("Charybdis", false, 50).monsters(
						new MonsterEvent(Character.Charybdis, 1, 1)),
				new MonsterSet("endworm", false, 10).monsters(
						new MonsterEvent(Character.Endworm, 1, 1)));
	}
	
	public static AbyssEvent aphoticPlateau2B() {
		return new AbyssEvent("abyss2")
				.mindistancetraveled(0.5d)
				.disableinhuntinggrounds(false)
				.minmissiontime(600)
				.monsters(
						new MonsterSet("latchers", false, 40).monsters(
								new MonsterEvent(Character.Latcher, 1, 1)),
						new MonsterSet("Charybdis", false, 50).monsters(
								new MonsterEvent(Character.Charybdis, 1, 1)),
						new MonsterSet("endworm", false, 10).monsters(
								new MonsterEvent(Character.Endworm, 1, 1)));
	}
	
	public static AbyssEvent greatSea() {
		return new AbyssEvent().resettime(300).monsters(
				new MonsterSet("latchers", false, 20).monsters(
						new MonsterEvent(Character.Latcher, 1, 2)),
				new MonsterSet("Charybdis", false, 40).monsters(
						new MonsterEvent(Character.Charybdis, 1, 2)),
				new MonsterSet("endworm", false, 40).monsters(
						new MonsterEvent(Character.Endworm, 1, 1)));
	}
	
	public static AbyssEvent greatSeaB() {
		return new AbyssEvent("abyss2")
				.mindistancetraveled(0.5d)
				.disableinhuntinggrounds(false)
				.minmissiontime(600)
				.monsters(
						new MonsterSet("latchers", false, 20).monsters(
								new MonsterEvent(Character.Latcher, 1, 2)),
						new MonsterSet("Charybdis", false, 40).monsters(
								new MonsterEvent(Character.Charybdis, 1, 1),
								new MonsterEvent(Character.Charybdis_juvenile, 1, 1)),
						new MonsterSet("endworm", false, 40).monsters(
								new MonsterEvent(Character.Endworm, 1, 1)));
	}
	
	public static AbyssEvent hydrothermalWastes() {
		return new AbyssEvent().resettime(300).monsters(
				new MonsterSet("latchers", false, 10).monsters(
						new MonsterEvent(Character.Latcher, 1, 3)),
				new MonsterSet("Charybdis", false, 40).monsters(
						new MonsterEvent(Character.Charybdis, 1, 2)),
				new MonsterSet("endworm", false, 50).monsters(
						new MonsterEvent(Character.Endworm, 1, 2)));
	}
	
	public static AbyssEvent hydrothermalWastesB() {
		return new AbyssEvent("abyss2")
				.mindistancetraveled(0.5d)
				.disableinhuntinggrounds(false)
				.minmissiontime(600)
				.monsters(
						new MonsterSet("latchers", false, 10).monsters(
								new MonsterEvent(Character.Latcher, 1, 2)),
						new MonsterSet("Charybdis", false, 40).monsters(
								new MonsterEvent(Character.Charybdis, 1, 2)),
						new MonsterSet("endworm", false, 50).monsters(
								new MonsterEvent(Character.Endworm, 1, 1)));
	}
}
