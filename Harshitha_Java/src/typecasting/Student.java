package typecasting;

class Teacher {
	void Room_1() {
		System.out.println("Class room 1");
	}

}

class Mentor extends Teacher {
	void Room_2() {
		System.out.println("Class room 2");

	}

}

public class Student extends Mentor {
	void Room_3() {
		System.out.println("Class room 3");

	}

	public static void main(String[] args) {
		Mentor m1=new Student();
		m1.Room_2();

	}

}