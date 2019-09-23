package Assignments;

import java.util.Scanner;

public class replit88 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = scan.next();
	    boolean b1 = true;

		
		for(int i = 0; i <= word.length()-3; i++) {
		      if(word.substring(i,i+3).equals("cat")) {
		        countOfCats++;
		      }else if(word.substring(i,i+3).equals("dog")) {
		        countOfDogs++;
		      }
		      if (countOfCats>=2){
		        b1 = false;
		      }
	       if(countOfDogs>=2){
	         b1 = false;
	       }
	       if(word.length()==3) {
		        b1 = false; 
	       }
	    }
	  
	       System.out.println(b1);
	  }
	}


