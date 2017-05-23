package ro.contezi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class UniverseTest {
	@Test
	public void emptyUniverseRemainsEmpty() throws Exception {
		assertThat(evolve(Universe.EMPTY)).isEqualTo(Universe.EMPTY);
	}
	
	@Test
	public void universeWithOneCellEvolvesToEmpty() throws Exception {
		assertThat(evolve(universeWith(new Cell()))).isEqualTo(Universe.EMPTY);
	}

	private Universe universeWith(Cell cell) {
		return Universe.EMPTY;
	}

	private Universe evolve(Universe universe) {
		return universe;
	}
}
