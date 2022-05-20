package FinalProjectMirza;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertAll {
	
	String name = "mirza";
	int weight = 185;
	String eat = "pizza";
	int runKm = 5;
	int strength = 90;
	String stretch = "yoga";
	int trainingPerWeek = 5;
	
	Run runs = new Run(5, "jog");
	Train train = new Train();
	Eat eats = new Eat();
	Strength strengths = new Strength();
	Stretch stretchs = new Stretch();
	Weight weights = new Weight();
	
	
	@Test
	void test() {
		assertAll(
				() -> assertEquals("mirza", name),
				() -> assertEquals(5, Train.maxTrainingSessions),
				() -> assertEquals(185, weight),
				() -> assertEquals("pizza", eat),
				() -> assertEquals(5, runKm),
				() -> assertEquals(90, strength),
				() -> assertEquals("yoga", stretchs.yoga),
				() -> assertNotEquals(name, "Joseph"),
				() -> assertNotEquals(weight, Strength.benchPress),
				() -> assertNotEquals(eat, "chocolate"),
				() -> assertNotEquals(runKm, 4),
				() -> assertNotEquals(strength, 100),
				() -> assertNotEquals(stretchs.didYoga, "pilates"),
				() -> assertNotEquals(trainingPerWeek, 14)
				);
	}
}
