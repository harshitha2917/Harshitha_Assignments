package collection;
//Assignment-70
//Queue-> PriorityQueue
import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue(); 
		p1.add(1000); //1.Do not accept Indexing
		p1.add(100);//2.Duplicate
		p1.add(100);
		//p1.add(07.78); 
		//p1.add('H');//3.Do not accept Heterogenous values
		//p1.add("Harshitha");
		//p1.add(null); //4.Do not accept Null
		p1.add(567);
		p1.add(123);//5.Dynamic
		p1.add(123);
		//p1.add(98.8);
		//Collections.sort(p1);  //6.sorting is not done
		System.out.println("PriorityQueue p1 is "+p1);
		
		PriorityQueue p2=new PriorityQueue();
		p2.add("Tanisha");
		p2.add("Navisha");
		p2.add("Hamsa");
		p2.add("Mohan");
		p2.add("Hruday");
		p2.add("Sachin");
		//Collections.sort(p2);//6. Do not sort homogeneous values
		System.out.println("PriorityQueue p2 is "+p2);
	
	}

}
