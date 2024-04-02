package class_typecasting;
//Upcasting-1
class Teacher{
	void Upcast() {
		System.out.println("Upcasting");
		
	}
	
}
public class Student extends Teacher{
	void Upcast1() {
		System.out.println("Upcasting 1");
		
	}

	public static void main(String[] args)
	{
		Teacher p1=new Student();
		p1.Upcast();


	}

}
