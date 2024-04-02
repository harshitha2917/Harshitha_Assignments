 package inheritance;
//Assignment-36
//this keyword
public class This_Keyword {
	int age;// 0
	String name;// null
	double salary;// 0.0

	void add(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		This_Keyword t1 = new This_Keyword();
		t1.add(25, "Ram", 17.29);

		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);

	}
}