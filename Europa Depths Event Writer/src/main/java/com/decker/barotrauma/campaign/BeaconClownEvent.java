package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;

public class BeaconClownEvent implements Event {
	
//@formatter:off 
	String scriptedEvent =
			"<ScriptedEvent identifier=\"beaconclown\">\n"
			+ "  <SpawnAction npcsetidentifier=\"abandonedoutpostnpcs\" npcidentifier=\"psychoclown\" targettag=\"psychoclown\" spawnpointtag=\"saferoom\" spawnlocation=\"beaconstation\" requirespawnpointtag=\"true\" team=\"None\"/>\n"
			+ "  <StatusEffectAction targettag=\"psychoclown\">\n"
			+ "    <StatusEffect>\n"
			+ "      <GiveTalentInfo giverandom=\"false\" talentidentifiers=\"chonkyhonks,psychoclown,waterprankster,enrollintoclowncollege\" />\n"
			+ "    </StatusEffect>\n"
			+ "  </StatusEffectAction>\n"
			+ "  <AfflictionAction targettag=\"psychoclown\" affliction=\"psychoclown\" strength=\"100\" />\n"
			+ "</ScriptedEvent>";
	
//@formatter:on
	
	@Override
	public void render(int depth, Writer writer) throws IOException {
		String[] lines = scriptedEvent.split("\n");
		for(int i = 0; i < lines.length;i++) {
			writer.append(this.indent(depth)).append(lines[i]).append("\n");
		}		
	}
	
}
