package ro.contezi;

import java.util.HashMap;
import java.util.Map;

public final class Cell {
	
	private static final Map<Integer, Map<Integer, Cell>> LOCATIONS = new HashMap<>();

	private Cell() {
		
	}
	
	public static Cell at(int x, int y) {
		return LOCATIONS.computeIfAbsent(x, position -> new HashMap<>())
						.computeIfAbsent(y, position -> new Cell());
	}

}
