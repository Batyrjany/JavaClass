package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class replit155 {

	public static void main(String[] args) {
		
       Scanner scan = new Scanner(System.in);
       //System.out.println("enter words:");
       String words = scan.next();
       //System.out.println("enter a word:");
       String word = scan.next();
       String[] arr1 = words.split(",");
       
       
      // count_appearance(String [] arr,word );
       
	 
	}	
		public int  count_appearance(String[] arr,String t){
	
			
			  
			  //System.out.println(Arrays.toString(arr1));
			 // System.out.println(" the length of arr1 is: "+arr.length);
				
			  int count=0;

				for (int i = 0; i < arr.length; i++) {
					
					if(t.equals(arr[i]))
						count++;
					
				}
				
			return count;
		   
		  } //end  count_appearance
		  

		}

