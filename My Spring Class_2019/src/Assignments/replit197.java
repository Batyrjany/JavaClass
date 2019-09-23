package Assignments;

import java.util.Arrays;

public class replit197 {

	public static void main(String[] args) {
		
		int[] ints1 = {10, 40, 50, 3, 1};
		int [] ints2 = {11, 0, 500, 44, 1101};
		
		System.out.println(Arrays.toString(addElements(ints1, ints2)));
		
	}

	
	public static int[] addElements(int[] ints1, int[] ints2) {
		
		

		int [] ints3 = null;
		
		if(ints1.length>ints2.length) {
			ints3=new int [ints1.length];
			
		}else {
			ints3=new int [ints2.length];
		}
		for (int i = 0; i < ints3.length; i++) {
			ints3[i]=ints1[i]+ints2[i];
		}
		//System.out.println(Arrays.toString(ints3));
		
		
		
		
		return ints3;

	  }
}
