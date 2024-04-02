package scanner;
import java.util.Scanner;
//Assignment-30
public class Shapes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("\t1. Circle");
		System.out.println("\t2. Square");
		System.out.println("\t3. Rectangle");
		System.out.println("\t4. Triangle");
		System.out.println("\t5. Trapezium");

		int option = scan.nextInt();

		if (option == 1) {

			System.out.println("Enter the radius of a circle: ");
			int r = scan.nextInt();
			double pi = 3.14;

			double Area_of_circle = pi * r * r;
			System.out.println("Area_of_circle: " + Area_of_circle);

			double Cirumference_of_circle = 2 * pi * r;
			System.out.println("Cirumference_of_circle: " + Cirumference_of_circle);

		} else if (option == 2) {

			System.out.println("Enter the dimensions of a Square: ");
			int a = scan.nextInt();

			double Area_of_square = a * a;
			System.out.println("Area_of_Square: " + Area_of_square);
			double Circumference_of_square = 4 * a;
			System.out.println("Circumference_of_square: " + Circumference_of_square);

		} else if (option == 3) {

			System.out.println("Enter the dimensions of a Rectangle: ");
			int l = scan.nextInt();
			int w = scan.nextInt();

			double Area_of_rectangle = l * w;
			System.out.println("Area_of_rectangle: " + Area_of_rectangle);

			double Circumference_of_rectangle = 2 * (l + w);
			System.out.println("Circumference_of_rectangle: " + Circumference_of_rectangle);

		} else if (option == 4) {
			System.out.println("Enter the dimensions of a Triangle: ");

			int b = scan.nextInt();
			int h = scan.nextInt();
			double Area_of_triangle = (b * h) / 2;
			System.out.println("Area_of_triangle: " + Area_of_triangle);

			double p = scan.nextDouble();
			double q = scan.nextDouble();
			double r = scan.nextDouble();
			double Circumference_of_triangle = (p + q + r);
			System.out.println("Circumference_of_triangle: " + Circumference_of_triangle);
		} else if (option == 5) {
			System.out.println("Enter the dimensions of a Trapezium: ");
			double base_1 = scan.nextDouble();
			double base_2 = scan.nextDouble();
			double height = scan.nextDouble();

			double Area_of_trapezium = ((base_1 + base_2) * height) / 2;
			System.out.println("Area_of_trapezium: " + Area_of_trapezium);

			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			double Circumference_of_trapezium = (a + b + c + d);
			System.out.println("Circumference_of_trapezium: " + Circumference_of_trapezium);
			
		}
		else {
			System.out.println("Exit");
		}

	}

}
			