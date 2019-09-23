package day33;

public class warmUp {

	public static void main(String[] args) {
		
//		Create a static method
//		getSum  
//		accept 1 paramter as int array 
//		and return the sum of the all the items in array
//
//		another method called 
//		addAll 
//		accept 1 paramter as String array 
//		and return the concatenation of all items 
//
//		another method called 
//		getMax 
//		accept 1 paramter as int array 
//		and return the max from the all the items in array
//		
//		
		
		int [] nums = {1,2,3,4,5};
		int sum = getSum(nums);
		System.out.println(sum);
		
		// directly passing and printing without storing
		//System.out.println(getSum (new int[] {1,2,3,4}));
		
		System.out.println();
		
		String [] names= {"Jemal","Jelal","Gozel","Batyr"};
		String concatResult = addAll(names);
		System.out.println(concatResult);
		
		System.out.println();

		
		
		int max  = getMax(nums);
		System.out.println(max);
		
		
	}

	
	public static int getSum(int [] arr){
		int sum=0;
	
		for (int each: arr) {
			
			sum += each;
			
		}
		
		return sum;
		
	}

    public static String addAll( String [] strs) {
		
    	String concatenation="";
    	
    	for (int i = 0; i < strs.length; i++) {
         
    		concatenation+=strs[i];			
		}
    	return concatenation;
		
	}
    public static int getMax(int [] nums){
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(max<nums[i])
				max=nums[i];
		}
    	
    	return max;
		
	}
   

}
