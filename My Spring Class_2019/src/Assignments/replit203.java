package Assignments;

import java.util.Arrays;

public class replit203 {

	public static int[] populate(int[] r) 
	{
		 for (int j = 0; j < r.length; j++) {
		    	
		    	r[j]=j+1;
			}
		return r;
	
		
	}
	
	public static void main(String[] args) 
	{
	 
	  
    int [] i= new int[3];
   i= populate(i) ;
     System.out.println(Arrays.toString(i));
    
    
    

}
}