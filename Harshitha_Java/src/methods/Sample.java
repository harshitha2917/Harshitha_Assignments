package methods;
//Assignment-19 Constructor Overloading
public class Sample {
	Sample(int a) {
		System.out.println("Constructor 1");
	}

	Sample(double b, int a) {
		System.out.println("Constructor 2");
	}

	Sample(char c, double b, int a) {
		System.out.println("Constructor 3");
	}

	Sample(String d, char c, double b, int a) {
		System.out.println("Constructor 4");
	}

	Sample(String d, char c, double b) {
		System.out.println("Constructor 5");
	}

	Sample(String d, char c) {
		System.out.println("Constructor 6");
	}

	Sample(String d) {
		System.out.println("Constructor 7");
	}
	Sample(double b, String d) {
		System.out.println("Constructor 8");
	}

	Sample(char c) {
		System.out.println("Constructor 9");
	}

	Sample(double b) {
		System.out.println("Constructor 10");
	}

	public static void main(String[] args) {
		System.out.println("Constructor Overloading");
		new Sample(10);
		new Sample(0.01, 20);
		new Sample('A', 0.02, 30);
		new Sample("Apple", 'B', 0.03, 40);
		new Sample("Orange", 'C', 0.04);
		new Sample("Banana", 'D');
		new Sample("Grapes");
		new Sample(0.05, "Papaya");
		new Sample('E');
		new Sample(0.06);
	}
}
/*
 * Constructor without parameter Sample() { System.out.println("Hello"); }
 * public static void main(String[] args) { new Sample(); }
 */