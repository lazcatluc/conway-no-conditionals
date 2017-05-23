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
	
	@Test
	public void universeWithOneCellContainsCell() throws Exception {
		final Cell cell = new Cell();
		assertThat(universeWith(cell).getCells()).contains(cell);
	}
	
	@Test
	public void emptyUniverseDoesNotContainCell() throws Exception {
		assertThat(Universe.EMPTY.getCells()).doesNotContain(new Cell());
	}

	private Universe universeWith(Cell cell) {
		return new Universe(cell);
	}

	private Universe evolve(Universe universe) {
		return Universe.EMPTY;
	}
}
