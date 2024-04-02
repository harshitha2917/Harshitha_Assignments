package loop;

//Assignment-25
public class Odd_Even {

	public static void main(String[] args) {
		int number = 100;
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " even");
			} 
			else if (i % 2 != 0) {
				System.out.println(i + " odd");
			}

		}

	}
}