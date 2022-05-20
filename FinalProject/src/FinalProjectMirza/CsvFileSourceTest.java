package FinalProjectMirza;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class CsvFileSourceTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/CsvFileSource.csv")
	public void testWithCsvFileSource(int distance, String pace) {
	  System.out.println("Yet another parameterized test with (int) "
	      + distance + " and (String) " + pace);
	  assertNotNull(pace);
	  assertNotEquals(0, distance);
	}
}
