package variables;
//Assignment-23a
public class Local_Variable {
	static void add() {
		int a = 100;
		int a1 = 200;
		System.out.println(a + a1);
	}

	void subtract() {
		int a = 100;
		int a1 = 200;
		System.out.println(a - a1);
	}

	void subtract(int age, String name, char c) {
		System.out.println(age);
		System.out.println(name);
		System.out.println(c);
	}

	public static void main(String[] args) {
		add();
		Local_Variable l1 = new Local_Variable();
		l1.subtract();
		l1.subtract(20, "Shiva", 'A');
	}
}