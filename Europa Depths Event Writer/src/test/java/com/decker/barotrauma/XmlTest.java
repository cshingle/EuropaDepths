package com.decker.barotrauma;

import java.io.IOException;
import java.io.StringWriter;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.decker.barotrauma.campaign.BeaconStationEncountersEvent;
import com.decker.barotrauma.campaign.BeaconStationEvent;
import com.decker.barotrauma.campaign.CaveEvent;
import com.decker.barotrauma.campaign.Charactor;
import com.decker.barotrauma.campaign.MonsterEvent;
import com.decker.barotrauma.campaign.MonsterSet;
import com.decker.barotrauma.campaign.RuinEncounters;
import com.decker.barotrauma.campaign.RuinEvent;
import com.decker.barotrauma.campaign.ScriptedEvent;
import com.decker.barotrauma.campaign.SpawnAction;
import com.decker.barotrauma.campaign.SpawnEvent;
import com.decker.barotrauma.campaign.WreckEncountersEvent;
import com.decker.barotrauma.campaign.WreckEvent;

class XmlTest {
	static Pattern IGNORE_WHITESPACE_PATTERN = Pattern.compile("^[ \t]+", Pattern.MULTILINE);
	
	@Test
	void testCave() throws IOException {
	// @formatter:off
		String expected = 
				"\n" +
				"    <!-- Populate the caves -->\n"
				+ "    <EventSet identifier=\"caves\" chooserandom=\"true\" percave=\"true\" triggereventcooldown=\"false\" allowatstart=\"true\">\n"
				+ "      <MonsterEvent characterfile=\"Crawler\" minamount=\"3\" maxamount=\"4\" spawntype=\"cave\" delaybetweenspawns=\"1\" />\n"
				+ "      <MonsterEvent characterfile=\"Crawlerhusk\" minamount=\"3\" maxamount=\"4\" spawntype=\"cave\" delaybetweenspawns=\"1\" />\n"
				+ "      <MonsterEvent characterfile=\"Spineling\" minamount=\"3\" maxamount=\"4\" spawntype=\"cave\" delaybetweenspawns=\"1\" />\n"
				+ "      <MonsterEvent characterfile=\"Mudraptor\" minamount=\"2\" maxamount=\"3\" spawntype=\"cave\" delaybetweenspawns=\"1\" />\n"
				+ "      <MonsterEvent characterfile=\"Tigerthresher\" minamount=\"2\" maxamount=\"3\" spawntype=\"cave\" delaybetweenspawns=\"1\" />\n"
				+ "    </EventSet>\n"
				+ "";
	// @formatter:on
		
		CaveEvent caveEvent = new CaveEvent().monsters(
				new MonsterEvent(Charactor.Crawler, 3, 4),
				new MonsterEvent(Charactor.Crawlerhusk, 3, 4),
				new MonsterEvent(Charactor.Spineling, 3, 4),
				new MonsterEvent(Charactor.Mudraptor, 2, 3),
				new MonsterEvent(Charactor.Tigerthresher, 2, 3));
		
		StringWriter writer = new StringWriter();
		caveEvent.render(1, writer);
		Assertions.assertEquals(ignoreWhitespace(expected), ignoreWhitespace(writer.toString()));
		
	}
	
	@Test
	void testBeaconEncounters() throws IOException {
	// @formatter:off
		String expected = 
				"\n" +
				"    <!-- Populate the beacon stations - Only spawn if there's spawnpoint with tag 'encounter' present! -->\n"
				+ "    <EventSet identifier=\"beaconstation_encounters\" chooserandom=\"true\" triggereventcooldown=\"false\" allowatstart=\"true\">\n"
				+ "      <EventSet identifier=\"husks\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"10\">\n"
				+ "        <MonsterEvent characterfile=\"Husk\" minamount=\"1\" maxamount=\"2\" spawntype=\"beaconstation\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "        <MonsterEvent characterfile=\"Husk\" minamount=\"1\" maxamount=\"2\" spawntype=\"beaconstation\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"husk_crawlers\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"10\">\n"
				+ "        <MonsterEvent characterfile=\"Crawlerhusk\" minamount=\"1\" maxamount=\"2\" spawntype=\"beaconstation\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "        <MonsterEvent characterfile=\"Crawlerhusk\" minamount=\"1\" maxamount=\"2\" spawntype=\"beaconstation\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"mudraptors\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"15\">\n"
				+ "        <MonsterEvent characterfile=\"Mudraptor\" minamount=\"1\" maxamount=\"2\" spawntype=\"beaconstation\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"threshers\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"10\">\n"
				+ "        <MonsterEvent characterfile=\"Tigerthresher\" minamount=\"1\" maxamount=\"2\" spawntype=\"beaconstation\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"clown\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"5\">\n"
				+ "        <ScriptedEvent identifier=\"beaconclown\" />\n"
				+ "      </EventSet>\n"
				+ "    </EventSet>\n";
	// @formatter:on
		
		BeaconStationEncountersEvent beaconEncounters = new BeaconStationEncountersEvent().monsters(
				new MonsterSet("husks", false, 10).monsters(
						new MonsterEvent(Charactor.Husk, 1, 2),
						new MonsterEvent(Charactor.Husk, 1, 2)),
				new MonsterSet("husk_crawlers", false, 10).monsters(
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2)),
				new MonsterSet("mudraptors", false, 15).monsters(
						new MonsterEvent(Charactor.Mudraptor, 1, 2)),
				new MonsterSet("threshers", false, 10).monsters(
						new MonsterEvent(Charactor.Tigerthresher, 1, 2)),
				new MonsterSet("clown", false, 5).monsters(
						new ScriptedEvent("beaconclown")));
		
		StringWriter writer = new StringWriter();
		beaconEncounters.render(1, writer);
		Assertions.assertEquals(ignoreWhitespace(expected), ignoreWhitespace(writer.toString()));
		
	}
	
	@Test
	void testBeaconEvent() throws IOException {
	// @formatter:off
		String expected = 
				"\n" +
				"    <!-- Populate the beacon stations - Only spawn if there's spawnpoint with tag 'beacon_***' present! -->\n"
				+ "    <EventSet identifier=\"beaconstation_presets\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\">\n"
				+ "      <MonsterEvent characterfile=\"Crawler\" minamount=\"3\" maxamount=\"4\" spawntype=\"beaconstation\" spawnprobability=\"1\" spawnpointtag=\"beacon_mudraptor\" />\n"
				+ "      <MonsterEvent characterfile=\"Mudraptor_unarmored\" minamount=\"2\" maxamount=\"3\" spawntype=\"beaconstation\" spawnprobability=\"1\" spawnpointtag=\"beacon_mudraptor\" />\n"
				+ "      <MonsterEvent characterfile=\"Mudraptor\" minamount=\"2\" maxamount=\"3\" spawntype=\"beaconstation\" spawnprobability=\"0.5\" spawnpointtag=\"beacon_mudraptor\" />\n"
				+ "      <ScriptedEvent identifier=\"beaconbandit\">\n"
				+ "        <SpawnAction npcsetidentifier=\"abandonedoutpostnpcs\" npcidentifier=\"banditleader\" targettag=\"beacon_bandit\" spawnpointtag=\"beacon_bandit\" spawnlocation=\"beaconstation\" requirespawnpointtag=\"true\" team=\"None\" />\n"
				+ "        <SpawnAction npcsetidentifier=\"abandonedoutpostnpcs\" npcidentifier=\"bandit\" targettag=\"beacon_bandit\" spawnpointtag=\"beacon_bandit\" spawnlocation=\"beaconstation\" requirespawnpointtag=\"true\" team=\"None\" />\n"
				+ "      </ScriptedEvent>\n"
				+ "    </EventSet>\n";
	// @formatter:on
		
		BeaconStationEvent beaconEvent = new BeaconStationEvent().monsters(
				new MonsterEvent(Charactor.Crawler, 3, 4),
				new MonsterEvent(Charactor.Mudraptor_unarmored, 2, 3),
				new MonsterEvent(Charactor.Mudraptor, 2, 3).spawnprobability(0.5),
				new ScriptedEvent("beaconbandit").actions(
						new SpawnAction("abandonedoutpostnpcs", "banditleader", "beacon_bandit", "beacon_bandit"),
						new SpawnAction("abandonedoutpostnpcs", "bandit", "beacon_bandit", "beacon_bandit")));
		
		StringWriter writer = new StringWriter();
		beaconEvent.render(1, writer);
		Assertions.assertEquals(ignoreWhitespace(expected), ignoreWhitespace(writer.toString()));
		
	}
	
	@Test
	void testRuinsEvent() throws IOException {
	// @formatter:off
		String expected = 
				"\n" +
				"    <!-- populate the ruins -->\n"
				+ "    <EventSet identifier=\"ruins\" chooserandom=\"false\" perruin=\"true\" triggereventcooldown=\"false\" allowatstart=\"true\">\n"
				+ "      <MonsterEvent characterfile=\"Swarmfeeder\" minamount=\"5\" maxamount=\"7\" spawntype=\"ruin\" spawnprobability=\"1\" spawnpointtag=\"swarmfeeder\" />\n"
				+ "      <MonsterEvent characterfile=\"Swarmfeeder\" minamount=\"3\" maxamount=\"5\" spawntype=\"ruin\" spawnprobability=\"0.2\" spawnpointtag=\"swarmfeeder\" />\n"
				+ "      <MonsterEvent characterfile=\"Fractalguardian2\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawnprobability=\"0.8\" spawnpointtag=\"fractalguardian\" />\n"
				+ "      <MonsterEvent characterfile=\"Fractalguardian\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawnprobability=\"0.3\" spawnpointtag=\"fractalguardian\" />\n"
				+ "      <MonsterEvent characterfile=\"Husk\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawnprobability=\"0.5\" spawnpointtag=\"husk\" />\n"
				+ "      <MonsterEvent characterfile=\"Husk\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawnprobability=\"0.2\" spawnpointtag=\"husk\" />\n"
				+ "      <MonsterEvent characterfile=\"Husk\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawnprobability=\"0.1\" spawnpointtag=\"husk\" />\n"
				+ "      <EventSet identifier=\"ruin_encounters\" chooserandom=\"true\" triggereventcooldown=\"false\" allowatstart=\"true\">\n"
				+ "        <EventSet identifier=\"entrance1\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\">\n"
				+ "          <MonsterEvent characterfile=\"Fractalguardian\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawnpointtag=\"encounter_entrance1\" />\n"
				+ "          <MonsterEvent characterfile=\"Crawler\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawnpointtag=\"encounter_entrance1\" />\n"
				+ "        </EventSet>\n"
				+ "        <EventSet identifier=\"entrance2\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\">\n"
				+ "          <MonsterEvent characterfile=\"Fractalguardian\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawndistance=\"1000\" spawnpointtag=\"encounter_entrance2\" />\n"
				+ "          <MonsterEvent characterfile=\"Crawler\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawndistance=\"1000\" spawnpointtag=\"encounter_entrance2\" />\n"
				+ "        </EventSet>\n"
				+ "        <EventSet identifier=\"entrance3\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\">\n"
				+ "          <MonsterEvent characterfile=\"Fractalguardian\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawnpointtag=\"encounter_entrance3\" />\n"
				+ "          <MonsterEvent characterfile=\"Crawler\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawnpointtag=\"encounter_entrance3\" />\n"
				+ "        </EventSet>\n"
				+ "        <EventSet identifier=\"chambers1\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\">\n"
				+ "          <MonsterEvent characterfile=\"Fractalguardian\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawnpointtag=\"encounter_chambers1\" />\n"
				+ "          <MonsterEvent characterfile=\"Crawler\" minamount=\"2\" maxamount=\"3\" spawntype=\"ruin\" spawnpointtag=\"encounter_chambers1\" />\n"
				+ "        </EventSet>\n"
				+ "      </EventSet>\n"
				+ "    </EventSet>\n";
	// @formatter:on
		
		RuinEvent ruinsEvent = new RuinEvent().monsters(
				new MonsterEvent(Charactor.Swarmfeeder, 5, 7).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Charactor.Swarmfeeder, 3, 5).spawnprobability(0.2).spawnpointtag("swarmfeeder"),
				new MonsterEvent(Charactor.Fractalguardian2, 2, 3).spawnprobability(0.8).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Fractalguardian, 2, 3).spawnprobability(0.3).spawnpointtag("fractalguardian"),
				new MonsterEvent(Charactor.Husk, 2, 3).spawnprobability(0.5).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Husk, 2, 3).spawnprobability(0.2).spawnpointtag("husk"),
				new MonsterEvent(Charactor.Husk, 2, 3).spawnprobability(0.1).spawnpointtag("husk"),
				new RuinEncounters().monsters(
						new MonsterSet("entrance1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Crawler, 2, 3)).spawnpointtag("encounter_entrance1"),
						new MonsterSet("entrance2", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Crawler, 2, 3)).spawndistance(1000).spawnpointtag("encounter_entrance2"),
						new MonsterSet("entrance3", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Crawler, 2, 3)).spawnpointtag("encounter_entrance3"),
						new MonsterSet("chambers1", false).monsters(
								new MonsterEvent(Charactor.Fractalguardian, 2, 3),
								new MonsterEvent(Charactor.Crawler, 2, 3)).spawnpointtag("encounter_chambers1")));
		
		StringWriter writer = new StringWriter();
		ruinsEvent.render(1, writer);
		Assertions.assertEquals(ignoreWhitespace(expected), ignoreWhitespace(writer.toString()));
		
	}
	
	@Test
	void testwreckEncounters() throws IOException {
	// @formatter:off
		String expected = 
				"\n" +
				"    <!-- Populate the wrecks -->\n"
				+ "    <EventSet identifier=\"wreck_encounters\" chooserandom=\"true\" perwreck=\"true\" triggereventcooldown=\"false\" allowatstart=\"true\">\n"
				+ "      <EventSet identifier=\"crawler_vs_husk\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"15\">\n"
				+ "        <MonsterEvent characterfile=\"Crawler\" minamount=\"2\" maxamount=\"3\" spawntype=\"wreck\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "        <MonsterEvent characterfile=\"Crawlerhusk\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"crawler_vs_mudraptor\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"15\">\n"
				+ "        <MonsterEvent characterfile=\"Crawler\" minamount=\"2\" maxamount=\"3\" spawntype=\"wreck\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "        <MonsterEvent characterfile=\"Mudraptor_unarmored\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"crawler_vs_thresher\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"15\">\n"
				+ "        <MonsterEvent characterfile=\"Crawler\" minamount=\"2\" maxamount=\"3\" spawntype=\"wreck\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "        <MonsterEvent characterfile=\"Tigerthresher\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"mudraptor_vs_thresher\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"15\">\n"
				+ "        <MonsterEvent characterfile=\"Mudraptor\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "        <MonsterEvent characterfile=\"Tigerthresher\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"husks\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"10\">\n"
				+ "        <MonsterEvent characterfile=\"Husk\" minamount=\"1\" maxamount=\"3\" spawntype=\"wreck\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "        <MonsterEvent characterfile=\"Crawlerhusk\" minamount=\"0\" maxamount=\"2\" spawntype=\"wreck\" spawnprobability=\"1\" spawnpointtag=\"encounter\" />\n"
				+ "      </EventSet>\n"
				+ "    </EventSet>\n";
	// @formatter:on
		
		WreckEncountersEvent wreckEncounters = new WreckEncountersEvent().monsters(
				new MonsterSet("crawler_vs_husk", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 2, 3),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2)),
				new MonsterSet("crawler_vs_mudraptor", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 2, 3),
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2)),
				new MonsterSet("crawler_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 2, 3),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2)),
				new MonsterSet("mudraptor_vs_thresher", false, 15).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor, 1, 2),
						new MonsterEvent(Charactor.Tigerthresher, 1, 2)),
				new MonsterSet("husks", false, 10).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 1, 3),
						new MonsterEvent(Charactor.Crawlerhusk, 0, 2)));
		
		StringWriter writer = new StringWriter();
		wreckEncounters.render(1, writer);
		Assertions.assertEquals(ignoreWhitespace(expected), ignoreWhitespace(writer.toString()));
		
	}
	
	@Test
	void testwreckEvent() throws IOException {
	// @formatter:off
		String expected = 
				"    <EventSet identifier=\"wrecks\" chooserandom=\"true\" perwreck=\"true\" triggereventcooldown=\"false\" allowatstart=\"true\">\n"
				+ "      <EventSet identifier=\"husks\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"50\">\n"
				+ "        <MonsterEvent characterfile=\"Husk\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"1\" />\n"
				+ "        <MonsterEvent characterfile=\"Husk\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"1\" />\n"
				+ "        <MonsterEvent characterfile=\"Husk\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"0.5\" />\n"
				+ "        <MonsterEvent characterfile=\"Husk\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"0.5\" />\n"
				+ "        <MonsterEvent characterfile=\"Crawlerhusk\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"1\" />\n"
				+ "        <MonsterEvent characterfile=\"Crawlerhusk\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"0.5\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"crawlers\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"30\">\n"
				+ "        <MonsterEvent characterfile=\"Crawler\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"1\" />\n"
				+ "        <MonsterEvent characterfile=\"Crawler\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"1\" />\n"
				+ "        <MonsterEvent characterfile=\"Crawler\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"1\" />\n"
				+ "        <MonsterEvent characterfile=\"Crawler\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"0.5\" />\n"
				+ "        <MonsterEvent characterfile=\"Crawlerhusk\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"0.5\" />\n"
				+ "        <MonsterEvent characterfile=\"Crawlerhusk\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"0.5\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"mudraptors\" chooserandom=\"false\" triggereventcooldown=\"false\" allowatstart=\"true\" commonness=\"20\">\n"
				+ "        <MonsterEvent characterfile=\"Mudraptor_unarmored\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"1\" />\n"
				+ "        <MonsterEvent characterfile=\"Mudraptor_unarmored\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"1\" />\n"
				+ "        <MonsterEvent characterfile=\"Mudraptor\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"1\" />\n"
				+ "        <MonsterEvent characterfile=\"Mudraptor\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"0.5\" />\n"
				+ "        <MonsterEvent characterfile=\"Mudraptor\" minamount=\"1\" maxamount=\"2\" spawntype=\"wreck\" spawndistance=\"1000\" spawnprobability=\"0.5\" />\n"
				+ "      </EventSet>\n"
				+ "    </EventSet>\n";
	// @formatter:on
		
		WreckEvent wreckEvent = new WreckEvent().monsters(
				new MonsterSet("husks", false, 50).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Husk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 1, 2).spawnprobability(0.5).spawndistance(1000),
						new MonsterEvent(Charactor.Husk, 1, 2).spawnprobability(0.5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2).spawnprobability(0.5).spawndistance(1000)),
				new MonsterSet("crawlers", false, 30).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Crawler, 1, 2).spawnprobability(0.5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2).spawnprobability(0.5).spawndistance(1000),
						new MonsterEvent(Charactor.Crawlerhusk, 1, 2).spawnprobability(0.5).spawndistance(1000)),
				new MonsterSet("mudraptors", false, 20).allowatstart(true).monsters(
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor_unarmored, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor, 1, 2).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor, 1, 2).spawnprobability(0.5).spawndistance(1000),
						new MonsterEvent(Charactor.Mudraptor, 1, 2).spawnprobability(0.5).spawndistance(1000)));
		
		StringWriter writer = new StringWriter();
		wreckEvent.render(1, writer);
		Assertions.assertEquals(ignoreWhitespace(expected), ignoreWhitespace(writer.toString()));
		
	}
	
	@Test
	void spawnEvent() throws IOException {
	// @formatter:off
		String expected = 
				"		<!-- 15% or 2 min -->\n"
				+ "    <EventSet identifier=\"first\" chooserandom=\"true\" mindistancetraveled=\"0.15\" minmissiontime=\"120\" delaywhencrewaway=\"false\" minintensity=\"0.0\" maxintensity=\"0.7\">\n"
				+ "      <EventSet identifier=\"hammerheads\" chooserandom=\"false\" commonness=\"20\">\n"
				+ "        <MonsterEvent characterfile=\"Hammerhead\" minamount=\"3\" maxamount=\"4\" spawntype=\"mainpath,sidepath\" />\n"
				+ "        <MonsterEvent characterfile=\"Hammerheadgold\" minamount=\"1\" maxamount=\"2\" spawntype=\"mainpath,sidepath\" />\n"
				+ "        <MonsterEvent characterfile=\"Hammerheadmatriarch\" minamount=\"1\" maxamount=\"2\" spawntype=\"mainpath,sidepath\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"molochs\" chooserandom=\"true\" commonness=\"20\">\n"
				+ "        <EventSet identifier=\"nobabies\">\n"
				+ "          <MonsterEvent characterfile=\"Moloch\" minamount=\"1\" maxamount=\"2\" spawntype=\"mainpath,sidepath\" scatter=\"3000\" />\n"
				+ "          <MonsterEvent characterfile=\"Molochblack\" minamount=\"1\" maxamount=\"2\" spawntype=\"mainpath,sidepath\" spawnprobability=\"0.75\" />\n"
				+ "        </EventSet>\n"
				+ "        <EventSet identifier=\"babies\">\n"
				+ "          <MonsterEvent characterfile=\"Moloch\" minamount=\"1\" maxamount=\"2\" spawntype=\"mainpath,sidepath\" offset=\"10000\" scatter=\"3000\" />\n"
				+ "          <MonsterEvent characterfile=\"Molochbaby\" minamount=\"10\" maxamount=\"20\" spawntype=\"mainpath,sidepath\" scatter=\"3000\" />\n"
				+ "        </EventSet>\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"spinelings\" chooserandom=\"false\" commonness=\"20\">\n"
				+ "        <MonsterEvent characterfile=\"Spineling\" minamount=\"10\" maxamount=\"12\" spawntype=\"mainpath,sidepath\" />\n"
				+ "        <MonsterEvent characterfile=\"Spineling_giant\" minamount=\"1\" maxamount=\"2\" spawntype=\"mainpath,sidepath\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"threshers\" chooserandom=\"false\" commonness=\"10\">\n"
				+ "        <MonsterEvent characterfile=\"Bonethresher\" minamount=\"2\" maxamount=\"3\" spawntype=\"mainpath,sidepath\" />\n"
				+ "        <MonsterEvent characterfile=\"Tigerthresher\" minamount=\"6\" maxamount=\"9\" spawntype=\"mainpath,sidepath\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"mudraptors\" chooserandom=\"false\" commonness=\"10\">\n"
				+ "        <MonsterEvent characterfile=\"Mudraptor\" minamount=\"3\" maxamount=\"4\" spawntype=\"mainpath,sidepath\" />\n"
				+ "        <MonsterEvent characterfile=\"Mudraptor_veteran\" minamount=\"2\" maxamount=\"2\" spawntype=\"mainpath,sidepath\" />\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"crawlers\" chooserandom=\"true\" commonness=\"10\">\n"
				+ "        <EventSet identifier=\"crawlerswarm\">\n"
				+ "          <MonsterEvent characterfile=\"Crawler\" minamount=\"10\" maxamount=\"12\" spawntype=\"mainpath,sidepath\" />\n"
				+ "          <MonsterEvent characterfile=\"Crawlerbroodmother\" minamount=\"1\" maxamount=\"1\" spawntype=\"mainpath,sidepath\" />\n"
				+ "        </EventSet>\n"
				+ "        <EventSet identifier=\"Crawlerhusk\">\n"
				+ "          <MonsterEvent characterfile=\"Crawlerhusk\" minamount=\"10\" maxamount=\"12\" spawntype=\"mainpath,sidepath\" />\n"
				+ "        </EventSet>\n"
				+ "      </EventSet>\n"
				+ "      <EventSet identifier=\"watcher\" commonness=\"10\">\n"
				+ "        <MonsterEvent characterfile=\"Watcher\" minamount=\"1\" maxamount=\"1\" triggereventcooldown=\"false\" spawntype=\"mainpath,sidepath\" />\n"
				+ "        <EventSet chooserandom=\"true\">\n"
				+ "          <EventSet identifier=\"crawlers\">\n"
				+ "            <MonsterEvent characterfile=\"Crawler\" minamount=\"9\" maxamount=\"11\" spawntype=\"mainpath,sidepath\" />\n"
				+ "          </EventSet>\n"
				+ "          <EventSet identifier=\"mudraptors\">\n"
				+ "            <MonsterEvent characterfile=\"Mudraptor\" minamount=\"5\" maxamount=\"5\" spawntype=\"mainpath,sidepath\" />\n"
				+ "          </EventSet>\n"
				+ "          <EventSet identifier=\"threshers\">\n"
				+ "            <MonsterEvent characterfile=\"Bonethresher\" minamount=\"2\" maxamount=\"3\" spawntype=\"mainpath,sidepath\" />\n"
				+ "            <MonsterEvent characterfile=\"Tigerthresher\" minamount=\"5\" maxamount=\"8\" spawntype=\"mainpath,sidepath\" />\n"
				+ "          </EventSet>\n"
				+ "        </EventSet>\n"
				+ "      </EventSet>\n"
				+ "    </EventSet>\n";
	// @formatter:on
		
		SpawnEvent spawnEvent = new SpawnEvent("first", 0.15D, 120, 0.7D).monsters(
				new MonsterSet("hammerheads", false, 20).monsters(
						new MonsterEvent(Charactor.Hammerhead, 3, 4),
						new MonsterEvent(Charactor.Hammerheadgold, 1, 2),
						new MonsterEvent(Charactor.Hammerheadmatriarch, 1, 2)),
				new MonsterSet("molochs", true, 20).monsters(
						new MonsterSet("nobabies").monsters(
								new MonsterEvent(Charactor.Moloch, 1, 2).scatter(3000),
								new MonsterEvent(Charactor.Molochblack, 1, 2).spawnprobability(0.75D)),
						new MonsterSet("babies").monsters(
								new MonsterEvent(Charactor.Moloch, 1, 2).offset(10000).scatter(3000),
								new MonsterEvent(Charactor.Molochbaby, 10, 20).scatter(3000))),
				new MonsterSet("spinelings", false, 20).monsters(
						new MonsterEvent(Charactor.Spineling, 10, 12),
						new MonsterEvent(Charactor.Spineling_giant, 1, 2)),
				new MonsterSet("threshers", false, 10).monsters(
						new MonsterEvent(Charactor.Bonethresher, 2, 3),
						new MonsterEvent(Charactor.Tigerthresher, 6, 9)),
				new MonsterSet("mudraptors", false, 10).monsters(
						new MonsterEvent(Charactor.Mudraptor, 3, 4),
						new MonsterEvent(Charactor.Mudraptor_veteran, 2, 2)),
				new MonsterSet("crawlers", true, 10).monsters(
						new MonsterSet("crawlerswarm").monsters(
								new MonsterEvent(Charactor.Crawler, 10, 12),
								new MonsterEvent(Charactor.Crawlerbroodmother, 1, 1)),
						new MonsterSet("Crawlerhusk").monsters(
								new MonsterEvent(Charactor.Crawlerhusk, 10, 12))),
				new MonsterSet("watcher", 10).monsters(
						new MonsterEvent(Charactor.Watcher, 1, 1).triggereventcooldown(false),
						new MonsterSet(true).monsters(
								new MonsterSet("crawlers").monsters(
										new MonsterEvent(Charactor.Crawler, 9, 11)),
								new MonsterSet("mudraptors").monsters(
										new MonsterEvent(Charactor.Mudraptor, 5, 5)),
								new MonsterSet("threshers").monsters(
										new MonsterEvent(Charactor.Bonethresher, 2, 3),
										new MonsterEvent(Charactor.Tigerthresher, 5, 8)))));
		
		StringWriter writer = new StringWriter();
		spawnEvent.render(1, writer);
		Assertions.assertEquals(ignoreWhitespace(expected), ignoreWhitespace(writer.toString()));
		
	}
	
	public static String ignoreWhitespace(String input) {
		return IGNORE_WHITESPACE_PATTERN.matcher(input).replaceAll("");
	}
}
