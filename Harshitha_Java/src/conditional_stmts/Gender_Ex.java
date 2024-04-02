package conditional_stmts;
//Assignment-16 wrong program
public class Gender_Ex {

	public static void main(String[] args) {
		int age = 20;
		String Gender1 = "Male";
		String Gender2 = "Female";

		if (Gender1 == "Male" || Gender2 == "Female") {
			if (age > 19) {
				System.out.println("Eligible to vote");
			} else {
				System.out.println("Not Eligible to vote");
			}
		} else {

			if (age > 18) {
				System.out.println("Eligible to vote");
			} else {
				System.out.println("Not Eligible to vote");
			}
		}
	}
}