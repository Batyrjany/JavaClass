package Assignments;

import java.util.Arrays;

public class replit177 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a = {1,2,3,4};
		int [] b = {4,5,6};
		System.out.println(Arrays.toString(mergR(a ,b)));
		
	}
	 public static int[] mergR(int[] a,int[] b) {
		
		 int l = a.length+b.length;
			int[] ret = new int [l];
			
			int z=0;
			for (int i = 0; i < a.length; i++) {
				 ret [z] = a[i];
				 z++;
			}
				 for (int j = 0; j < b.length; j++) {
					ret [z] = b[j];
					 z++;
				}
			//System.out.println(Arrays.toString(ret));
		 return ret;
		    
		    
	  }//end mergR
}
