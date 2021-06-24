package control_statements;
public class ForExample3 {
	public static void main(String[] args) {
		int sum = 0;
        for (int x = 1; x <= 10; x++) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);
    }
}
