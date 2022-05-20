package FinalProjectMirza;

import java.util.Scanner;

public class Run {
	public final String walk = "walk";
	public final String slow = "slow";
	public static final String jog = "jog";
	public final String fast = "fast";
	public int distance = 0;
	public String speed;
	public static int overallRating = 0;
	public static final int goal = 20000;
	
	
	public int getDistance() {
		int distance = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("\nPlease input distance amount ran in meters: ");
		distance = input.nextInt();
		return distance;
	}
	
	public static String getSpeed() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your speed : ");
		System.out.println("Enter \"walk\" for walk \n\"slow\" for slow \n\"jog\" for jog \n\"fast\" for fast");
		String speed = input.next();
		return speed;
	}
	
	public Run(int distance, String speed) {
		this.distance = 0;
		this.speed = speed;
	}
	public Run() {
	}
	
	public static boolean reportDistance(int distance, String pace) {
		if(distance >= 2000 && (pace == "jog" || pace == "fast" || pace == "slow" || pace == "walk"))
		return true;
		else
		return false;
	}
}
