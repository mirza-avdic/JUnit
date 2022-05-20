package FinalProjectMirza;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@Category(GroupTest2.class)

public class TrainTest {
	private int value1;
	private String value2;
	
	@Parameters
	public static Collection getParameters() {
			return Arrays.asList(new Object [][]{
				{5, "Monday"},
				{6, "Sunday"},
				{7, "Tuesday"},	
				{8, "Friday"},		
				{9, "Wednesday"},		
			});
		}
		
		// Step 4
		public TrainTest (int value1, String value2) {
			this.value1 = value1;
			this.value2 = value2;
		}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test() {
		Train train = new Train();
		
		// Tests loops and Array
		System.out.println("Whitebox Testing...using loop testing");
		
		// The test will pass if the number of times trained is > 5 per week
		assertEquals(true,train.reportTrain(value1, value2));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Class Teardown\n");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}
}
