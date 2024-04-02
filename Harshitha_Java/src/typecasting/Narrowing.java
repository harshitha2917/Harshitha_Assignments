package typecasting;
//Assignment-57
public class Narrowing {

	public static void main(String[] args) {
		//Converting double into int datatype
		//Narrowing only in Explicit way
		double weight=86.52;
		
		int wt=(int)86.52;
		System.out.println(wt);
		//---------------------------
		//Converting pi into int datatype
		double pi=3.14;
		int newpi=(int)pi;
		System.out.println(newpi);
		//------------------------------
		//converting long a1=334455667788 into byte datatype
		long a1=334455667788L;
		byte b1=(byte)a1;
		System.out.println(b1);
		

	}

}
