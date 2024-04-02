package conditional_stmts;
//Multiple if blocks as many as are true that only exceuted
public class If1_Block {

	public static void main(String[] args) {
		int a = 100;
		int b = 20;

		if (a > b)// true
		{
			System.out.println("1");
		}
		if (a < b)// false
		{
			System.out.println("2");
		}
		if (a >= b)// true
		{
			System.out.println("3");
		}
		if (a <= b)// false
		{
			System.out.println("4");
		}
		if (a == b)// false
		{
			System.out.println("5");
		}
		if (a != b)// true
		{
			System.out.println("6");
		}
	}
}