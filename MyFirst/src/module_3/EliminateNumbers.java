package module_3;

import java.util.Scanner;

public class EliminateNumbers {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		StringBuilder builder=new StringBuilder("");
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i))) {
				builder.append(str.charAt(i));
			}
		}
		System.out.println(builder.toString());
	}
	
}
