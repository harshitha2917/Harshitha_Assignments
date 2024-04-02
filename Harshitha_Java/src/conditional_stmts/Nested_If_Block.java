package conditional_stmts;
//Assignment-11
public class Nested_If_Block {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		if (c > b)// true
		{
			if (a > b)// false
			{
				System.out.println("1");
			}
			else// true
			{
				System.out.println("2");
			}
		} 
		else// this will not execute
		{
			System.out.println("3");
		}

	}

}