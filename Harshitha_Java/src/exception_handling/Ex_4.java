package exception_handling;
//Exception handling using Array
public class Ex_4 {

	public static void main(String[] args) {
		int age[] = new int[3];// loggedin into amazon application
		age[0] = 12;// search the product
		age[1] = 15;// added to wishlist
		age[2] = 90;// added to cart
		try {
			age[3] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
		}
		System.out.println("Manish is a Teacher");// trying to make payment

	}

}
