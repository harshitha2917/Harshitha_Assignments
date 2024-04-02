package inheritance;
//Assignment-34
//super calling statement with parameters using 3 constructors
class G3_Class{
	G3_Class(int a,double b){
		System.out.println("Grand Parent constuctor");
	}
}
class P3_Class extends G3_Class{
	P3_Class(String a){
		super(100,6.79);//explicit type
		System.out.println("Parent constuctor");
	}
}
public class C3_Class extends P3_Class {
	C3_Class(){
		super("MKT");//calling parent constructor explicit type
		System.out.println("Child constuctor");
	}
	

	public static void main(String[] args) {
				new C3_Class();
	}

}