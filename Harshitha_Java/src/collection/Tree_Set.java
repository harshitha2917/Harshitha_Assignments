package collection;
import java.util.Collections;
//Assignment-71
//Set-> a)TreeSet b)HashSet c)LinkedHashSet
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet(); 
		t1.add(1000); //1.Do not accept Indexing
		t1.add(100);//2.Do not accept Duplicate
		t1.add(100);
		//t1.add(07.78); 
		//t1.add('H');//3.Do not accept Heterogenous values
		//t1.add("Harshitha");
		//t1.add(null); //4.Do not accept Null
		t1.add(567);
		t1.add(123);//5.Dynamic
		//Collections.sort(t1);  //6.sorting is done automatically
		System.out.println("TreeSet t1 is "+t1);
		
		
		TreeSet t2=new TreeSet();
		t2.add("running");
		t2.add("jumping");
		t2.add("walking");
		t2.add("sleeping");
		t2.add("Eating");
		System.out.println("TreeSet t2 is "+t2);

	}

}
