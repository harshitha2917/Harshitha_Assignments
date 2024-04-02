package typecasting;
//Assignment-56
public class Widening {

	public static void main(String[] args) {
		//widening->a) Implicit way b) Explicit way
		//a) Implicit way syntax
		double wt=52;
		System.out.println(wt);
		//-----------------------------------------------------
		//b) Explicit way syntax
		double weight=(double)90;
		System.out.println(weight);
		//------------------------------------------------------
		//converting byte into int
		byte a1=90;
		//converting
		int a2=a1;
		System.out.println(a2);
		//-------------------------------------------------------
		//converting byte into long
		byte b1=127;
		System.out.println(b1);
		long l1=(long)b1;
		System.out.println(l1);
		
		
	

	}

}
