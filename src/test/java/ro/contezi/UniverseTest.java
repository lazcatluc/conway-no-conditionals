package ro.contezi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class UniverseTest {
	@Test
	public void emptyUniverseRemainsEmpty() throws Exception {
		assertThat(evolve(emptyUniverse())).isEqualTo(emptyUniverse());
	}

	private Universe evolve(Universe universe) {
		return universe;
	}

	private Universe emptyUniverse() {
		return Universe.EMPTY;
	}
}
