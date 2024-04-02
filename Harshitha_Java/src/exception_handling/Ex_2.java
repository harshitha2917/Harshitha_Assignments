package exception_handling;

import java.util.InputMismatchException;

public class Ex_2 {

	public static void main(String[] args) {
		try
		{
			int c = 1 / 0;
			System.out.println(c);
		} catch (ArithmeticException e1) {
			System.out.println("handled the exception please continue 1...");
		} catch (InputMismatchException e2) {
			System.out.println("handled the exception please continue 2...");
		}
	}

}
