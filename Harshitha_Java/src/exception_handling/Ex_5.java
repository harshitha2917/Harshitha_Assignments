package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try {
			int number=s1.nextInt();	
		}
		catch(InputMismatchException e) {
			
			System.out.println("Hey exception came but dont worry I handled it");
		}
		finally {
			System.out.println("I am always there");
		}
		
		
	}

}
