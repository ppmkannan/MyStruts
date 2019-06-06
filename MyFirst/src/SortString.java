
import java.util.Arrays;
import java.util.Collections; 

public class SortString 
{ 
    public static void main(String[] args) 
    { 
        
        String [] arr = {"Kannan", "babu"}; 
  
        Arrays.parallelSort(arr); 
  
        for(int i = 0;i<arr.length;i++)
        {
          System.out.println(arr[i]+"---");
        }
    } 
   
} 
