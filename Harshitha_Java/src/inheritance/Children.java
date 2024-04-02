package inheritance;
//Multi-level inheritance example
public class Children extends Parents{
	void School() {
		System.out.println("Children are going to school");
	}

	public static void main(String[] args) {
	    System.out.println("I love My Family");
		//Another way to call non-static method
		new Children().School(); //classname.methodname
		new Children().Office();
		new Children().Home();
	}

}