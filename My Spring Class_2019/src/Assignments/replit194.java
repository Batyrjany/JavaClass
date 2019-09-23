package Assignments;

import java.util.Arrays;

public class replit194 {

	public static void main(String[] args) {
	

		String word1= "listen ";
		String word2="Silent op";
		
		System.out.println(isAnagram(word1,  word2));
		
	}
	public static boolean isAnagram(String word1, String word2) {
		
		boolean anag = false;
		int count=0;
		char [] w1 = word1.toLowerCase().replaceAll(" ", "").toCharArray();
		
		char[] w2 = word2.toLowerCase().replaceAll(" ", "").toCharArray();
		
		Arrays.sort(w1);
		Arrays.sort(w2);
		    if(w1.length==w2.length) {
		
		    	for (int i = 0; i < w2.length; i++) {
			
				if(w1[i]==w2[i]){ 
					count++;
				}
		        if(count==w2.length) {
		        	anag=true;
		        }else {
		        	anag=false;
		        }
		
		    	}
		    }//System.out.println(anag);
		
		
		
		
		return anag;
	    
	  }
}
