package control_statements;
import java.util.Scanner;
public class WhileExample3 {
	public static void main(String[] args) {
		int sum = 0;

	    Scanner input = new Scanner(System.in);
	    System.out.println("--program to print the sum of only positive integers--");
	    System.out.println("Enter a number : ");
	    int number = input.nextInt();

	    while (number >= 0) {

	      sum += number;

	      System.out.println("Enter a number ");
	      number = input.nextInt();
	    }
		System.out.println("A negative number was entered!");  
	    System.out.println("Sum of all positive intergers= " + sum);
	    input.close();
	  }
}
