package collection;
//Assignment-73
import java.util.LinkedHashSet;

public class LinkedHash_Set {

	public static void main(String[] args) {

		LinkedHashSet lh1=new LinkedHashSet(); //indexing
		lh1.add(1000);//1.Indexing
		lh1.add(1000);//2. Do not accept Duplicate 
		lh1.add("Harshitha");//3.Heterogeneous values
		lh1.add(false);
		lh1.add('M');
		lh1.add(null);//4.Null
		lh1.add(987654321);//5.Dynamic
		lh1.add(211);
		lh1.add(3.32);
		//Collections.sort(lh1);//6.No sorting
		System.out.println("LinkedHashSet lh1 is"+lh1);
		
		LinkedHashSet lh2=new LinkedHashSet();
		lh2.add(200); 
		lh2.add(23);
		lh2.add(45);
		lh2.add(405);
		lh2.add(5);
		//Collections.sort(lh2); 
		System.out.println("LinkedHashSet lh2 is"+lh2);
	}

}
