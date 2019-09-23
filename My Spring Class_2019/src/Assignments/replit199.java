package Assignments;

import java.util.Arrays;

public class replit199 {

	public static void main(String[] args) {
		
int[]i= {1,2,3,4};
	

System.out.println(Arrays.toString(do_switch(i) ));

	}

	public static int[] do_switch(int[] i) 
	 {
		int a=0;

		a=i[0];
		
		i[0]=i[i.length-1];
		i[i.length-1]=a;
	  
	

		return i;
		
//	for(i=0 ; i<array.length; i++) {
//		
//	}


		}
}
