package arrays;
import java.util.Arrays;

public class Arrays_1 {

	public static void main(String[] args) {
		int age[]=new int[3];
		age[0]=17;
		age[1]=90;
		age[2]=36;
		age[2]=89;//updating the value of any index in array
		//System.out.println(age);wrong method to print arrays
		
		//way to call arrays 1
		/*
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);*/
		
		//sorting array
		Arrays.sort(age);
		//way to call arrays 2
		for(int i=0;i<=2;i++) {
			System.out.println(age[i]);
		}
		//way to call arrays 3
		System.out.println(Arrays.toString(age));
		
		
	}

}