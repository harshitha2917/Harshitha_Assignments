package scanner;

import java.util.Scanner;
//Assignment-27
public class Scanner_Global {
	static Scanner s1 = new Scanner(System.in);
	static int a = s1.nextInt();
	static int b = s1.nextInt();

	static void add() {
		int sum = a + b;
		System.out.println(sum);
	}

	static void sub() {
		int sum = a - b;
		System.out.println(sum);
	}

	static void mul() {
		int sum = a * b;
		System.out.println(sum);
	}

	static void div() {
		int sum = a / b;
		System.out.println(sum);
	}

	static void mod() {
		int sum = a % b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		add();
		sub();
		mul();
		div();
		mod();
	}
}