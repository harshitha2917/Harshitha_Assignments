package hierarchical_inheritance;
//Assignment-33
//Hierarchical inheritance
public class Child_1 extends Parent  {
	void Son() {
		System.out.println("Mohan");
	}

	public static void main(String[] args) {
		System.out.println("My Son");
		Child_1 c1=new Child_1();
		c1.Son();
		c1.Father();
		Mother();


	}

}