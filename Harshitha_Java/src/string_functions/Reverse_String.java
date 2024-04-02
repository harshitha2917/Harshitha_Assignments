package string_functions;

public class Reverse_String {

	public static void main(String[] args) {
		String input="manish";
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			char answer=input.charAt(i);
			output=output+answer;
		}
		System.out.println(output);//vertical
		//System.out.print(output);//horizontal
		
		boolean a1=input.equals(output);
		System.out.println(a1);
	}

}