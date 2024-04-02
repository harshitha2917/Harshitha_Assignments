package logical_operators;
//Assignment-14b
public class AND_NOT_Operator {

	public static void main(String[] args) {
		int age = 19;
		int salary = 10000;

		if (!(age > 20 && salary > 17000)) // c1=false and c2=true-->false != true
		{
			System.out.println("Be Ready");
		} else {
			System.out.println("Not Ready");
		}
	}
}