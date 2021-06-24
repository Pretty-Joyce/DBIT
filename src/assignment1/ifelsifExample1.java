package assignment1;
import java.util.*;

public class ifelsifExample1 {
	public static void main(String[] args) {
		System.out.println("Enter a grade between 1, 2 and 3:");
		Scanner in = new Scanner(System.in);
		int grade = in.nextInt();
		if(grade == 1)
		{
			System.out.println(grade+" : BEST\nYou are the best!");
		}
		else if ( grade == 2)
		{
			System.out.println(grade+" : BETTER\nKeeping trying you are near to the goal!");
		}
		else 
		{
			System.out.println(grade+" : GOOD\nTry harder!");
		}
		in.close();
	}
}
