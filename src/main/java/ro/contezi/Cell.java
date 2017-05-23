package ro.contezi;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Cell {
	
	private static final Map<Integer, Map<Integer, Cell>> CARTESIAN_LOCATIONS = new HashMap<>();

	private Cell() {
		
	}
	
	public static Cell at(int x, int y) {
		return CARTESIAN_LOCATIONS.computeIfAbsent(x, position -> new HashMap<>())
						.computeIfAbsent(y, position -> new Cell());
	}

	public Collection<Cell> getPotentialNeighbors() {
		return Collections.emptyList();
	}

}
