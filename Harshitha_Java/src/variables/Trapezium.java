package variables;
//Assignment-22e
public class Trapezium {
	static double base_1 = 20.00;
	static double base_2 = 10.00;
	static double height = 50.00;

	static void Circumference_of_trapezium() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		System.out.println(a + b + c + d);
	}

	public static void main(String[] args) {
		double Area_of_trapezium = ((base_1 + base_2) * height) / 2;
		System.out.println("Area_of_trapezium: "+Area_of_trapezium);
		Circumference_of_trapezium();
	}

}