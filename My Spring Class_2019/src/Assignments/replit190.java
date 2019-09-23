package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class replit190 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
		
		appendPosSum( nums);
		
	}
public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
	
	
	ArrayList<Integer> newnums = new ArrayList<>();
	for (int i = 0; i < nums.size(); i++) {
		if(nums.get(i)>0) {
		newnums.add(nums.get(i));
		}
		}//System.out.println(newnums);
int sum = 0;
		
for (Integer each : newnums) {
sum+=each;
}

newnums.add(sum);
System.out.println(newnums);
	
	return newnums;
	
}
}
