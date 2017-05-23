package ro.contezi;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Evolver {

	public Universe evolve(Universe original) {
		Map<Integer, Set<Cell>> cellsByNeighbors = new HashMap<>();
		original.getCells().forEach(cell -> cellsByNeighbors
				.computeIfAbsent(original.findNeighborsOf(cell).size(), i -> new HashSet<>()).add(cell));
		return new Universe(cellsByNeighbors.getOrDefault(2, Collections.emptySet()).toArray(new Cell[]{}));
	}
}
