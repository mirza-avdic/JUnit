package FinalProjectMirza;

import java.util.Scanner;

public class Stretch {
	
	boolean didYoga = false;
	String yoga = "yoga";
	
	public static boolean doYoga() {
		boolean yoga = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input if you did yoga today, true or false : ");
		String yogaOrNot = input.next();
		if(yogaOrNot == "true") {
			return true;
		}
		return yoga;
	}
	
	public static int getTime() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input how long you did yoga for, in minutes : ");
		int time = input.nextInt();
		return time;
	}
	
	public static boolean yesOrNo(boolean didYoga) {
		if(didYoga == true) {
			System.out.println("Good job on doing yoga today, you're on your way to improved flexibility\n");
			return true;
		}else {
			System.out.println("Awww, try again tomorrow\n");
			return false;
		}	
	}
	
	public static boolean reportStretch(boolean yoga, boolean warmup) {
		if(yoga == true || warmup == true)
		return true;
		else
		return false;
	}
}
