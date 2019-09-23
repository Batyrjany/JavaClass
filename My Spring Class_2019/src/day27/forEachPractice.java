package day27;

import java.util.Scanner;

public class forEachPractice {

	public static void main(String[] args) {


		Scanner scan =new Scanner (System.in);
		
		
		System.out.println("Enter a word : ");
		String word = scan.nextLine();

	    char[] characs = word.toCharArray();
	
	    for (char yes : characs) {
	      System.out.print(yes + "-");
	    }
	    System.out.println();
	   
 
	    String[] splitted = word.split(""); 
	    for( String each :splitted ) {
	      System.out.print(each + "-");
	    }
		
		
		
		
		
		System.out.println();
		
		
		System.out.println("Enter a sentence: ");
		
		String sentence = scan.nextLine();
		
		String [] words = sentence.split(" ");
		
		for(String eachWord:words) {
			
			System.out.print(eachWord+"-");
			
		}
		
		
		
	
		
		
		
		
	}

}
