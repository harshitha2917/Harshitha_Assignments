package basics_of_java;
//Assignment-15
//calling non-static method inside the main method
public class Non_Static_Method {
	void add() {
		int a = 100;
		int b = 200;
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		System.out.println("started");
		
		Non_Static_Method n1 = new Non_Static_Method();// creating object
		n1.add();// calling non-static

	}

}