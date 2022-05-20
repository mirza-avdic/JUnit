package FinalProjectMirza;
import java.util.Scanner;

public class Eat {

	public static final int caloriesPerDay = 2000;
	public final int breakfast = 500;
	public final int lunch = 500;
	public final int dinner = 500;
	public final int snackOne = 250;
	public final int snacktwo = 250;
	public int meal = 0;
	
	public static int getCalories() {
		int calories = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input consumed calorie amount for this meal: ");
		calories = input.nextInt();
		return calories;
	}
	
	public static int getMeal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input which meal or snack it is : ");
		System.out.println("Enter 1 for breakfast \n2 for lunch \n 3 for dinner \n4 for first snack and \n5 for second snack");
		int meal = input.nextInt();
		return meal;
	}
	
	public static boolean reportCalories(int meal1, int meal2) {
		if((meal1 + meal2) < 2000)
		return true;
		else
		return false;
	}
}
