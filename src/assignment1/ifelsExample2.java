package assignment1;
import java.util.*;
public class ifelsExample2 {
	public static void main(String[] args) {
		System.out.println("Enter your percentage  :");
		Scanner scanner = new Scanner(System.in);
		double percent = scanner.nextDouble();
			if (percent > 75.00)
			{
				System.out.println("Distinction");
			}
			else
			{
				System.out.println("First Class or lower");
			}
			scanner.close();
	}

}
