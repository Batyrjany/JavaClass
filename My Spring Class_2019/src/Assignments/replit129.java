package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class replit129 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int size = scan.nextInt();
		
		int[] num = new int[size];
		
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		//System.out.println(Arrays.toString(num));
		//WRITE YOUR CODE HERE
    

		
		int[] rangeOf = null;

		for (int k = 0; k <num.length; k++) {
	
		if(num.length>=2) {
		
			rangeOf = Arrays.copyOfRange(num, 0, 2);
	
		}			
		if(num.length<2) {
		
			
			num[k]=num[0];
		
			rangeOf = Arrays.copyOfRange(num, 0, 1);	
		
		}
	
}	
		
	System.out.println(Arrays.toString(rangeOf));					
				
			
		
				
		}
	

}
