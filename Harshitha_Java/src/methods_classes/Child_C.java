package methods_classes;
//Assignment-37
abstract class Parent_C//abstract class
{
	abstract void add();//abstract method
	abstract void sub();//abstract method
	
	void mul()//concrete method inside abstract class
	{
		System.out.println("It is a logic i am exposing");
	}
	static void mod()//concrete method inside abstract class
	{
		System.out.println("It is a logic i am exposing");
	}
}

public class Child_C extends Parent_C //concrete class 
{
	void add()//concrete method 1
	{
		System.out.println("Real Logic");
	}

	public static void main(String[] args) //concrete method 2
	{
		Child_C c1=new Child_C();
		c1.add();
		c1.sub();
		c1.mul();
		mod();
	}
	@Override
	void sub() {
		System.out.println("Internal logic for subtraction");

	}
}