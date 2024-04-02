package string_functions;
public class String_Functions2
{
	public static void main(String[] args) {
		//ends with
		String name="ram";
		boolean answer=name.endsWith("m");
		System.out.println(answer);
		
		//replace
		String answer1=name.replace('r', 'R');
		System.out.println(answer1);
		
		//replace all
		String name1="orange fruit";
		String answer2=name1.replaceAll("fruit", "and banana");
		System.out.println(answer2);
		
		//remove all numeric numbers
		String name2="world no 1";
		String answer3=name2.replaceAll("[0-9]", "");
		System.out.println(answer3);
		
		//remove all alphabets
		String answer4=name2.replaceAll("[a-z]","");
		System.out.println(answer4);
		
		//remove all uppercase
		String name3="MANISH Kumar Tiwari";
		String answer5=name3.replaceAll("[A-Z]", "");
		System.out.println(answer5);
		
		//remove all lowercase
		String answer6=name3.replaceAll("[a-z]", "");
		System.out.println(answer6);
		//empty
		System.out.println(name3.isEmpty());//false
		//empty
		String name7="";
		System.out.println(name7.isEmpty());//true
		
		//equals
		System.out.println(name1.equals(name7));//false
		System.out.println("manish".equals("Manish"));//false
		
		
						

	}

}