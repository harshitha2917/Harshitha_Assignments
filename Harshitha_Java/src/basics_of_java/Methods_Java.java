package basics_of_java;
//Assignment-3
public class Methods_Java {
		static void myname() {
			System.out.println("My name is Harshitha");
		}

		public static void main(String[] args) {
			// we're calling static method inside main method
			myname();
			System.out.println("Starting the main method");
			System.out.println("Ending the main method");
		}
	}