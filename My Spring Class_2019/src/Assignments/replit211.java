package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class replit211 {

	public static void main(String[] args) {
	
		String result = reverseLetters("..zxcv..d");
	    System.out.println(result.equals("..dvcx..z")); //true
	    
	    String result2 = reverseLetters("---abmkl.o-");
	    System.out.println(result2.equals("---olkmb.a-")); //true
	    
	    String result3 = reverseLetters("---abmkl.o-");
	    System.out.println(result3.equals("-o.lkmba---")); //false
	   
		
	}

	 public static String reverseLetters(String word){

		 ArrayList<Character>reversed=new ArrayList<>(word.length());
         
		    for (int i = word.length()-1; i >=0; i--) {
		    if((word.charAt(i)>='A'&&word.charAt(i)<='z')
		      ||(word.charAt(i)>='a'&&word.charAt(i)<='z')) {
		    reversed.add(word.charAt(i));        
		        }}
		    
		    for (int j = 0; j < word.length(); j++) {
		        if(!(word.charAt(j)>='A'&&word.charAt(j)<='Z')
		        &!(word.charAt(j)>='a'&&word.charAt(j)<='z')) {
		        reversed.add(j, word.charAt(j));
		    }    
		    }
		    String words="";
		    for (Character each :reversed)  {
		        words+=each;
		    }
		    
		    return words;
		    }
		}