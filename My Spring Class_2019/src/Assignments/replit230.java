package Assignments;

import java.util.Arrays;

public class replit230 {

	static boolean isVowel(char c) { 
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U' || c == 'y'
                || c == 'Y'); 
    } 
	
	public static String reverseVowels(String str) {

		int j = 0;
		// Storing the vowels separately 
		char [] array = str.toCharArray();
		String vowel = "" ;
		for (int i = 0; i < array.length; i++) {
			if(isVowel(array[i])) {
				j++;
				vowel+=array[i];
			}			
		}
		// Placing the vowels in the reverse 
        // order in the string 
		for (int i = 0; i < array.length; i++) {
			if(isVowel(array[i])) {
				array[i]= vowel.charAt(--j);
			}
		}
		
		return String.valueOf(array);
		   
	  }

	   public static void main(String[] args) {
			
			 String str = "hello world"; 
			System.out.println(reverseVowels(str)); 
			
			}

	
	
	
	
}