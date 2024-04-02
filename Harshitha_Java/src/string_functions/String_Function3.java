package string_functions;

public class String_Function3 {

	public static void main(String[] args) {
		//contains
		String name="manish kumar";
		boolean answer=name.contains("kumar");
		System.out.println(answer);//true
		
		//matches
		String name1="orange";
		boolean answer1=name1.matches("o.....");
		System.out.println(answer1);//true
		
		boolean answer2=name1.matches("(.*)a");//false
		System.out.println(answer2);
		
		boolean answer3=name1.matches("o(.*)");//true
		System.out.println(answer3);
	}

}