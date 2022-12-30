package com.decker.barotrauma;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import com.decker.barotrauma.campaign.BeaconClownEvent;
import com.decker.barotrauma.campaign.EventPrefabs;
import com.decker.barotrauma.campaign.EventSet;
import com.decker.barotrauma.campaign.OverrideSet;
import com.decker.barotrauma.campaign.RandomEvents;

public class CampaignEvents {
	
	public static EventSet campaign() {
		return new RandomEvents().extend(
				new OverrideSet().extend(
						new EventPrefabs().extend(new BeaconClownEvent()),
						Difficulties.coldCaverns0(),
						Difficulties.coldCaverns1(),
						Difficulties.coldCaverns2(),
						Difficulties.coldCavernsTransition(),
						Difficulties.europanRidge(),
						Difficulties.europanRidgeToPlateau(),
						Difficulties.aphoticPlateau1(),
						Difficulties.aphoticPlateau2(),
						Difficulties.plateauToSea(),
						Difficulties.greatSea(),
						Difficulties.wastes(),
						Difficulties.end()));
	}
	
	public static void main(String[] args) throws IOException {
		try (Writer writer = new OutputStreamWriter(new FileOutputStream("randomevents_campaign.xml"), "UTF-8")) {
			writer.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
			campaign().render(0, writer);
		}
	}
	
}
