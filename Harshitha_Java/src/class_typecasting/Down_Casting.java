package class_typecasting;
class Parent_Class1{
	void add() {
		System.out.println("Add");
		
	}
}
public class Down_Casting extends Parent_Class1{
	void sub() {
		System.out.println("Sub");
		
	}

	public static void main(String[] args) {
		Parent_Class1 p1=new Down_Casting();//upcasting
		p1.add();
		
		Down_Casting d1=(Down_Casting)p1;//Only explicit way this is downcasting
		d1.add();//we can access any method
		d1.sub();
	}

}
