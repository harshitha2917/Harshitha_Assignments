package basics_of_java;

public class Static_Method {
	static void add() {
		System.out.println("Addition");
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();

	}

	static void sub() {
		System.out.println("Subtraction");
	}

	static void mul() {
		System.out.println("Multiplication");
	}
}