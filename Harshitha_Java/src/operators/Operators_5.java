package operators;
//Assignment-7
public class Operators_5 {
	static void add() {
		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println(sum);
	}

	static void sub() {
		int a = 100;
		int b = 200;
		int sum = b - a;
		System.out.println(sum);
	}

	static void mul() {
		int a = 100;
		int b = 200;
		int sum = a * b;
		System.out.println(sum);
	}

	static void div() {
		int a = 100;
		int b = 200;
		int sum = b / a;
		System.out.println(sum);
	}

	static void mod() {
		int a = 100;
		int b = 200;
		int sum = b % a;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
	}
}