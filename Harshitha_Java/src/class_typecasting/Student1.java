package class_typecasting;
//Upcasting-2
class Teacher1 {
	void add() {
		System.out.println("Addition");

	}

}

class Mentor1 extends Teacher1 {
	void sub() {
		System.out.println("Subtraction");
	}
}

public class Student1 extends Mentor1 {
	void mul() {
		System.out.println("Multiplcation");

	}

	public static void main(String[] args) {
		Mentor1 m1 = new Student1();//Upcasting
		m1.sub();
		m1.add();
		
		Student1 s1=(Student1)m1;//Downcasting
		s1.add();
		s1.mul();
		s1.sub();
	}

}
