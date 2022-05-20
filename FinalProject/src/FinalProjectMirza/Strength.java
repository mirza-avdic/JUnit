package FinalProjectMirza;

import java.util.Scanner;

public class Strength {
	public static int benchPress = 200;
	public static int squat = 200;
	public static int lunge = 60;
	public static int pullUp = 180;
	public int reps = 0;
	public static int maxReps = 10;
	
	public static int getReps() {
		int reps = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input reps amount : ");
		reps = input.nextInt();
		return reps;
	}
	
	public static int getExercise() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input which exercise you did : ");
		System.out.println("Enter: \n1 for bench press \n2 for squat \n3 for lunges \n4 for pull-ups");
		int exercise = input.nextInt();
		return exercise;
	}
	
	public static boolean reportStrength(int weight, int repetitions) {
		if(weight > 200 && repetitions > 5)
		return true;
		else
		return false;
	}
	
	public static void goal() {
		int answer = 0;
		Strength s = new Strength();
		int answer2 = s.getExercise();
		int answer3 = s.getReps();
		int answer4 =0;
		if(answer2 == 1) {
			answer4 = benchPress;
		}
		if(answer2 == 2) {
			answer4 = squat;
		}
		if(answer2 == 3) {
			answer4 = lunge;
		}
		if(answer2 == 4) {
			answer4 = pullUp;
		}
		System.out.println("Your goal for " + answer2 + " is " + answer4 + " pounds");	
		System.out.println("Your goal for reps is " + maxReps);
		
		if(answer3 > maxReps) {
			System.out.println("Great job, you exceeded your goal\n");
		}
		if(answer3 == maxReps) {
			System.out.println("Great job, you reached your goal");
		}
		if(answer3 < maxReps) {
			System.out.println("Sorry, you did not reach your goal");
		}
	}
}
