package Java;

import java.util.Scanner;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class java_DateTime {
	 public static String getDay(String day, String month, String year) {
    	String d1 = "a";
    	Calendar cal1 = new GregorianCalendar();
    	cal1.set(cal1.YEAR,Integer.parseInt(year));
    	cal1.set(cal1.MONTH,Integer.parseInt(month)-1);
    	cal1.set(cal1.DATE,Integer.parseInt(day));
    	//cal1.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		//String d = cal1.get(Calendar.DAY_OF_WEEK);
//		if(d == 1){
//			d1 = "SUNDAY";
//		}
//		if(d ==2){
//				d1 = "TUESDAY";
//			}
//		if(d ==3){
//			d1 = "WEDNESDAY";
//		}
//		if(d ==3){
//			d1 = "THURSDAY";
//		}
//		if(d ==4){
//			d1 = "FRIDAY";
//		}else{
//			d1 = "SATURDAY";
//		}
//		System.out.println(d);
		//return d1;   
    	DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
    	String weekdays[] = dfs.getWeekdays();
    	return d1 = (weekdays[cal1.get(Calendar.DAY_OF_WEEK)].toUpperCase());
    	
    }


public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String month = in.next();
    String day = in.next();
    String year = in.next();
    
    System.out.println(getDay(day, month, year));
}
}