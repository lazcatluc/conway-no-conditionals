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
		final Set<Cell> twoNeighbors = cellsByNeighbors.getOrDefault(2, Collections.emptySet());
		final Set<Cell> threeNeighbors = cellsByNeighbors.getOrDefault(3, Collections.emptySet());
		Set<Cell> survivors = new HashSet<>(twoNeighbors);
		survivors.addAll(threeNeighbors);
		return new Universe(survivors.toArray(new Cell[survivors.size()]));
	}
}
