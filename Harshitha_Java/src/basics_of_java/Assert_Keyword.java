package basics_of_java;
//Assignment-63
public class Assert_Keyword {

	public static void main(String[] args) 
	{
		String name="I am Student";
		System.out.println(name.length());
		
		assert name.length()>10:"Seems like the given length is lesser than 21";
		
		for(int i=0;i<name.length();i++) {
			
			System.out.println(name.concat(" of batch AB 39"));
		}

	}
}
