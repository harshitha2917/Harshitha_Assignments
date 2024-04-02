package arrays;
import java.util.Arrays;
import java.util.Scanner;

//WAP an array of length 4 and find out if 34 is present in the array is not
public class Arrays_6 {

	public static void main(String[] args) {
		int num[] = new int[4];
		num[0] = 121;
		num[1] = 21;
		num[2] = 34;
		num[3] = 22;
		int no_to_check = 34;

		for (int i = 0; i <= 2; i++) {
			if (no_to_check == num[i]) {

				System.out.println("hey i found the number");
			}
			// else {
			// System.out.println("the given number is not found");
			// }

		}
	}

}