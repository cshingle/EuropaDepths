package com.decker.barotrauma;
import com.decker.barotrauma.components.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CampaignEvents {

    public static EventSet campaign() {
        return new RandomEvents().add(
                new OverrideSet().add(
                        new EventPrefabs().add(
                            ScriptedEvent.beaconClown(),
                            ScriptedEvent.beaconBandits1(),
                            ScriptedEvent.beaconBandits2(),
                            ScriptedEvent.beaconBandits3(),
                            ScriptedEvent.beaconBandits4(),
                            ScriptedEvent.beaconBandits5(),
                                new BeaconBanditsEnablelayersEvent()
                        ),
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
                        Difficulties.wastes()));
    }

    public static void main(String[] args) throws IOException {
        try (Writer writer = new OutputStreamWriter(new FileOutputStream("randomevents_campaign.xml"), "UTF-8")) {
            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
            campaign().render(0, writer);
        }
    }

}
