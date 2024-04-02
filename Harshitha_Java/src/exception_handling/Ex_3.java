package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		try {
			Scanner s1 = new Scanner(System.in);
			int a = s1.nextInt();// suppose 1st time i will wnter 1, answer will be 1
			int c = 1 / a;// Second time i will enter 0 , answer is infinite or arithemtic exception
			System.out.println(c);// third time i will enter my name Manish, answer is Input MisMatchException
		} catch (ArithmeticException e1) {
			System.out.println("handled the exception please continue 1...");
		} catch (InputMismatchException e2) {
			System.out.println("handled the exception please continue 2...");
		}
	}
}