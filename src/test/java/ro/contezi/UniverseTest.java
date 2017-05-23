package ro.contezi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class UniverseTest {
	@Test
	public void emptyUniverseRemainsEmpty() throws Exception {
		assertThat(evolve(Universe.EMPTY)).isEqualTo(Universe.EMPTY);
	}
	
	@Test
	public void universeWithOneCellEvolvesToEmpty() throws Exception {
		assertThat(evolve(universeWith(Cell.at(0, 0)))).isEqualTo(Universe.EMPTY);
	}
	
	@Test
	public void universeWithOneCellContainsCell() throws Exception {
		assertThat(universeWith(Cell.at(0, 0)).getCells()).contains(Cell.at(0, 0));
	}
	
	@Test
	public void emptyUniverseDoesNotContainCell() throws Exception {
		assertThat(Universe.EMPTY.getCells()).doesNotContain(Cell.at(0, 0));
	}
	
	@Test
	public void universeWithOneCellHasNoNeighbors() throws Exception {
		assertThat(universeWith(Cell.at(0, 0)).findNeighborsOf(Cell.at(0, 0))).isEmpty();
	}

	private Universe universeWith(Cell cell) {
		return new Universe(cell);
	}

	private Universe evolve(Universe universe) {
		return Universe.EMPTY;
	}
}
