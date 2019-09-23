package day33;

import java.util.Arrays;

public class returnungMultipleValue {

	public static void main(String[] args) {
		

		perform();
		
		System.out.println();
		
		double[] prices1 = {1.1,3.99, 2.2}; 
	    double[] prices2 = {2.4,2.88}; 
	    
	    double[] prices3 = combineArrays(prices1,prices2); 
	    
	    System.out.println(Arrays.toString(combineArrays(prices1,prices2)));
	   System.out.println();
	    System.out.println(Arrays.toString(prices3));
System.out.println();
	    
	    double[] expected = new double[]{1.1,3.99, 2.2, 2.4,2.88};  
	    
	    System.out.println(Arrays.toString(expected));
	    System.out.println();
	    if(Arrays.equals(prices3,expected )) {
	      System.out.println("Test has passed ");
	      System.out.println(Arrays.toString(expected)+"="+Arrays.toString(prices3));
	      
	      
	    }else {
	      System.out.println("Test Failed");
	      System.out.println(Arrays.toString(expected)+"!="+Arrays.toString(prices3));
	      
	    }
	    
	  }
	public static void perform() {
		
		System.out.println("Action");
	}
	
	
	 public static double[] combineArrays(double[] d1,double[] d2) {
		    
		    int size = d1.length+d2.length ;
		    double[] combined = new double[size]; 
		    //{0,0,0,0,0} 
		    //{1.1,3.99, 2.2}  {2.4,2.88}  ---> {1.1,3.99, 2.2, 2.4,2.88} 
		    
		    for (int i = 0; i < d1.length; i++) {
		      combined[i] = d1[i]; 
		    }
		    
		    for (int j = 0; j < d2.length; j++) {
		      combined[d1.length + j] = d2[j]; 
		    }
		    
		    
		    return combined ; 
		    
		  }
		  
		  

		}
