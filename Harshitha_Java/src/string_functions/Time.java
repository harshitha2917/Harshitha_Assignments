package string_functions;
import java.util.Date;
//Assignment-42
public class Time {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());//epoch time
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);//human understandable time

	}

}