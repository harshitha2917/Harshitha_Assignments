package logical_operators;
//Assignment-13
public class AND_Operator {
	public static void main(String[] args) {

		int age = 19;
		int salary = 10000;
		if (age > 18 && salary == 20000)// c1=true and c2=false-->false
		{
			System.out.println("Eligible");
		} else {
			System.out.println("Not eligible");
		}
	}
}