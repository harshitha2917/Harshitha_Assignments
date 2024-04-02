package class_typecasting;
//Assignment-61
//Upcasting-4
class Teacher3 {
	void add() {
		System.out.println("Addition");
	}
}

class Mentor3 extends Teacher3 {
	void sub() {
		System.out.println("Subtraction");
	}
}

class Exp_Student extends Mentor3 {
	void div() {
		System.out.println("Division");
	}
}

public class Student3 extends Exp_Student {
	void mul() {
		System.out.println("Multiplcation");
	}

	public static void main(String[] args) {
		Exp_Student e1=new Student3();//upcasting
		e1.div();
		e1.add();
		e1.sub();
		
		Mentor3 m3=new Exp_Student();//upcasting
		m3.add();
		m3.sub();
		
		Exp_Student e2=(Exp_Student)e1;//Downcasting
		e1.add();
		e1.div();
		e1.sub();
		}
}