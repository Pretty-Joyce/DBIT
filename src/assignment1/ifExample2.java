package assignment1;
import java.util.*;
public class ifExample2 {
	public static void main(String[] args) {
		System.out.println("Enter a number more than 1 :");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n>1)
		{
		System.out.println("The number is greater than 1");
		}
		in.close();
	}

}
