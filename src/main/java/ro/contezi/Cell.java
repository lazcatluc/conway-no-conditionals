package ro.contezi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class Cell {
	
	private static final Map<Integer, Map<Integer, Cell>> CARTESIAN_LOCATIONS = new HashMap<>();

	private final int x;
	private final int y;
	
	private Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static Cell at(int x, int y) {
		return CARTESIAN_LOCATIONS.computeIfAbsent(x, position -> new HashMap<>())
						.computeIfAbsent(y, position -> new Cell(x, y));
	}

	public Collection<Cell> getPotentialNeighbors() {
		return Arrays.asList(
				Cell.at(x - 1, y - 1), Cell.at(x - 1, y), Cell.at(x - 1, y + 1),
				Cell.at(x, y - 1), Cell.at(x, y + 1),
				Cell.at(x + 1, y -1), Cell.at(x + 1, y), Cell.at(x + 1, y + 1)
			);
	}

}
