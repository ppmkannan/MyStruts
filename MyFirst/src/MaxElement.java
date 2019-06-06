import java.util.Scanner;

public class MaxElement {
	private static Scanner read;

	public static void main(String args[]){  
			read = new Scanner(System.in);
			System.out.println("Enter size and elements: ");
			int size = read.nextInt();
			
	     	int arr[] = new int[size];
	     	int max=-99999;
	     	for(int i=0;i<size;i++) {
	     		arr[i] = read.nextInt();
	     	}
	     	for(int i=0;i<size;i++) {
	     		if(arr[i] > max) {
	     			max = arr[i];
	     		}
	     	}
	     	System.out.println("Maximum Element:" + max);
	    } 
}
