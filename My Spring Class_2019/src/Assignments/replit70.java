package Assignments;

import java.util.Scanner;

public class replit70 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
		    int l = word.length();
		   boolean b1 =word.startsWith("x");
		   boolean b2 = word.endsWith("x");
		   boolean b3 =word.startsWith("X");
		   boolean b4 = word.endsWith("X");
		   
		    if(b1 || b2 || b3 || b4){
		    
		    System.out.println(word.substring(1,l-1));
		    }else{
		          System.out.println(word);

		    }
		  }
		}