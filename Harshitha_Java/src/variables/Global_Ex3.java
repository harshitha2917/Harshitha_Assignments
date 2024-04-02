package variables;

public class Global_Ex3 {
	static int age;
	static double salary;
	char gender='M';
	
	static void sub() {
		age=90;//utilize GV not necessary to use 'int'
		System.out.println(age);
	}

	public static void main(String[] args) {
		//sub();
		//calling static GV
		System.out.println(age);
		System.out.println(salary);
		
		//calling non-static Gv
		Global_Ex3 g3=new Global_Ex3();
		System.out.println(g3.gender);
		

	}

}
