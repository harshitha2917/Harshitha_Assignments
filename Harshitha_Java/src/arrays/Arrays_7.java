package arrays;

import java.util.Arrays;

//toCharArray
public class Arrays_7 {
	public static void main(String[] args) {
		String name="Harshitha";
		char a1[]=name.toCharArray();
		System.out.println(Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		
	}

}
