package FinalProjectMirza;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		// Instantiate all instance objects for trial run
		Eat eat = new Eat();
		Run run = new Run();
		Strength strength = new Strength();
		Stretch stretch = new Stretch();
		Train train = new Train();
		Weight weight = new Weight();
				
		// Begin trial run
		System.out.println("Hello, lets track your fitness.\n");	
		
		// Eating and calories
		 int amount = eat.getCalories();
		 int remaining = Eat.caloriesPerDay - amount;
		 System.out.println("You have: " + remaining + " calories remaining to eat today out of the max " + Eat.caloriesPerDay + "\n");
				

		 // Run and cardio
		 System.out.println("Now lets input your run and cardio statistics");
		 int amount2 = run.getDistance();
		 int remaining2 = run.goal - amount2;
		 System.out.println("You have: " + remaining2 + " meters left to run by the end of the week\n");
				
		// Strength checking
		 strength.goal();
		 

		 // Yoga testing 
		 System.out.println("\nPlease input true or false if you did yoga today");
		 boolean answer4 = input.nextBoolean();
		 stretch.yesOrNo(answer4);
				
		// Training 5x a week or more, loop testing
		 train.checkWeek();
		 
		 // Weight testing for previous and current weights
		 System.out.println("Input your weight today\n");
		 int weight1 = input.nextInt();
		 System.out.println("Input your weight yesterday\n");
 		 int weight2 = input.nextInt();
 		 boolean answer6 = weight.reportWeight(weight1, weight2);
			if(answer6) {
				System.out.println("Congrats, you are losing weight");
				System.out.println("\nYou lost: " + (weight2 - weight1) + " pound");
			}
			else {
				System.out.println("Try and edit your weight plan");
			}
		}		
	}