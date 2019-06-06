package packthree;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderClass {
	public static void main(String[] args) {  
        try {  
            Reader reader = new FileReader("output.txt");  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
            reader.close();  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
//		try {  
//            Writer w = new FileWriter("output.txt");  
//            String content = "I love my country";  
//            w.write(content);  
//            w.close();  
//            System.out.println("Done");  
//        } catch (IOException e) {  
//            e.printStackTrace();  
//        }  
}
}
