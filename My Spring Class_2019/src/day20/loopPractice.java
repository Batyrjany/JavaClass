package day20;

import java.util.Scanner;

public class loopPractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		String fUp = name.substring(0, 1).toUpperCase();
		String expected = fUp + name.substring(1);
		
	    System.out.println(expected);
	
	}

}
