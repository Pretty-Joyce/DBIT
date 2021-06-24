package control_statements;
public class DoWhileExample3 {
	public static void main(String[] args) {
		 int a = 21,sum = 0;		  
	        do {
	            sum += a;
	            a--;	  
	        } while (a > 10);
	        System.out.println("Summation: " + sum);
	    }
	}
