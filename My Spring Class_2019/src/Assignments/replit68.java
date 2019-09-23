package Assignments;
import java.util.*;

public class replit68 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    
		    int count = word.length();
		    String reverse = "";
		    if(count==5){
		    
		    	for(int i = count-1; i>=0; i--) {
		    		reverse = reverse + word.charAt(i);
		    		
		    		System.out.println(reverse);
		    	}
		    	} else if(count<5){
		      System.out.println("Too short!");
		    }else if(count>5){
		          System.out.println("Too long!");
		    }
		    
		   // System.out.println(""+word.charAt(4)+word.substring(1,4)+word.charAt(0));

		  }
		
		
	}


