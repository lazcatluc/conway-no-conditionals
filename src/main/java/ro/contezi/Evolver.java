package ro.contezi;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Evolver {

	public Universe evolve(Universe original) {
		Set<Cell> newlyLivingCells = new HashSet<>(twoNeighbors(original));
		newlyLivingCells.addAll(threeNeighbors(original));
		return new Universe(newlyLivingCells.toArray(new Cell[newlyLivingCells.size()]));
	}
	
	public Set<Cell> twoNeighbors(Universe original) {
		Map<Integer, Set<Cell>> cellsByNeighbors = new HashMap<>();
		original.getCells().forEach(cell -> cellsByNeighbors
				.computeIfAbsent(original.findNeighborsOf(cell).size(), i -> new HashSet<>()).add(cell));
		return cellsByNeighbors.getOrDefault(2, Collections.emptySet());
	}
	
	public Set<Cell> threeNeighbors(Universe original) {
		Map<Integer, Set<Cell>> cellsByNeighbors = new HashMap<>();
		original.getCells().stream().map(Cell::getPotentialNeighbors).flatMap(Collection::stream)
			.forEach(cell -> cellsByNeighbors
				.computeIfAbsent(original.findNeighborsOf(cell).size(), i -> new HashSet<>()).add(cell));
		return cellsByNeighbors.getOrDefault(3, Collections.emptySet());
	}
}
