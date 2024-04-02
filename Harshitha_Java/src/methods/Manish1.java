package methods;
//Assignment-17 Constructor program
public class Manish1 {
	static void add() {
		System.out.println("Addition");
	}

	static void sub() {
		System.out.println("Subtraction");
	}

	void mul() {
		System.out.println("Multiplication");
	}

	void div() {
		System.out.println("Division");
	}

	Manish1() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		
		// calling static
		add();
		sub();
		
		// creating object and calling constructor
		Manish1 m1 = new Manish1();
		m1.mul();// calling non-static
		m1.div();

		new Manish1();// calling constructor again
	}
}