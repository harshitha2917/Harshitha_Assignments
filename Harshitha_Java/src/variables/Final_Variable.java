package variables;
//Assignment-22a
//Final variable
public class Final_Variable {
	final static double pi = 3.14;//global and final var

	public static void main(String[] args) {
		int r = 30;
		double Area_of_circle = pi * r * r;
		double Cirumference_of_circle = 2 * pi * r;
		System.out.println("Area_of_circle: "+Area_of_circle);
		System.out.println("Cirumference_of_circle: "+Cirumference_of_circle);
	}
}