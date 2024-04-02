package hybrid_inheritance;
//Hybrid Inheritance
class One {
	void G_Parents() {
		System.out.println("Grand Parents");
	}
}

class Two extends One {
	void Parents() {
		System.out.println("Parents are inheriting the property from their Parents");
	}

}
class Three extends Two {
	void Child1() {
		System.out.println("Child 1 is inheriting the property from Parents");
	}

}
public class Four extends One{
	void Child2() {
		System.out.println("Child 2 is inheriting the property from G_Parents");
	}

	public static void main(String[] args) {
System.out.println("Family Tree");
		
		Four f1=new Four();
		f1.Child2();
		f1.G_Parents();
		
		
		Three t1=new Three();
		t1.Child1();
		t1.Parents();
		t1.G_Parents();		


	}

}