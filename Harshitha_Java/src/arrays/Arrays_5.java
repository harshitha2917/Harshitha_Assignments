package arrays;
import java.util.Arrays;
import java.util.Scanner;
//Assignment-44 Array of length 3 of int datatype & add its value at the run time
public class Arrays_5 {

	public static void main(String[] args) {
		int rollno[]=new int[3];
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<3;i++) {
		
		System.out.println("Enter the value of Array");
		rollno[i]=s1.nextInt();
		}
		
		Arrays.sort(rollno);
		System.out.println(Arrays.toString(rollno));
	}

}