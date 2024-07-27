package com.decker.barotrauma.components;

import java.io.IOException;
import java.io.Writer;

public interface Entity {
	public void render(int depth, Writer writer) throws IOException;
}
