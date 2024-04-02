package logical_operators;

//Assignment-14a
public class OR_NOT_Operator {

	public static void main(String[] args) {
		int age = 19;
		int salary = 10000;

		if (!(age > 18 || salary > 7000)) // c1=true c2=true-->true != false
		{
			System.out.println("Be Ready");
		} else {
			System.out.println("Not Ready");
		}

	}

}