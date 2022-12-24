package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.TreeMap;

public class SpawnAction implements ScriptedAction {
	
	Map<String, Object> fields = new TreeMap<>(new FieldComparator());
	
	public SpawnAction(String npcSet, String npcidentifier, String targettag, String spawnpointtag) {
		fields.put("npcsetidentifier", npcSet);
		fields.put("npcidentifier", npcidentifier);
		fields.put("targettag", targettag);
		fields.put("spawnpointtag", spawnpointtag);
		fields.put("requirespawnpointtag", "true");
		fields.put("team", "None");
	}
	
	@Override
	public void render(int depth, Writer writer) throws IOException {
		writer.write(this.indent(depth));
		writer.write(String.format("<%s%s/>\n", this.getTag(), this.fields(this.getFields())));
	}
	
	public SpawnAction spawnlocation(String spawnlocation) {
		fields.put("spawnlocation", spawnlocation);
		return this;
	}
	
	public String getTag() {
		return "SpawnAction";
	}
	
	public Map<String, Object> getFields() {
		return fields;
	}
	
}
