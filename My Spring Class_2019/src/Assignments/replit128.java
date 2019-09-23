package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class replit128 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	   
	    int[] nums = new int[size];
			for(int i =0; i < size; i++) {
				nums[i] = scan.nextInt();
			}
			//WRITE YOUR CODE HERE
		System.out.println(Arrays.toString(nums));
		
int [] newNums = Arrays.copyOf(nums, nums.length*2);

for (int i = 0; i < newNums.length-1; i++) {
	
	newNums[i]=0;
	
	newNums[newNums.length-1] = nums[nums.length-1];
	
	
}



System.out.println(Arrays.toString(newNums));
		
//Scanner scan = new Scanner(System.in); 
//System.out.println("Enter your word to be added ");
//String usersWord = scan.next() ; 
//
//String[] newWords = Arrays.copyOf(words, words.length + 1) ; 
//System.out.println( Arrays.toString(newWords) );
//
//int lastSpotIndex = newWords.length-1 ; 
//newWords[lastSpotIndex] = usersWord ; 
//System.out.println( Arrays.toString(newWords) );	
		
	}

}
