package string_functions;
import java.util.Date;
//Assignment-42a
public class Past_Time {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());//epoch time
		
		Date d2=new Date(d1.getTime()-(1000*60*60*24*10));//BODMAS(millisecs*sec*min*hr*day)
		System.out.println(d2);//human understandable time
	

	}

}