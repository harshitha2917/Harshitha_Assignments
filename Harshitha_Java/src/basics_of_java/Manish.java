package basics_of_java;

public class Manish 
//calling static method inside main method
{
			static void myname() {
			System.out.println("My name is Harshitha");
		}

		public static void main(String[] args) {
			myname();
			myname();// calling multiple times

			System.out.println("Starting the main method");
			System.out.println("Ending the main method");
		}
}
		