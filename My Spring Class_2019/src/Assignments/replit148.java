package Assignments;

import java.util.*;

public class replit148 {
  
	  public static void add_to_r(int[] r,int n) 
		{
			//create new array with one more position.
		 
		  
		  int []  new_r  = Arrays.copyOf(r, r.length+1);
		     
		    // System.out.println(Arrays.toString(new_r));
		     
		      int lastIndex = new_r.length-1;
		     
		      new_r[lastIndex]= n;
		     
		     System.out.println(Arrays.toString(new_r));
			
		}
	 
	  
	  
	  public static void main(String[] args) {
		    
    Scanner inp = new Scanner(System.in);
    int size = inp.nextInt(), n = inp.nextInt();
    int[] arr = new int[size];
    for(int i=0 ;i<=size-1;i++)
    {

        arr[i]=inp.nextInt();
    }
    
       add_to_r(arr, n);
     
     
    
  }

//  public static void add_to_r(int[] r,int n) {
//		//create new array with one more position.
//		int[] new_r=Arrays.copyOf(r, r.length+1); 
//		System.out.println(Arrays.toString(r));
//	}
}