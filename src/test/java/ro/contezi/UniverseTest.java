package ro.contezi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class UniverseTest {
	@Test
	public void emptyUniverseRemainsEmpty() throws Exception {
		assertThat(evolve(emptyUniverse())).isEqualTo(emptyUniverse());
	}

	private Object evolve(Universe emptyUniverse) {
		return emptyUniverse;
	}

	private Universe emptyUniverse() {
		return Universe.EMPTY;
	}
}
