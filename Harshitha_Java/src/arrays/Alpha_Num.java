package arrays;
//Assignment-47
public class Alpha_Num {

	public static void main(String[] args) {
		String name = "mango123";
		char c1[] = name.toCharArray();
		
		// iteration
		for (int i = 0; i < name.length(); i++) 
		{
			boolean answer = Character.isAlphabetic(c1[i]);
			
			if (answer == true) 
			{
				System.out.println("Index position " + i + " is Alphabet");
			}
			else
			{
			System.out.println("Index position " + i + " is Numeric");
		}
	}
 }
}
