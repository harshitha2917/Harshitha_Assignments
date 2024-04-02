package variables;
//Assignment-23b
public class Global_Variable {
	static int age;// Global variable
	static double salary = 90.87;
	char gender = 'M';// dec & ini of gender var with char

	static void subtract() {
		int age = 90;// local variable
		System.out.println(age);
	}

	public static void main(String[] args) {
		subtract();
		System.out.println(age);
		System.out.println(salary);
		//calling non static global var
		Global_Variable g1 = new Global_Variable();
		System.out.println(g1.gender);
	}
}