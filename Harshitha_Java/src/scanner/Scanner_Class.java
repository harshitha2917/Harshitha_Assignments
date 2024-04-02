package scanner;
import java.util.Scanner;
//Assignment-26
public class Scanner_Class {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a9: ");
		String a9 = sc.nextLine();
		
		System.out.println("Enter the value of a1: ");
		byte a1 = sc.nextByte();
		System.out.println("Enter the value of a2: ");
		short a2 = sc.nextShort();
		System.out.println("Enter the value of a3: ");
		int a3 = sc.nextInt();
		System.out.println("Enter the value of a4: ");
		long a4 = sc.nextLong();

		System.out.println("Enter the value of a5: ");
		float a5 = sc.nextFloat();
		System.out.println("Enter the value of a6: ");
		double a6 = sc.nextDouble();

		System.out.println("Enter the value of a7: ");
		boolean a7 = sc.nextBoolean();
		System.out.println("Enter the value of a8: ");
		String a8 = sc.next();

	}

}