package com.decker.barotrauma.components;

import java.util.Comparator;

public class FieldComparator implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(fieldSwitch(o1), fieldSwitch(o2));
	}
	
	public int fieldSwitch(String field) {
		switch (field) {
			case "identifier":
			case "npcsetidentifier":
				return 0;
			case "characterfile":
			case "npcidentifier":
			case "requiredlayer":
				return 1;
			case "minamount":
				return 2;
			case "maxamount":
				return 3;
			case "biome":
				return 10;
			case "minleveldifficulty":
				return 20;
			case "maxleveldifficulty":
				return 30;
			case "chooserandom":
				return 40;
			case "mindistancetraveled":
				return 50;
			case "minmissiontime":
				return 60;
			case "percave":
			case "perwreck":
			case "perruin":
			case "targettag":
				return 70;
			case "triggereventcooldown":
				return 80;
			case "allowatstart":
				return 90;
			case "spawntype":
				return 95;
			case "spawndistance":
				return 100;
			case "offset":
				return 120;
			case "scatter":
				return 130;
			case "maxamountperlevel":
				return 150;
			case "spawnprobability":
			case "probability":
				return 160;
			case "spawnpointtag":
				return 170;
			case "delaywhencrewaway":
				return 180;
			case "minintensity":
				return 200;
			case "maxintensity":
				return 210;
			case "spawnlocation":
				return 500;
			case "requirespawnpointtag":
				return 600;
			case "team":
				return 1000;
			case "resettime":
				return Integer.MAX_VALUE - 30;
			case "commonness":
				return Integer.MAX_VALUE - 20;
			case "disableinhuntinggrounds":
				return Integer.MAX_VALUE - 10;
			case "campaign":
			case "delaybetweenspawns":
				return Integer.MAX_VALUE;
		}
		throw new RuntimeException(String.format("Field %s is not ordered", field));
	}
	
}
