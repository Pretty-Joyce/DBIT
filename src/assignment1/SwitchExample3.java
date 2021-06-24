package assignment1;
import java.util.*;
public class SwitchExample3 {
	public static void main(String[] args) {
		System.out.println("---Mode of communication---\n Enter 1 if 'message mode' or 2 if 'call mode' ");
		Scanner in = new Scanner(System.in);
		int mode = in.nextInt();
		switch(mode)
		{
		case 1 : System.out.println("1 - 'message' mode of communication");
			break;
		case 2 : System.out.println("2 - 'call' mode of communication");
			break;
		default : System.out.println("Other means!!");		
		}
		in.close();
	}

}
