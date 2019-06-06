package packtwo;

public class Split {
	public static void main(String args[]) 
    { 
        String str = "Zoho-Corporation-Zoho-Corporation-Zoho-Corporation"; 
        String[] splitStr = str.split("-",7); 
  
         
        
        for(int i=0;i<splitStr.length; i++) {
        	System.out.println(splitStr[i]);
    	}
    } 
}
