package string_functions;

public class String_Function1 {

	public static void main(String[] args) {
		//length of a string
		String name="Harshitha B A";
		
		int n1=name.length();
		System.out.println(n1);
	    //toUpperase	
		String n2=name.toUpperCase();
		System.out.println(n2);
		//toLowerCase
		String n3=name.toLowerCase();
		System.out.println(n3);
		//charAt
		char n4=name.charAt(1);
		System.out.println(n4);
		//trim
		String name2="  Manish Kumar  ";
		String n5=name2.trim();
		System.out.println(n5);
		
		//Concatenation
		String name3="Ram";
		String surname="Tiwari";
		String Space=" ";
		
		String fullname=name3.concat(Space).concat(surname);
		System.out.println(fullname);
		}
}