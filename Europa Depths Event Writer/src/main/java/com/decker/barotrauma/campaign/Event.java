package com.decker.barotrauma.campaign;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.Map.Entry;

public interface Event {
	
	public void render(int depth, Writer writer) throws IOException;
	
	
	
	public default String fields(Map<String, Object> fields) {
		if (fields != null) {
			StringBuilder sb = new StringBuilder(" ");
			for (Entry<String, Object> entry : fields.entrySet()) {
				sb.append(String.format("%s=\"%s\" ", entry.getKey(), entry.getValue()));
			}
			return sb.toString();
		}
		return "";
	}
	
	public default String indent(int depth) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			sb.append("\t");
		}
		return sb.toString();
	}
	
}
