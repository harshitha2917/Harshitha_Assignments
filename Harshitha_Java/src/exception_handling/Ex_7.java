package exception_handling;
//Assignment-59
import java.util.InputMismatchException;

public class Ex_7 {

	public static void main(String[] args) {
		try
		{
	       int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Exception Handling 1");
		}
		catch(InputMismatchException i1)
		{
			System.out.println("Exception Handling 2");
		}
		catch(NullPointerException n1)
		{
			System.out.println("Exception Handling 3");
		}
		catch(ClassCastException c1)
		{
			System.out.println("Exception Handling 4");
		}
		catch(ArrayIndexOutOfBoundsException a2)
		{
			System.out.println("Exception Handling 5");
		}
		catch(IllegalArgumentException c2)
		{
			System.out.println("Exception Handling 6");
			
		}
		finally
		{
			System.out.println("Exception Handled");
		}


	}

}
