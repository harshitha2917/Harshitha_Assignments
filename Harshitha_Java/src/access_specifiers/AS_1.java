package access_specifiers;
//what happens within the class?
public class AS_1 {
	public static void add() {
		
	}
	protected static void sub() {
		
	}
	private void mul() {
		
	}
	void div() {
		
	}

	public static void main(String[] args) {
		add();
		sub();
		AS_1 a1=new AS_1();
		a1.mul();
		a1.div();

	}

}
