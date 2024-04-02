package collection;
//Assignment-69
import java.util.Collections;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();//storing heterogeneous values
		l1.add(1000); //1.Do not accept Indexing
		l1.add(100);//2.Duplicate
		l1.add(100);
		l1.add('H');//3.Heterogenous values
		l1.add("Harshitha");
		l1.add(null); //4.Null
		l1.add(07.78); 
		l1.add(98.8);//5.Dynamic
		//Collections.sort(l1); //ClassCastException 6.Cannot Sort
		System.out.println("LinkedList l1 is "+l1);
		
		LinkedList l2=new LinkedList(); 
		l2.add(123);
		l2.add(679);
		l2.add(987);
		l2.add(234);
		l2.add(7);
		l2.add(789);
		Collections.sort(l2); //6.sort only homogeneous values
		System.out.println("LinkedList l2 is "+l2);
	}
}