package variables;

public class Global_Ex1 {
	String a = "Manish";
	static String b = "Tiwari";
	static int a1;
	double a2;

	static void add() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		Global_Ex1 g1 = new Global_Ex1();
		System.out.println(a1);
		System.out.println(g1.a2);
	}
}