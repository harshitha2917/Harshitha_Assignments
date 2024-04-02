package class_typecasting;
//Upcasting-3
class Teacher2{
	void add() {
		System.out.println("Addition");
		
	}
	
}
class Mentor2 extends Teacher2{
	void sub() {
		System.out.println("Subtraction");
	}
}
public class Student2 extends Mentor2{
	void mul() {
		System.out.println("Multiplcation");
		
	}

	public static void main(String[] args) {
		Teacher2 t2=new Student2();
		t2.add();
		
		Student2 s2 =(Student2)t2;
		s2.add();//Downcasting
		s2.mul();
		s2.sub();
	}

}
