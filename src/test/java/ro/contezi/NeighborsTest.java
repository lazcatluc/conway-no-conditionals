package ro.contezi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class NeighborsTest {
	@Test
	public void generatesNeighbors() throws Exception {
		assertThat(new HashSet<>(Cell.at(0, 0).getPotentialNeighbors())).isEqualTo(
				new HashSet<>(Arrays.asList(
						Cell.at(-1, -1), Cell.at(-1, 0), Cell.at(-1, 1),
						Cell.at(0, -1), Cell.at(0, 1),
						Cell.at(1, -1), Cell.at(1, 0), Cell.at(1, 1)
						)));
	}
}
