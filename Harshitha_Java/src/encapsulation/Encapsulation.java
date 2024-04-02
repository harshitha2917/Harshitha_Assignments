package encapsulation;
//Assignment-64
class Sensitive_Info {
	private String un = "customer@info.com";// this un is global variable

	public void setUn(String un)// update the local variable value of Un by creating the object of parent class
	{
		this.un = un;
	}

	public String getUn() {
		return un;

	}

	private int age = 18;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Sensitive_Info s1 = new Sensitive_Info();
		s1.setUn("stbymkt@gmail.com");
		System.out.println(s1.getUn());
		
		s1.setAge(45);
		System.out.println(s1.getAge());

	}

}
