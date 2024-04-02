package inheritance;
//Assignment-31
//Single-level-inheritance
class Parent_Class {
	void mul(int a, int b) {
		System.out.println(a * b);
	}
}

public class Child_Class extends Parent_Class {
	static void add(int a, int b) {
		System.out.println(a + b);
	}

	void sub(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		add(30, 40);// calling static method

		Child_Class c1 = new Child_Class();// calling non-static method by creating child_class object
		c1.sub(50, 60);
		c1.mul(30, 40);// calling parent class method

	}

}