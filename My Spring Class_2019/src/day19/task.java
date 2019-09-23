package day19;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan = new Scanner(System.in);

	    String str = scan.next();
	    // how to check whether string start with a-z
	    char firstChar = str.charAt(0);
	    int l = str.length();
	    
	    char lastChar = str.charAt(str.length()-1);

	  
	    
	    //ABC System.out.println('a' > 'b');

	    if (firstChar>='1' && firstChar<='9' ) {

	      System.out.println("starts with number");

	    } else if(lastChar>='A'&& lastChar<='Z'){
	    	
	    	System.out.println("ends with UpperCase");
	      
	    }else {
	    	 System.out.println("NOT valid");
	    }

		
	   
		
	}

}
