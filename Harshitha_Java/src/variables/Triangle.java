package variables;
//Assignment-22d
public class Triangle {
	static double b = 10.0;
	static double h = 5.0;

	static void Circumference_of_triangle() {
		double a = 2.0;
		double b = 3.0;
		double c = 5.0;
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		double Area_of_triangle = (b * h) / 2;
		System.out.println("Area_of_triangle: "+Area_of_triangle);
		Circumference_of_triangle();
	}
}