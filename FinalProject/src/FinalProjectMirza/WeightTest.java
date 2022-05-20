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
@Category(GroupTest1.class)

public class WeightTest {
	private int value1;
	private int value2;

	@Parameters
	public static Collection getParameters() {
			return Arrays.asList(new Object [][]{
				{180, 182},
				{200, 210},
				{155, 175},	
				{140, 152},		
				{250, 266},		
			});
		}
		
		// Step 4
		public WeightTest (int value1, int value2) {
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
		Weight weight = new Weight();
		System.out.println("Whitebox Testing...using condition testing");
		System.out.println("Will pass if weight is 300+");
		assertEquals(true, weight.reportWeight(value1, value2));
	}
	
	// EXCEPTION
	@Test(expected = IllegalArgumentException.class)
	public void notZeroTest() {
		Weight weight = new Weight();
		Weight.notZero(0);
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("After Class Teardown\n");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class\n");
	}
}
