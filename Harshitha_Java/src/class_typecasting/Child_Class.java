package class_typecasting;
//Upcasting-0
class Parent_Class{
	void add() {
		
	}
}
public class Child_Class extends Parent_Class{
	void sub() {
		
	}

	public static void main(String[] args) {
		Parent_Class p1=new Child_Class();//upcasting
		p1.add();
	}

}
