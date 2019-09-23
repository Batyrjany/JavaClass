package Assignments;

import java.util.*;

public class replit182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ints = new ArrayList<>();
	
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.add(4);
		ints.add(5);
		
		
		System.out.println(sum(ints));
		
	}
	
	
	
	public static int sum(ArrayList<Integer> ints)
	{
		//write code here
		
		int sum=0;
		for(int i=0 ; i<ints.size() ; i++ ){
		  sum+= ints.get(i);
		  
		}
		return sum;
		
		
	}
}
