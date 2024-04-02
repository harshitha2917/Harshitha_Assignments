package arrays;
 
public class Numeric {

	public static void main(String[] args) {
		String name = "mango123";
		char c1[] = name.toCharArray();

		// iteration
		for (int i = 0; i <= name.length() - 1; i++) {
			boolean answer = Character.isDigit(c1[i]);

			if (answer == false) {
				System.out.println("Index position " + i + " is Alphabet");
			} else {
				System.out.println("Index position " + i + " is Numeric");
			}
		}
	}

}
