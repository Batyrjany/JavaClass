package day14;

import java.util.Scanner;

public class MoreStringMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// subString
		            // 01234
		//String name = "Batyr";
		
		// aty (in this case beginningIndex will be 
		//shown and endingIndex will show the character 
		// before ending index's character, so if ending
		//index is for it will show the char of index 3
		
		
		String name = "Batyr";
		
		System.out.println(name.substring(1, 4));
		
		
		System.out.println(name.charAt(4));
		
		
		System.out.println(name.substring(0,2));
		
		
		
		int count = name.length();
		
		System.out.println(name.substring(count-1, count));
		
		System.out.println(name.substring(count-2, count));
		
	

		System.out.println(name.substring(count-3, count-1));
		
		
		
		int midPoint = count/2;
		System.out.println(midPoint);
		System.out.println(name.substring(midPoint,count ));
		
//	    System.out.println(name.charAt(name.length() - 1));
//
//		System.out.println(name.charAt(midPoint));
		scan.close();

	}

}
