package day27;

import java.util.Arrays;

public class warmUp {

	public static void main(String[] args) {
		
//		//Task1 : 
//		create an array of int with 5 items , return true if all items are more than 10
//		return false if not
//
//	//Task 2 :
//	given : 
//	String str = "Cybertek Batch Spartan is most hardworking Batch ever";
//
//	use the method your learned to get each words
//	and store it into String array: 
//
//	loop through each items -- 
//	  in each iteratrion loop : 
//	  	 turn each word into char array 
//	  	 print each char out with seperated by -
//	output : 
//		C-y-b-e-r-t-e-k-
//		B-a-t-c-h-
//		S-p-a-r-t-a-n-
//		i-s-
//		m-o-s-t-
//		h-a-r-d-w-o-r-k-i-n-g-
//		h-c-t-a-B
//		e-v-e-r-
//
//	// Optional : Reverse each word in sentence
//	your output should be 
//	ketrebyC hctaB natrapS si tsom gnikrowdrah hctaB reve

		// TASK 1
		
		int num[] = {5,8,3,10,53,67};
		
		boolean result = true;
		
		
		for (int i =0; i<num.length; i++) {
		
			if(num[i]<=10) {
				result=false;
				break;
			}
		}
		
		System.out.println(result);
		
		System.out.println();
		
		
		//TASK 2
		
		
		
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		
		String [] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		for (int i = 0; i < words.length; i++) {
			//System.out.println(words[i]);
			
			String one = words[i];
			
			char [] cyberChars = one.toCharArray();
			
			for (int j =0; j< cyberChars.length; j++) {
				System.out.print(cyberChars[j]+"-");
			}
		
			System.out.println();
		}
		System.out.println();
		
		// TASK3
		
		
		
		String str1 = "Cybertek Batch Spartan is most hardworking Batch ever";
		
		String [] words1 = str.split(" ");
		
		String reversedSentence = "";
		
		for (int i = 0; i < words1.length; i++) {
			//System.out.println(words1[i]);
			String one = words1[i];
			
			char[] wordChars = one.toCharArray();
			int lastIndex =wordChars.length-1;
			
			for (int j = 0; j < wordChars.length/2; j++) {
				
				char temp = wordChars[j];
				
				wordChars[j] = wordChars[lastIndex-j];
				
				wordChars[lastIndex-j]=temp;
			
			}
			//System.out.println(Arrays.toString(wordChars));
			
			// how to change char array to String
			
			
			String reversed = new String (wordChars);
			
			
			reversedSentence = reversedSentence + reversed+" ";
			
			
			
		}
		
		
		System.out.println(reversedSentence );
		
		
		
	
		
		
		
		
		
		
	}

}
