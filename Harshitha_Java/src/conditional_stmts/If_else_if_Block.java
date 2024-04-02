package conditional_stmts;
//Assignment-10 only first true statement will execute
public class If_else_if_Block {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		if (a > b)// false
		{
			System.out.println("1");
		}
		else if (a != b)// true
		{
			System.out.println("2");
		} 
		else if (a <= b)// true
		{
			System.out.println("4");
		} 
		else 
		{
			System.out.println("3");
		}
	}

}