package FinalProjectMirza;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Train {
	public static int countTrainingSessions = 0;
	public boolean trainToday = false;
	public final static int maxTrainingSessions = 5;
	static String [] days = new String [] {
			"Monday", 
			"Tuesday", 
			"Wednesday", 
			"Thursday", 
			"Friday", 
			"Saturday", 
			"Sunday"
			};
	
	public static boolean getTrainingToday() {
		boolean trainedOrNot = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input true or false if you trained today : ");
		trainedOrNot = input.nextBoolean();
		return trainedOrNot;
	}
	
	public static int checkWeek() {		
		
		System.out.println("\nPlease input if you worked out for the past 7 days, true or false each time : ");
		Scanner input = new Scanner(System.in);
		
		for(String day: days) {
			System.out.println("Did you workout on " + day);
			boolean answer = input.nextBoolean();
			if(answer == true) {
				countTrainingSessions++;
			}
		}
		if(countTrainingSessions < 5) {
			System.out.println("Too bad, you did not workout 5x this week");
		}
		if(countTrainingSessions >= 5) {
			System.out.println("Great job, you did a workout 5x or more this week");
		}
		return countTrainingSessions;
	}
	
	public static boolean reportTrain(int quantity, String day) {
		if(quantity >= 5 && (day == "Monday" || day == "Tuesday" || day == "Wednesday" || day == "Thursday" || day == "Friday" || day == "Saturday" || day == "Sunday"))
		return true;
		else
		return false;
	}
}
