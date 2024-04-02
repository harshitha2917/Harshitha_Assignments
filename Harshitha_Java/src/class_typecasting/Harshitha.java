package class_typecasting;
//Assignment-58
//inherting object class
class Object{
	void OG() {
		System.out.println("Original Gangstar");
	}
}
public class Harshitha extends Object{
	void name() {
		System.out.println("HARSHITHA");
		
	}

	public static void main(String[] args) {
		Object o1=new Harshitha();
		o1.OG();

	}

}
