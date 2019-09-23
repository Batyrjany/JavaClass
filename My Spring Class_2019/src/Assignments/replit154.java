package Assignments;

import java.util.Scanner;

public class replit154 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
	
   		
	}
		  public static void fib(int num){
		    //WRITE YOUR CODE HERE
			    int n1=0;
			    int n2=1;
			    int sum =0;
			    for (int i =1; i <= num; i++) {
			   	 
			    	
			    	//System.out.print(n1+" ");
			   sum = n1+n2;
			   	 n1=n2;
			   	 n2=sum;

				}System.out.print(n1);
         
		  }
}
