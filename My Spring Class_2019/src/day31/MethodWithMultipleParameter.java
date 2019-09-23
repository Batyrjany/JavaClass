package day31;

import java.util.Scanner;

public class MethodWithMultipleParameter {

	public static void main(String[] args) {
		
        repeat("java",5);
        repeat("spartan",10);
        
        
        // will not work------
         //repeat();
        // repeat("abc");
        //repeat("abc",123,7632,true);
        
        
        Scanner  scan = new Scanner(System.in);
        
        System.out.println("Give me word to repeat");
        
        String str=scan.next();
        
          System.out.println("Give me number of time to repeat");
        
           int i =scan.nextInt();
        
        repeat(str,i);
	}

	
	public static void repeat(String word, int num) {
		
		
		for (int i = 1; i <= num; i++) {
		
			
			System.out.println(word+" ");
			
		}
		System.out.println();
	}
	
}
