package arrays;

import java.util.Arrays;
//Assignment-50
public class Copy_Array {

	public static void main(String[] args) {
		int array1[]=new int[4];
		array1[0]=42;
		array1[1]=65;
		array1[2]=90;
		array1[2]=67;
		array1[3]=17;
		
		int array2[]=new int[array1.length];
		
		for(int i=0;i<4;i++) {
		array2[i]=array1[i];
	}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		/*or
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		System.out.println(array2[3]);*/
	}
}
