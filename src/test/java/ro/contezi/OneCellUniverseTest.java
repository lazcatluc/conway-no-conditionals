package ro.contezi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class OneCellUniverseTest {
	
	private Evolver evolver;
	
	@Before
	public void setUp() {
		evolver = new Evolver();
	}
	
	@Test
	public void universeWithOneCellEvolvesToEmpty() throws Exception {
		assertThat(evolver.evolve(universeWith(Cell.at(0, 0))).getCells()).isEmpty();
	}
	
	@Test
	public void universeWithOneCellContainsCell() throws Exception {
		assertThat(universeWith(Cell.at(0, 0)).getCells()).contains(Cell.at(0, 0));
	}
	
	@Test
	public void universeWithOneCellHasNoNeighbors() throws Exception {
		assertThat(universeWith(Cell.at(0, 0)).findNeighborsOf(Cell.at(0, 0))).isEmpty();
	}

	private Universe universeWith(Cell cell) {
		return new Universe(cell);
	}
}
