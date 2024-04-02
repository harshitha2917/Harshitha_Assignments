package arrays;
//Assignment-48
public class Mango {

	public static void main(String[] args) {
		String name="mango";
		char c1[] = name.toCharArray();
		
		int count_of_alpha=0;
		int count_of_numeric=0;
		
		// iteration
		for (int i = 0; i <= name.length() - 1; i++) {
			boolean answer = Character.isAlphabetic(c1[i]);

			if (answer == true)
			{
				count_of_alpha++;
			}
			else 
			{
				count_of_numeric++;
			}
		}
		System.out.println("Count of alphabets in the given string-> "+count_of_alpha);
		System.out.println("Count of numbers in the given string-> "+count_of_numeric);
	}

}
