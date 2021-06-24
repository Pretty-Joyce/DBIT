package control_statements;
import java.util.*;
public class ForExample2 {

	public static void main(String[] args) {
		System.out.println("Enter a string value:\n ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		for (int i=0; i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
	}
}
