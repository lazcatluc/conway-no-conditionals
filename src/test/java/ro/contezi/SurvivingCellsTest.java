package ro.contezi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

public class SurvivingCellsTest {

	private Evolver evolver;

	@Before
	public void setUp() {
		evolver = new Evolver();
	}

	@Test
	public void cellWithTwoNeighborsSurvives() throws Exception {
		assertThat(evolver.evolve(new Universe(Cell.at(0, 0), Cell.at(1, 0), Cell.at(2, 0))).getCells())
				.isEqualTo(Collections.singleton(Cell.at(1, 0)));
	}
	
	@Test
	public void cellWithThreeNeighborsSurvives() throws Exception {
		assertThat(evolver.evolve(new Universe(Cell.at(0, 0), Cell.at(1, 0), Cell.at(2, 0), Cell.at(1, 1))).getCells())
				.contains(Cell.at(1, 0));
	}
}
