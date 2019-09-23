package day27;

public class forEachLoop {

	public static void main(String[] args) {

int [] nums = {1,33,567,11,22};

for (int i = 0; i < nums.length; i++) {
	int eachItem = nums[i];
	
	System.out.println(eachItem);
}
	
// for each loop sytax
/*
 * 
 * for ( eachItemDataType variable name : collectionVariable){
 * 
 * your action in here
 * }
 * 
 * for eachloop or enhanced for loop
 * 
 */


System.out.println();

for (int eachItem : nums) {
	
	System.out.println(eachItem);
}


System.out.println();




String [] words = {"Batyr", "Gozel","Jemal","Jelal"};

for (String eachString : words) {
	System.out.print(eachString+" ");
	
}


	}

}
