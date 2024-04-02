package arrays;
import java.util.Arrays;
//Assignment-43a double array values
public class Arrays_3 {

	public static void main(String[] args) {
		double number[]=new double[3];
		number[0]=0.1;
		number[1]=0.4;
	    number[2]=0.3;
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
	}

}