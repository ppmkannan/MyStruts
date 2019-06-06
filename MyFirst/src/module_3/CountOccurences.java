package module_3;


public class CountOccurences {

	public static void main(String[] args) {
		
		String str = "Zoho Corporation Zoho Corporation Zoho Corporation Zoho";
		String sub = "Zoho";
//		int x = str.indexOf("Zoho");
//		System.out.println(x);
		int count = 0;
		for(int i=0; (i=str.indexOf(sub,i))!= -1; i++) {
			count++;
			
		}
		System.out.println(count);
		
	}

}

