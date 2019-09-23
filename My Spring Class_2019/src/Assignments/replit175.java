package Assignments;

import java.util.Arrays;

public class replit175 {

	public static void main(String[] args) {
		
		double[] nums =  {12.2,16.8,70.6};

		int [] nums1 =  {12,16,70};
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(nums1));

	}

	
	
	



	public double findMax(double [] nums) {

	double max = nums[0];
	
	for (int i = 1; i < nums.length; i++) {
		if(max<nums[i])
			max=nums[i];
	}
	return max;

	}
 
	public int  findMax(int [] nums) {
	
		
		int max = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if(max<nums[i])
				max=nums[i];
		
	}
		return max;
}
}