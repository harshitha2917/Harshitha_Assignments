package arrays;
import java.util.Scanner;
//Assignment-53
//Swap the 2 number using third variable
public class Swap {

	public static void main(String[] args) {
		// p and q are to swap
		   int p, q, r;   
	       Scanner sc = new Scanner(System.in);  
	       
	       System.out.println("Enter the value of P and Q");  
	       p = sc.nextInt();  
	       q = sc.nextInt(); 
	       
	       System.out.println("Before swapping numbers: "+p +" "+ q);  
	       //swapping  
	       r = p;  
	       p = q;  
	       q = r;  
	       System.out.println("After swapping numbers: "+p +" "+ q);  
	       System.out.println( );  	

	}

}
