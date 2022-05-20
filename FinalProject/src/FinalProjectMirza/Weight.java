package FinalProjectMirza;

import java.util.Scanner;

public class Weight {

	public static final int strong = 300;
	public static final int medium = 200;
	public static final int weak = 100;

	
	public static String getWeight() {
		int amount = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the heaviest lift amount : ");
		amount = input.nextInt();
		
		if(amount >= weak) {
			return "weak";	
		}
		
		if(amount >= medium) {
			return "medium";	
		}
		
		else {
			return "strong";	
		}
	}
	
	public static boolean reportWeight(int now, int yesterday) {
		if(now < yesterday) 
		return true;
		else
		return false;
	}
	
	// EXCEPTION REQUIREMENT
	public static void notZero(int x) throws IllegalArgumentException{
		if(x <= 0) throw new IllegalArgumentException();
		System.out.println("\nException occured, cannot be under 0 pounds");
	}
}
