package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class replit189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		timesTwo(nums);
	}

	
	
	public static void timesTwo(ArrayList<Integer> nums) {
		
		
		for (Integer each : nums) {
		System.out.println(each*2);

		}
	
	
	}
}
