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

public class StrengthTest {
	// Step 2
	private int value1;
	private int value2;
	
	@Parameters
	public static Collection getParameters() {
			return Arrays.asList(new Object [][]{
				{300, 10},
				{201, 6},
				{300, 25},	
				{400, 7},		
				{500, 8},		
			});
		}
		
		// Step 4
		public StrengthTest (int value1, int value2) {
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
		Strength strong = new Strength();
		System.out.println("Blackbox Testing...using instance input/output method");
		System.out.println("If squat is 200, the test will pass");
		
		// Tests using a Instance variable
		assertEquals(true,strong.reportStrength(value1, value2));
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
