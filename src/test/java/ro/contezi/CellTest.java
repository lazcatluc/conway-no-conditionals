package ro.contezi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CellTest {
	@Test
	public void thereCanBeASingleCellAtSpecificCoordinate() throws Exception {
		assertThat(Cell.at(0, 0)).isEqualTo(Cell.at(0, 0));
	}
}
