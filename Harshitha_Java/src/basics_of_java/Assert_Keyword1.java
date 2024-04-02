package basics_of_java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assert_Keyword1 {

	public static void main(String[] args) {
		int ageofkids[]=new int[3];
		ageofkids[0]=12;
		ageofkids[1]=13;
		ageofkids[2]=15;
		
		int ageofparents[]=new int[3];
		ageofparents[0]=30;
		ageofparents[1]=40;
		ageofparents[2]=45;
		
		assert Array.getLength(ageofkids)>10;
		
		boolean answer=Arrays.equals(ageofkids, ageofparents);
		System.out.println(answer);

	}

}
