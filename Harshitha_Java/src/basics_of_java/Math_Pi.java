package basics_of_java;
//Assignment-62
import java.util.Scanner;

public class Math_Pi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<10;i++) {
		double radius=Math.random()*100;
		
		double area=Math.PI*radius*radius;
		
		System.out.println("The area of the circle is: "+area);
		}
	}

}
