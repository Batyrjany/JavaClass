package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class replit215 {

	
	 public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
	  {
		
//		 ArrayList<Integer> removeInst = new ArrayList<>();
//		 
//		 for (int i = 0; i < r.size(); i++) {
//			
//			 if(r.get(i)!=n) {
//				 removeInst.add(r.get(i));
//				 
//			 }
//			 
//		}
//		 return removeInst;
	   
		 
		 
		 while(r.contains(n)) {
		        r.remove(n);
		    }
		        return r;
	  }
	  
	

	public static void main(String[] args)
	  {
	  
	    ArrayList<Integer>  arr = new ArrayList<>();
	    Integer[] nums = new Integer[]{1,1,2,3};
	    arr.addAll(Arrays.asList(nums));
	    
	    System.out.print(removeInst(arr,1));
	   
	    
	  }//end main
	}
