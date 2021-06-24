package assignment1;
import java.util.*;
public class ifelsifExample3 {

	public static void main(String[] args) {
		System.out.println("Enter an alphabet:\n");
		Scanner in = new Scanner(System.in);
		char ch = in.next().charAt(0);
        if (ch == 'a' || ch == 'A')
            System.out.println(ch + " is vowel.");
        else if (ch == 'e' || ch == 'E')
            System.out.println(ch + " is vowel.");
        else if (ch == 'i' || ch == 'I')
            System.out.println(ch + " is vowel.");
        else if (ch == 'o' || ch == 'O')
            System.out.println(ch + " is vowel.");
        else if (ch == 'u' || ch == 'U')
            System.out.println(ch + " is vowel.");
        else
            System.out.println(ch + " is a consonant.");
        in.close();
	}

}
