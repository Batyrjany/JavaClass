package Assignments;

import java.util.Arrays;

public class CodingBat {

	
	
	
	public static void main(String[] args) {
		
		
		
//		
//		int n [] =new int[2];
//		 int [] nums = {7, 1, 2, 3, 4, 9};
//		int l= nums.length;
//		if(l>1){
//			if(l%2==0){
//			  n[0]=nums[l/2];
//			     n[1]=nums[l/2+1];
//		
//		
//	}
//		 
//		}System.out.println(Arrays.toString(n));
	
	
//	int [] nums1 = {7, 1, 2, 3, 4, 9,8};
//	int [] m = new int[3];
//	int l1= nums1.length;
//	  if(l1>1){
//	    if(l1%2!=0){
//	    	m[0]=nums1[l1/2-1];
//		    m[1]=nums1[l1/2];
//		     m[2]=nums1[l1/2+1];
//		     }
//
//	  }System.out.println(Arrays.toString(m));

//		int [] nums = {9, 1, 2, 3, 4, 9, 8}; //result 9
//	int  max=0;
//	 int l= nums.length;
//	  if(l>0){
//	   
//	    if(nums[0]>nums[l/2] && nums[0]>=nums[l-1]) {
//	    	max=nums[0];
//	    }else if(nums[l/2]>nums[0] && nums[l/2]>=nums[l-1]) {
//	    	max=nums[l/2];
//	    }else if(nums[l-1]>nums[l/2] && nums[l-1]>=nums[0]) {
//	    	max= nums[l-1];
//	    }
//	    System.out.println(max);
//	    System.out.println();
//	    System.out.println(nums[0]);
//	    System.out.println(nums[l/2]);
//	    System.out.println(nums[l-1]);
//}
//		  String str = "The";
//		 String d = "";
//		 int l =str.length();
//		  for (int i =0 ; i<l ; i++){
//			  //d+=str.substring(i,l-(l-1))+str.substring(i,l-(l-1));
//			  // d+=str.substring(i,l-(l+1))+ str.substring(i,i+1)+str.substring(i+1,i+2)+str.substring(i+1,i+2);
//	     d=d+str.charAt(i)+str.charAt(i);
//		    
//		  }System.out.println(d);
		//System.out.println(str.charAt(0));
		
//		String str = "1cat1cadodog";
//		  int count=0;
//		  int count1=0;
//		  boolean b= true;
//		for(int i = 0;  i<str.length()-2; i++){
//		  if(str.substring(i,i+3).equals("cat")){
//		    count++;
//		    }
//		  }
//		System.out.println(count);
//		  for(int j = 0;  j<str.length()-2; j++){
//		  if(str.substring(j,j+3).equals("dog")){
//		    count1++;
//		  }
//		  
//		}
//		  System.out.println(count1);
//		  if(count==count1){
//			   b= true;
//			  }else{
//			  b=false;
//			 }System.out.println(b);

		//		String a="Hiabc", b="abc";
//		boolean n=true;
//		  if(a.length()>=b.length()){
//		    if(a.substring(a.length()-b.length(),a.length()).equalsIgnoreCase(b)){
//		      n=true;
//		    }else{
//		      n=false;
//		    } 
//		    }else{
//		    if(b.substring(b.length()-a.length(),b.length()).equalsIgnoreCase(a)){
//		      n=true;
//		    }else{
//		      n=false;
//		    } 
//
//		  }System.out.println(n);
	
	String str= "abcxyz";
		  boolean b=false;
		  if(str.indexOf("y")<str.lastIndexOf("x") && str.lastIndexOf("y")>str.indexOf("x")){
			  			  
		  }System.out.println(b);
		  }
	}
