package inheritance;
//Assignment-65
public class This_Calling_Statement {
	This_Calling_Statement(){
		this(100);
		System.out.println("Cons 1");
	}
	This_Calling_Statement(int a){
		this(17.29,13);
		System.out.println("Cons 2");
		
	}
	This_Calling_Statement(double b,int a){
		this("Harshitha");
		System.out.println("Cons 3");
		
	}
	This_Calling_Statement(String s){
		System.out.println("Cons 4");

	}
	public static void main(String[] args) {
		This_Calling_Statement t1=new This_Calling_Statement();
		
		
	}

}
