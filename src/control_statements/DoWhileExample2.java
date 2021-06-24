package control_statements;
import java.util.*;
public class DoWhileExample2 {
	public static void main(String[] args) {
		System.out.println("--program for adding only positive integers--");
		int sum = 0;
	    int number = 0;
	    Scanner input = new Scanner(System.in);
	    do {
	      sum += number;
	      System.out.println("Enter a number");
	      number = input.nextInt();
	    } 
	    while(number >= 0); 
		System.out.println("A negative number was entered !"); 
	    System.out.println("Sum of only positive integers= " + sum);
	    input.close();
	  }
}
