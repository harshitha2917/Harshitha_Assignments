package collection;
//Assignment-67
//List-> a)ArrayList b)Vector c)LinkedList
import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();// storing heterogeneous values
		a1.add(100);//1.Indexing
		a1.add(100);//2.Duplicate 
		a1.add("Harshitha");//3.Heterogeneous values
		a1.add(false);
		a1.add('M');
		a1.add(null);//4.Null
		a1.add(987);//5.Dynamic
		a1.add(211);
		a1.add(3.32);
		System.out.println("ArrayList a1 is " + a1);

		ArrayList a2 = new ArrayList();// storing homogeneouss values
		a2.add(100);//6.Sorting only  Homogeneous values
		a2.add(987);
		a2.add(211);
		a2.add(56);
		a2.add(78);
		a2.add(332);
		Collections.sort(a2);
		System.out.println("ArrayList a2 is " + a2);

	}

}
