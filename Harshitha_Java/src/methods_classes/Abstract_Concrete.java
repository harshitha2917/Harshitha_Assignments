package methods_classes;
abstract class Third_Class// abstract class
{
	abstract void thirdmethod();// abstract methods are non-static
	abstract void fourthmethod();

	void add() // non-static concrete method
	{
		System.out.println("Addition of two numbers");

	}

	static void sub() // static Concrete method
	{
		System.out.println("Subtraction of two numbers");
	}
}

abstract class Second_Class extends Third_Class {
	abstract void secondmethod();
	abstract void firstmethod();

	void mul() {
		System.out.println("Multiplication of two numbers");

	}

	void div() {
		System.out.println("Division of two numbers");
	}
}

public class Abstract_Concrete extends Second_Class {
	void add1() {
		System.out.println("Addition1 of two numbers");

	}

	void add2() {
		System.out.println("Addition2 of two numbers");
	}

	public static void main(String[] args) {
		Abstract_Concrete ac1 = new Abstract_Concrete();
		ac1.add1();
		ac1.add2();
		ac1.add();
		sub();
		ac1.mul();
		ac1.div();
	}

	@Override
	void secondmethod() {
		System.out.println("Developer will write intern logic");
	}

	@Override
	void firstmethod() {
		System.out.println("Developer will write intern logic");

	}

	@Override
	void thirdmethod() {
		System.out.println("Developer will write intern logic");

	}

	@Override
	void fourthmethod() {
		System.out.println("Developer will write intern logic");

	}

}