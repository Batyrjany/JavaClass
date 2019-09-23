package day24;

public class ArrayPractice2 {

	public static void main(String[] args) {
	
		 // create an int array of 5 items and assign values ; 
	    //{1,4,6,8,9}
	    int nums []= {1,4,6,8,9};
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }
	    System.out.println();
	    
	    
	    
	    // double the value of 3rd item  : for example 6 --> 12 
	    nums[2] = nums[2] * 2 ; 
	    // update the value of 4th item to sum of 1st and 2nd items  8 --> 1+4
	    nums[3] = nums[0] + nums[1] ; 
	    
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }
	    
	    System.out.println();
	    
	    
	    int nums2[]= {1,4,6,8,9};
	    
	    for (int i = 0; i<nums2.length; i++) {
	    	
	    	System.out.print(nums2[i]+" ");
	    }
	    
	    
	    System.out.println();
	    
	    
	    int temp = nums2[nums2.length-1];
	    nums2[nums2.length-1]= nums2[0];
	    nums2[0]= temp;
	    
     for (int i = 0; i<nums2.length; i++) {
	    	
	    	System.out.print(nums2[i]+" ");
	   
     
     }
     
    System.out.println();
    
    
    
    
       int nums3 []= {1,4,6,8,9};
    
    int sum = 0 ; 
    for (int i = 0; i < nums3.length; i++) {
      
      sum = sum + nums3[i] ; 
      
    }
    System.out.print(sum);
    
    
    
    System.out.println();
    
    
    int nums4 []= {1,4,6,8,9};
    
    int sum4 = 0 ;
    int j= 0;
  
    
    do  {
      
      sum4 = sum4 + nums4[j] ; 
      j++; 
    }while(j<nums4.length);
    System.out.print(sum4);
    
    
    
    System.out.println();
    
    
    int nums5 []= {1,4,6,8,9};
     int sum5=0;
    int z = 0 ; 
   while (z<nums5.length) {
     sum5 = sum5 + nums5[z];
     z++ ; 
    }
    
    System.out.println(sum5);
    
    
    
    
    
    
    
	}

}
