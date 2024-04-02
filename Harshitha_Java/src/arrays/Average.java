package arrays;

public class Average {

	public static void main(String[] args) {
		int array[]=new int[5];
		array[0]=56;
		array[1]=54;
		array[2]=17;
		array[3]=29;
		array[4]=92;
		
		double sum_of_no=0;
		
		for(int i=0;i<=4;i++)
		{
			sum_of_no=sum_of_no+array[i];
		}
		System.out.println("Sum of given numbers-> "+sum_of_no);
		
		double average=sum_of_no/array.length;
		System.out.println("Average of given numbers-> "+average);
		
		double reminder=sum_of_no%array.length;
		System.out.println("Reminder of given numbers-> "+reminder);
		
		/*double average=(array[0]+array[1]+array[2]+array[3]+array[4])/array.length;
		System.out.println(average);*/

	}

}
