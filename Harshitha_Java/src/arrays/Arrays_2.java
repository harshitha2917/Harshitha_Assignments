package arrays;

import java.util.Arrays;

public class Arrays_2 {

	public static void main(String[] args) {
		String name[]=new String[5];
		name[0]="ram";
		name[1]="seetha";
		name[2]="laxman";
		name[3]="shiva";
		name[4]="anita";
		
		Arrays.sort(name);
		
		//way to call Arrays 1 
		for(int i=0;i<=4;i++)
		{
			System.out.println(name[i]);
		}
		//instead of writing for loop we can use this method to call arrrays
		System.out.println(Arrays.toString(name));

	}

}