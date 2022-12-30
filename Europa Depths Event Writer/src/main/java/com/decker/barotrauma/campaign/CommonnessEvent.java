package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CommonnessEvent implements Event {
	
	Map<String, Double> biomes = new LinkedHashMap<>();
	
	public CommonnessEvent(String... biomes) {
		for (String biome : Arrays.asList(biomes)) {
			this.leveltype(biome, 1d);
		}
	}
	
	public CommonnessEvent leveltype(String biome, double commonness) {
		this.biomes.put(biome, commonness);
		return this;
	}
	
	@Override
	public void render(int depth, Writer writer) throws IOException {
		writer.write(this.indent(depth));
		if (this.biomes.size() > 0) {
			writer.write("<Commonness commonness=\"0\">\n");
			
			for (Entry<String, Double> entry : biomes.entrySet()) {
				writer.write(this.indent(depth + 1));
				writer.write(String.format("<Override leveltype=\"%s\" commonness=\"%s\" />\n", entry.getKey(), Double.toString(entry.getValue()).replaceAll("[.]0", "")));
			}
			
			writer.write(this.indent(depth));
			writer.write("</Commonness>\n");
		} else {
			writer.write("<Commonness commonness=\"1\"/>\n");
		}
	}
	
}
