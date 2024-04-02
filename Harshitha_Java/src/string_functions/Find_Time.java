package string_functions;

import java.util.Date;

public class Find_Time {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());//epoch time
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);//human understandable time
		
		String a1=d2.toString();
		String month=a1.substring(4, 7);
		System.out.println(month);//feb
		
		String date=a1.substring(8, 10);
		System.out.println(date);//25
		
		
		System.out.println(a1.length());//28
		String year=a1.substring(24, 28);
		System.out.println(year);
		
		//date format->DD MM YYYY
		System.out.println(date.concat(month).concat(year));
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		
		//date format->DD-MM-YYYY
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));

		//date format->DD/MM/YYYY
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));

		

	}

}