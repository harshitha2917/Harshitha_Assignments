package collection;
import java.util.Collections;
//Assignment-72
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet h1=new HashSet(); 
		h1.add(100);//1.Do not accept Indexing
		h1.add(100);//2.Do not accept Duplicate 
		h1.add("Harshitha");//3.Heterogeneous values
		h1.add(false);
		h1.add('M');
		h1.add(null);//4.Null
		h1.add(987);//5.Dynamic
		h1.add(211);
		h1.add(3.32);//6. No sorting
        System.out.println("HashSet h1 is"+h1);
		
		HashSet h2=new HashSet();
		h2.add(100);
		h2.add(10);
		h2.add(145);
		h2.add(3);
		//Collections.sort(h2); //6.Do not sort homogeneous values
		System.out.println("HashSet h2 is"+h2);	

	}

}
