package encapsulation;
class AmazonLogin{
	private int age=10;
	private String un="studentinfo@gmail.com";
	private String pwd="Harshitha1@#";
	private int otp=32123;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}

}

public class Encapsulation_1 {

	public static void main(String[] args) {
		AmazonLogin a1=new AmazonLogin();
		
		a1.setAge(25);
		System.out.println(a1.getAge());
		
		a1.setUn("Harshitha");
		System.out.println(a1.getUn());
		
		a1.setPwd("hrs12345");
		System.out.println(a1.getPwd());
		
		a1.setOtp(1729);
		System.out.println(a1.getOtp());
		

	}

}
