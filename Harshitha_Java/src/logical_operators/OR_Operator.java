package logical_operators;

//Assignment-12
public class OR_Operator {

	public static void main(String[] args) {
		int age = 19;
		char gender = 'M';
		if (age > 20 || gender == 'M') // age=false and gender=true-->true
		{
			System.out.println("I am eligible to vote");
		} else {
			System.out.println("I am not eligible to vote");
		}
	}
}