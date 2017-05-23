package ro.contezi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Universe {
	static final Universe EMPTY = new Universe();

	private final Set<Cell> cells;
	public Universe(Cell... cells) {
		this.cells = new HashSet<>(Arrays.asList(cells));
	}

	public boolean contains(Cell cell) {
		return cells.contains(cell);
	}
}
