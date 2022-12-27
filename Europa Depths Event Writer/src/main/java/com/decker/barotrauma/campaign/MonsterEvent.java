package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.TreeMap;

public class MonsterEvent implements Monster {
	
	Map<String, Object> fields = new TreeMap<>(new FieldComparator());
	
	public MonsterEvent(Character characterfile, int minamount, int maxamount) {
		fields.put("characterfile", characterfile.toString());
		fields.put("minamount", Integer.valueOf(minamount));
		fields.put("maxamount", Integer.valueOf(maxamount));
		fields.put("spawntype", "false");
	}
	
	@Override
	public Monster spawntype(String spawntype) {
		this.fields.put("spawntype", spawntype);
		return this;
	}
	
	@Override
	public MonsterEvent spawnpointtag(String spawnpointtag) {
		this.fields.put("spawnpointtag", spawnpointtag);
		return this;
	}
	
	@Override
	public MonsterEvent spawnprobability(double spawnprobability) {
		this.fields.putIfAbsent("spawnprobability", Double.toString(spawnprobability).replaceAll(".0$", ""));
		return this;
	}
	
	public MonsterEvent probability(double probability) {
		this.fields.putIfAbsent("probability", Double.toString(probability).replaceAll(".0$", ""));
		return this;
	}
	
	@Override
	public MonsterEvent spawndistance(int spawndistance) {
		this.fields.put("spawndistance", spawndistance);
		return this;
	}
	
	public MonsterEvent maxamountperlevel(int maxamountperlevel) {
		this.fields.put("maxamountperlevel", maxamountperlevel);
		return this;
	}
	
	public MonsterEvent offset(int offset) {
		this.fields.put("offset", offset);
		return this;
	}
	
	public MonsterEvent scatter(int scatter) {
		this.fields.put("scatter", scatter);
		return this;
	}
	
	@Override
	public MonsterEvent delaybetweenspawns(double delaybetweenspawns) {
		this.fields.put("delaybetweenspawns", Double.toString(delaybetweenspawns).replaceAll(".0$", ""));
		return this;
	}
	
	public Monster triggereventcooldown(Boolean triggereventcooldown) {
		if (triggereventcooldown != null) {
			fields.put("triggereventcooldown", Boolean.toString(triggereventcooldown));
		} else {
			fields.remove("triggereventcooldown");
		}
		return this;
	}
	
	@Override
	public String getTag() {
		return "MonsterEvent";
	}
	
	@Override
	public void render(int depth, Writer writer) throws IOException {
		writer.write(this.indent(depth));
		writer.write(String.format("<%s%s/>\n", this.getTag(), this.fields(this.getFields())));
	}
	
	@Override
	public Map<String, Object> getFields() {
		return fields;
	}
	
}
