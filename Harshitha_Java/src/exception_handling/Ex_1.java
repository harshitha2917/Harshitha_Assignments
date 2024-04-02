package exception_handling;

public class Ex_1 {

	public static void main(String[] args) {
		try {
			int c = 1 / 0;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("handled the exception please continue...");
		}

	}

}
