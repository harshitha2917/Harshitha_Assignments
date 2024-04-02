package arrays;
//Assignment-49
public class Special_Char {

	public static void main(String[] args) {
		String name="sky is 441 @#!@$";
		char c1[]=name.toCharArray();
		int count_of_alpha=0;
		int count_of_numeric=0;
		int count_of_space=0;

		for(int i=0;i<=name.length()-1;i++) {
			boolean answer1=Character.isAlphabetic(c1[i]);
			boolean answer2=Character.isDigit(c1[i]);
			boolean answer3=Character.isSpaceChar(c1[i]);
			
			if(answer1==true) {
				count_of_alpha++;
			}
			if(answer2==true) {
				count_of_numeric++;
				}
			if(answer3==true) {
				count_of_space++;
				}
		}
		System.out.println("Count of alphabets in the given string-> "+count_of_alpha);
		System.out.println("Count of numbers in the given string-> "+count_of_numeric);
		System.out.println("Count of space in the given string-> "+count_of_space);
		
		int count_of_specialchar=name.length()-(count_of_alpha+count_of_numeric+count_of_space);
		System.out.println("Count of Special characters in the given string-> "+count_of_specialchar);
	}


	}