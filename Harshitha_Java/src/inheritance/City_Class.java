package inheritance;
//Single-inheritance example
public class City_Class extends State_Class {
	void Bengaluru() {
		System.out.println("Bengaluru");
	}

	void Mysore() {
		System.out.println("Mysore");
	}

	public static void main(String[] args) {
		Karnataka();

		City_Class c1 = new City_Class();
		c1.Bengaluru();
		c1.Mysore();
	}

}