package conditional_stmts;
//Assignment-9 
//if the condition is true then, if block will executed 
//if the condition is false then, else block will execute
public class If_else_Block {

	public static void main(String[] args) {
		int age = 20;
		if (age > 18)// true
		{
			System.out.println("Person is eligible to vote");
		} 
		else 
		{
			System.out.println("Person is not eligible to vote");
		}

	}

}