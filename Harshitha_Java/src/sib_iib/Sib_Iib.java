package sib_iib;
public class Sib_Iib {
	static {
		System.out.println("SIB");
	}

	Sib_Iib() {
		System.out.println("Constructor");
	}

	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		new Sib_Iib();
	}
}