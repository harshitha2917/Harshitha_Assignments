package inheritance;
//Super calling statement with parameters 
class Parent1{
	Parent1(int a)//with parameters
	//Constructor name should be same as class name, Constructor cannot be inherited in java
	{
		System.out.println("Parent Constructor");
	}
}

public class C1_Class extends Parent1{
	C1_Class()//with parameters
	//Constructor name should be same as class name
	{
		super(100);//calling parent constructor inside child constructor
		System.out.println("Child Constructor");
		
	}

	public static void main(String[] args) {
		new C1_Class();
	}

}