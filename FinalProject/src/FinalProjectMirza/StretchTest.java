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

public class StretchTest {
	
	private boolean value1;
	private boolean value2;
	
	@Parameters
	public static Collection getParameters() {
			return Arrays.asList(new Object [][]{
				{true, true},
				{false, true},
				{true, false},	
				{false, true},		
				{true, true},		
			});
		}
		
		// Step 4
		public StretchTest (boolean value1, boolean value2) {
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
		Stretch yoga = new Stretch();
		System.out.println("Whitebox Testing...using path testing");
		// Tests both paths
		
		// Returns true when did yoga today is true
		assertEquals(true,yoga.reportStretch(value1, value2));
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
