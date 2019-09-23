package day27;

import java.util.*;

public class task {

	public static void main(String[] args) {

Scanner scan = new  Scanner(System.in);



System.out.println(" Enter 5 number: ");

int [] nums = new int[5];

for (int i = 0; i < 5; i++) {
	
	nums [i] = scan.nextInt();	
	
	
}

System.out.println(Arrays.toString(nums));
int sum= 0;

for( int each : nums) {
  
  sum += each ; 
  
}
System.out.println("sum is : "+ sum);


// assume first item is the max before comparing with all items 
int max = nums[0] ; 

for(int eachNum : nums) {
  
  if(eachNum > max) {
    max = eachNum ; 
  }
  
}
System.out.println("max is : "+ max);

int min = nums[0] ;

for (int eachNumber : nums) {
  if(eachNumber<min) {
    min = eachNumber ; 
  }
}
System.out.println("min is : "+ min);




	

	}

}
