
package day19;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String str=scan.nextLine();
		
		int count = str.length();
	
		while (count>0) {
			count--;
			System.out.print(str.charAt(count)+" ");
			
			
			
			
		}
		
    	
		
	}

}
