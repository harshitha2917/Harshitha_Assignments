package arrays;
//Assignment-51
public class Space {

	public static void main(String[] args) {
		String name="ram tiwari";
		char c1[]=name.toCharArray();
		
		//iteration or loop
		for(int i=0;i<=name.length()-1;i++) {
		boolean answer=Character.isSpaceChar(c1[i]);
		
		if(answer==true){
		
					System.out.println("There is a space in the given string"+" the index of space is "+i);
		}
		}
		}

	}

