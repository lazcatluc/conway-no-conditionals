package ro.contezi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class EmptyUniverseTest {
	
	private Evolver evolver;
	
	@Before
	public void setUp() {
		evolver = new Evolver();
	}
	
	@Test
	public void emptyUniverseRemainsEmpty() throws Exception {
		assertThat(evolver.evolve(new Universe()).getCells()).isEmpty();
	}
	
	@Test
	public void emptyUniverseDoesNotContainCell() throws Exception {
		assertThat(new Universe().getCells()).doesNotContain(Cell.at(0, 0));
	}

}
