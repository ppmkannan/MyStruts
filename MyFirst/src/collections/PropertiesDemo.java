package collections;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.*; 
class PropertiesDemo 
{ 
    public static void main(String arg[]) throws IOException 
    { 
        Properties gfg = new Properties(); 
//        Set URL; 
//        String str; 
//          
        gfg.setProperty("ide", "ide.geeksforgeeks.org"); 
        gfg.put("contribute", "contribute.geeksforgeeks.org"); 
        gfg.put("quiz", "quiz.geeksforgeeks.org"); 
//        System.out.println(gfg);
//        // checking what's in table 
//        URL = gfg.keySet(); 
//        Iterator itr = URL.iterator(); 
//          
//        while(itr.hasNext()) 
//        { 
//            str = (String)itr.next(); 
//            System.out.println("The URL for " + str +  
//                    " is " + gfg.getProperty(str)); 
//        } 
//          
//        System.out.println(); 
//          
//        // looking for URL that not in list 
//        str = gfg.getProperty("articl"); 
//        System.out.println("The URL for article is " + str); 
//        gfg.list(System.out); 
//        
//        System.out.println("--------");
//        //list using print writer
//        PrintWriter writer = new PrintWriter(System.out); 
//        gfg.list(writer); 
//        writer.flush();
        System.out.println("+++++++++\n++++++++++++");
        
        
//        //load------
        String s = "ide = ppm.babu.org"; 
//        
        FileOutputStream out = new FileOutputStream("my.properties"); 
        FileInputStream in = new FileInputStream("my.properties");   
//          
        // write the property in the output stream file 
        out.write(s.getBytes()); 
          
        // load from input stream 
        gfg.load(in); 
        gfg.store(System.out, "new babu");
        gfg.list(System.out); 
        
//        
        s = "ide = ide.ppm.org";
//        StringReader reader = new StringReader(s); 
//        
//        // loading from input stream 
//        gfg.load(reader); 
//          
//        gfg.list(System.out); 
//        
//        
//        
//      //stringpropertynames
//        Set set = gfg.stringPropertyNames();        
//        System.out.print(set); 
//        
//        
//        //from XML
        out = new FileOutputStream("properties.xml"); 
        in = new FileInputStream("properties.xml"); 
          
        // store the properties into specified xml 
        gfg.storeToXML(out, "I write it"); 
          
        // load the properties from specified xml 
        gfg.loadFromXML(in); 
          
        gfg.list(System.out); 

    } 
} 
