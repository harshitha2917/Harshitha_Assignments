package arrays;

import java.util.Scanner;

//Assignment-54
//swap numbers without extra variable
public class Swap1 {

	public static void main(String[] args) {
		  System.out.println("Enter the value of X and Y");  
	        Scanner sc = new Scanner(System.in);  
	         
	        int x = sc.nextInt();  
	        int y = sc.nextInt();  
	        System.out.println("before swapping numbers: "+x +" "+ y);  
	       //Swapping  
	        x = x + y;   
	        y = x - y;   
	        x = x - y;   
	        System.out.println("After swapping numbers: "+x +"  " + y);   
	}

}
