package FinalProjectMirza;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

// Step 5
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// Step 6
import org.junit.Test;
import org.junit.experimental.categories.Category;

// Step 1
@RunWith(Parameterized.class)
@Category(GroupTest1.class)
public class EatTest {
	
	// Step 2
	private int value1;
	private int value2;
	
	// Step 3
@Parameters
public static Collection getParameters() {
		return Arrays.asList(new Object [][]{
			{100, 1000},
			{200, 800},
			{300, 750},	
			{400, 500},		
			{500, 666},		
		});
	}
	
	// Step 4
	public EatTest (int value1, int value2) {
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
		System.out.println("Blackbox Testing...using input of static class variable");
		System.out.println("Will pass if you eat 2000 calories a day");
		
		Eat food = new Eat();
		// Tests using a static Class variable
		//assertEquals(2000,Eat.caloriesPerDay);
		assertEquals(true, Eat.reportCalories(value2, value1));
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
