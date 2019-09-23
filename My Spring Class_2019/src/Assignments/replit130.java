package Assignments;

import java.util.*;

public class replit130 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		int sizeInner = scan.nextInt();
		
		int sizeOuter = scan.nextInt();
		
		int[] inner = new int[sizeInner];
		
		int[] outer = new int[sizeOuter];
		
		for(int i =0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for(int j =0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		//WRITE YOUR CODE HERE
		
		
		
		
		
//		System.out.println(Arrays.toString(outer));
//		
//		System.out.println(Arrays.toString(inner));
		
		boolean b = true;
		int count =0;
		for (int k = 0; k < outer.length; k++) {
			if();
		}
		
		
		
		for(int i =0; i < inner.length; i++) {
				for(int j =0; j < outer.length; j++) {
			if(inner[i]== outer[j])
				count++;
		}
    }
       if(count>=inner.length && count>=outer.length) {
    	   b=true;
       }else {
    	   b=false;
       }
	
       System.out.println(b);
			
		}
		
	}


