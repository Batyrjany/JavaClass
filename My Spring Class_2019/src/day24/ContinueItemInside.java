package day24;

import java.util.Arrays;

public class ContinueItemInside {

	public static void main(String[] args) {

   
		int [] nums = {1,55,7,898,9,55,355,101};

		int count=0;

		for (int i = 0 ; i< nums.length;i++) {
			
			if(nums[i]>100) {
				count++;
			}
		}
			System.out.println(count);
			
		System.out.println(Arrays.toString(nums));
	}

}
