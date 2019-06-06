package packtwo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePro {  
  
    public static void main(String[] args) {  
    	Date date = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat(" yyyy.MM.dd ");  
        String strDate= formatter.format(date);  
        System.out.println(strDate);
        
        
        
        
//        Date d=new Date();  
//        SimpleDateFormat sformat = new SimpleDateFormat("yyyy/MM/dd");
//        String s = sformat.format(d);
//        System.out.println("date  : " + s);  
        
        
        } 
    
    
} 