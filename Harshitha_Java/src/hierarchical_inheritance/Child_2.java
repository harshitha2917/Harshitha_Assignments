package hierarchical_inheritance;
//Assignment-33
//Hierarchical inheritance
public class Child_2 extends Parent{
	void Daughter() {
		System.out.println("Harshitha");
	}

	public static void main(String[] args) {
		System.out.println("My Daughter");
		
		Child_2 c2=new Child_2();
		c2.Daughter();
		c2.Father();
		Mother();
		
	}

}