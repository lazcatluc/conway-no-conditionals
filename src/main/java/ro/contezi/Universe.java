package ro.contezi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Universe {
	static final Universe EMPTY = new Universe();

	private final Set<Cell> cells;
	
	public Universe(Cell... cells) {
		this.cells = new HashSet<>(Arrays.asList(cells));
	}

	public Set<Cell> getCells() {
		return Collections.unmodifiableSet(cells);
	}

	public Set<Cell> findNeighborsOf(Cell cell) {
		Set<Cell> possibleNeighbors = new HashSet<>(cell.getPotentialNeighbors());
		possibleNeighbors.retainAll(cells);
		return possibleNeighbors;
	}
}
