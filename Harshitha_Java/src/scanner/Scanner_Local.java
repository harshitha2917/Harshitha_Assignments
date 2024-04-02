package scanner;
import java.util.Scanner;
//Assignment-29
public class Scanner_Local {
	static void add() {
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sum = a + b;
		System.out.println( "Addition of 2 nos.:"+sum);
	}

	static void sub() {
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sum = a - b;
		System.out.println("Subtraction of 2 nos.:"+sum);
	}

	static void mul() {
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sum = a * b;
		System.out.println("Multiplication of 2 nos.:"+sum);
	}

	static void div() {
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sum = a / b;
		System.out.println("Division of 2 nos.:"+sum);
	}
	static void mod() {
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sum = a % b;
		System.out.println("Modulus of 2 nos.:"+sum);
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();

	}

}