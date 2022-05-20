package FinalProjectMirza;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
// import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@Category(GroupTest1.class)

public class RunTest {
	
	private int value1;
	private String value2;
		
	@Parameters
	public static Collection getParameters() {
			return Arrays.asList(new Object [][]{
				{2010, "fast"},
				{4000, "jog"},
				{2500, "walk"},	
				{3000, "slow"},		
				{5000, "jog"},		
			});
		}
		
		// Step 4
		public RunTest (int value1, String value2) {
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
		System.out.println("Blackbox Testing...using static class method");
		System.out.println("Will pass if pace is \"run\"");
		
		Run run = new Run(2000, "fast");
		// Tests using a static Class variable
		assertEquals(true, run.reportDistance(value1, value2));
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
