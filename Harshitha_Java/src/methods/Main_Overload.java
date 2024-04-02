package methods;
//Assignment-74
public class Main_Overload {

	public static void main(String[] args) {
		System.out.println("Main Method Overloading");
		main();
		main(29, 17);

	}

	public static void main() {
		System.out.println("Main Method Overloading 1");

	}

	public static void main(int a, int b) {
		System.out.println("Main Method Overloading 2");

	}

}
