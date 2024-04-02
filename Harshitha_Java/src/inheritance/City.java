package inheritance;
//Assignment-32
//Multi-level Inheritance
//Super most class
class Country {
	void My_Country() {
		System.out.println("India");
	}
}

//Super class
class State extends Country {
	void My_State() {
		System.out.println("Karnataka");
	}

}

//Child class
class City extends State {
	void My_City() {
		System.out.println("Bengaluru");
	}

	public static void main(String[] args) {
		City c1 = new City();
		c1.My_City();
		c1.My_State();
		c1.My_Country();

	}

}