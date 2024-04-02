package variables;
//Assignment-23b
//Arithmetic operators
public class Global_Ex2 {
	static int number1 = 200;
	static int number2 = 100;

	static void add() {
		int sum = number1 + number2;
		System.out.println(sum);
	}

	static void sub() {
		int sum = number1 - number2;
		System.out.println(sum);
	}

	static void mul() {
		int sum = number1 * number2;
		System.out.println(sum);
	}

	static void div() {
		int sum = number1 / number2;
		System.out.println(sum);
	}

	static void mod() {
		int sum = number1 % number2;
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