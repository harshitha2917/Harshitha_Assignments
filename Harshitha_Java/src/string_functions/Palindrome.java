package string_functions;
//Assignment-41
public class Palindrome {

	public static void main(String[] args) {
		String input="amma";
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			char answer=input.charAt(i);
			output=output+answer;
		}
		System.out.println(output);//vertical
		//System.out.print(output);//horizontal
		
		boolean a1=input.equals(output);
		System.out.println(a1);
		
		if(a1==true) {
			System.out.println("The input is palindrome");
		}
		else {
			System.out.println("The input is not palindrome");
		}
	}

	}