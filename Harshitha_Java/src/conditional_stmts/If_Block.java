package conditional_stmts;

//Assignment-8
public class If_Block {

	public static void main(String[] args) {
		// Example 1
		int a = 100;
		int b = 200;
		if (b > a) // true
		{
			int sum = a + b;
			System.out.println("case1 "+sum);
		}

		
		  //Example2 
			int a1 = 100;
			int b1 = 200;
			if (a1 > b1)// false
			{
				System.out.println("MKT");
			}
			System.out.println("Optional"); // because it is out of the if block statement
		

		// Example 3
		
		int a2 = 100;
		int b2 = 200;
		System.out.println("Shiva");
		if (a2 > b2)//false 
		{
			System.out.println("MKT");
		}
		System.out.println("Optional");

	}
}