package inheritance;
//Super calling statement without parameters 
class Parent{
	Parent()//without parameters
	//Constructor name should be same as class name, Constructor cannot be inherited in java
	{
		System.out.println("Parent Constructor");
	}
}
public class C_Class extends Parent{
	C_Class()//without parameters
	//Constructor name should be same as class name
	{
		super();
		System.out.println("Child Constructor");
		
	}

	public static void main(String[] args) {
		new C_Class();// calling child constructor using super Keyword(without mentioning its name which is automatic) 

	}

}