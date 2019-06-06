package collections;

import java.util.Calendar;
import java.util.Date;

public class CalendarPro {
	public static void main(String args[]) 
    { 
        Calendar c = Calendar.getInstance(); 
        System.out.println("The Current Date is:" + c.getTime()); 
        System.out.println("YEAR: " + c.get(Calendar.YEAR));
        System.out.println("DATE: " + c.get(Calendar.DATE));
        System.out.println("MINUTE: " + c.get(Calendar.MINUTE));
        System.out.println("SECOND: " + c.get(Calendar.SECOND));
        System.out.println("HOUROF DAY: " + c.get(Calendar.HOUR_OF_DAY) + "---HOUR: " + c.get(Calendar.HOUR));
        System.out.println("Day of week: " + c.get((Calendar.DAY_OF_WEEK)));
        System.out.println("Day of week: " + c.get((Calendar.WEEK_OF_YEAR)));
        System.out.println("WEEK OF MONTH: " + c.get((Calendar.WEEK_OF_MONTH)));
        
        c.add(Calendar.DATE, -15); 
        System.out.println("15 days ago: " + c.getTime()); 
        c.add(Calendar.MONTH, 4); 
        System.out.println("4 months later: " + c.getTime()); 
        c.add(Calendar.YEAR, 2); 
        System.out.println("2 years later: " + c.getTime()); 
        
        int maximum = c.getMaximum(Calendar.WEEK_OF_YEAR);  
        System.out.println("Maximum number of weeks in year: " + maximum);
        
        
        //Set time
        Calendar future = Calendar.getInstance(); 
        future.set(Calendar.YEAR, 2050);
        
     // After
        Date time = future.getTime();
        
        if (future.after(c)) {
           System.out.println("Date " + time + " is after current date.");
        }
    } 
}
