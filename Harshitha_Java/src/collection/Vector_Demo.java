package collection;
//Assignment-68
import java.util.Collections;
import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		Vector v1 = new Vector(); 
		v1.add(100);//1.Indexing
		v1.add(100);//2.Duplicate 
		v1.add(250);
		v1.add('H');//3.Heteogenous values
		v1.add("Harshitha");
		v1.add(29.179);//4.Dynamic
		v1.add(null);//5.Null
		//Collections.sort(v1);//6.cannot sort heterogeneous values
		System.out.println("Vector v1 is " + v1);

		Vector v2 = new Vector();
		v2.add(19);
		v2.add(190);
		v2.add(19);
		v2.add(119);
		v2.add(319);
		v2.add(199);
		Collections.sort(v2); //can sort homogeneous values
		System.out.println("Vector v2 is " + v2);
	}
}