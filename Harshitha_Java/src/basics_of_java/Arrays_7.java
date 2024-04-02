package basics_of_java;
import java.util.Scanner;
//Assignment-45
//Find out the length of an array using scanner class
public class Arrays_7 {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner r=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) 
		{
			a[i]=r.nextInt();
		}
		System.out.println("Array elements: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}
		System.out.println("Array length: "+a.length);

	}

}