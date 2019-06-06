package collections;

import java.util.Hashtable;

public class HashTablePro {
	public static void main(String args[]){  
		
		Hashtable<String, String>ht = new Hashtable<String, String>();
		ht.put("Comapany","zoho");
		ht.put("Place","Potheri");
		ht.put("Division","ManageEngine");
		System.out.println(ht);
		
		//Remove
		ht. remove("Division");
		System.out.println(ht);
		
		//GetOrDefault
		ht.getOrDefault("Address", "Chennai");
		System.out.println(ht + ht.getOrDefault("Address", "Chennai"));
		
		//Returns the current value, as the specified pair already exist  
	     ht.putIfAbsent("Address","Potheri");  
	     System.out.println("Updated HashTable: "+ht);  
	     
	     //contains
	     System.out.println(ht.containsKey("zoho"));
	     
	     
	     
	     
	     
}
}
