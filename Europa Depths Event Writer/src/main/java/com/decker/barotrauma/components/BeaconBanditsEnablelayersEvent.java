package com.decker.barotrauma.components;

import java.io.IOException;
import java.io.Writer;

@Deprecated // TODO build out these objects
public class BeaconBanditsEnablelayersEvent implements Entity {
	
	//@formatter:off
        String scriptedEvent = """
<ScriptedEvent identifier="beaconbandit_enablelayers">
  <LayerAction layer="bandit" enabled="true" />
  <CheckDifficultyAction mindifficulty="50">
    <Success>
      <LayerAction layer="bandit_hard" enabled="true" />
    </Success>
  </CheckDifficultyAction>

  <TagAction criteria="itemtag:reactor" submarinetype="BeaconStation" tag="beaconreactor" />
  <SpawnAction itemidentifier="fuelrod" targetinventory="beaconreactor" />
</ScriptedEvent>

<ScriptedEvent identifier="beaconbandit_spawndivingsuit">
  <TagAction criteria="itemtag:divingsuitcontainer" submarinetype="BeaconStation" tag="banditsuitcontainer" />
  <SpawnAction itemidentifier="divingsuit" targettag="banditdivingsuit" targetinventory="banditsuitcontainer" />
  <SpawnAction itemidentifier="oxygentank" targetinventory="banditdivingsuit" />
  <TagAction criteria="itemtag:oxygentankcontainer" submarinetype="BeaconStation" tag="bandittankcontainer" />
  <SpawnAction itemidentifier="oxygentank" targetinventory="bandittankcontainer" />
</ScriptedEvent>

<ScriptedEvent identifier="beaconbandit_spawncombatdivingsuit">
  <TagAction criteria="itemtag:divingsuitcontainer" submarinetype="BeaconStation" tag="banditsuitcontainer" />
  <SpawnAction itemidentifier="combatdivingsuit" targettag="banditdivingsuit" targetinventory="banditsuitcontainer" />
  <SpawnAction itemidentifier="oxygentank" targetinventory="banditdivingsuit" />
  <TagAction criteria="itemtag:oxygentankcontainer" submarinetype="BeaconStation" tag="bandittankcontainer" />
  <SpawnAction itemidentifier="oxygentank" targetinventory="bandittankcontainer" />
</ScriptedEvent>

<ScriptedEvent identifier="beaconbandit_spawnabyssdivingsuit">
  <TagAction criteria="itemtag:divingsuitcontainer" submarinetype="BeaconStation" tag="banditsuitcontainer" />
  <SpawnAction itemidentifier="abyssdivingsuit" targettag="banditdivingsuit" targetinventory="banditsuitcontainer" />
  <SpawnAction itemidentifier="oxygentank" targetinventory="banditdivingsuit" />
  <TagAction criteria="itemtag:oxygentankcontainer" submarinetype="BeaconStation" tag="bandittankcontainer" />
  <SpawnAction itemidentifier="oxygentank" targetinventory="bandittankcontainer" />
</ScriptedEvent>
\s
<ScriptedEvent identifier="beaconbandit_defense">
  <!-- Pick one bandit at random to defend, and one target at random to defend. -->
  <TagAction criteria="humanprefabtag:bandit" tag="defender" chooserandom="true" />
  <TagAction criteria="itemtag:defendable" tag="defendable" chooserandom="true" AllowHiddenItems="true" />
  <WaitAction time="20" /> <!-- Give some time to start the reactor -->
  <!-- Make the NPC "operate" the defendable position (dummy item that marks the position the bandit should defend -->
  <!-- Priority of 70 makes defending take priority over autonomous objectives, but emergency objectives like finding safety are still higher prio (90) -->
  <NPCOperateItemAction npctag="defender" targettag="defendable" itemcomponentname="controller" operate="true" Priority="70" />
</ScriptedEvent>
""";
//@formatter:on
	
	@Override
	public void render(int depth, Writer writer) throws IOException {
		String[] lines = scriptedEvent.split("\n");
		for (int i = 0; i < lines.length; i++) {
			writer.append(this.indent(depth)).append(lines[i]).append("\n");
		}
	}
	
	protected String indent(int depth) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			sb.append("\t");
		}
		return sb.toString();
	}
}