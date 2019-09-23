package Assignments;

import java.util.Scanner;

public class replit153_1 {

	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
		    
		 
		  }
		  
		   public static void isPalindrome(int num){
			    //WRITE YOUR CODE HERE
			   int originalstored =num;
			   int reverse=0;
			   boolean pal = true;
			   
			  while(num!=0){
			
			   reverse=reverse*10;
		       reverse= reverse+num%10;
			   num=num/10;
			   
			  }
			   if(originalstored==reverse)
				   pal=true;
			   else
				   pal=false;
			   System.out.println(pal);
			
			   
			
				}
			}