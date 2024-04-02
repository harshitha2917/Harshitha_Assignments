package methods;
//Assignment-18
public class Method_Overload {
	// static methods
	static void school(int a) {
		System.out.println("Static method1");
	}

	static void school(double b, int a) {
		System.out.println("Static method2");
	}

	static void school(int a, double b, char c) {
		System.out.println("Static method3");
	}

	static void school(char c, String s) {
		System.out.println("Static method4");
	}

	// Non-static methods
	void school(int a, double b) {
		System.out.println(" Non-Static method1");
	}

	void school(char c, double b, int a) {
		System.out.println(" Non-Static method2");
	}
	void school(double b) {
		System.out.println(" Non-Static method3");
	}

	void school(char c, int a) {
		System.out.println(" Non-Static method4");
	}

	public static void main(String[] args) {
		System.out.println("Method Overloading");
		// calling static methods
		school(100);
		school(45.54, 200);
		school(300, 69.96, 'M');
		school('H', "Harshitha");
		// calling Non-Static methods
		Method_Overload m1 = new Method_Overload();
		m1.school(400, 17.71);
		m1.school('S', 25.52, 500);
		m1.school(99.99);
		m1.school('X', 600);
	}

}