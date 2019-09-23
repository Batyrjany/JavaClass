package day62;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		
		    // TODO Auto-generated method stub

		    // EXCEPTIONS ARE OBJECTS
		    
		    // ArrayIndexOutOfBoundException
//		     int[] nums = {1,5,6} ; 
//		       System.out.println( nums[99] );
		    
//		     ArrayIndexOutOfBoundsException aib = new ArrayIndexOutOfBoundsException(); 
//		     System.out.println(aib);
		//    
//		     // throw keyword --->> is used to throw exception manually 
//		     throw aib ; 
		       
		       
		       // TASK 1  
		       
		       // try to devide a number by 0 to see ArithmaticException 
		       // and comment out that code and generate same exception using throw keyword 
		
	
		//System.out.println(10/0);
//		
//		ArithmeticException a = new ArithmeticException(); 
//	     System.out.println(a);
//	     throw a ; 
//	     
	     
	     
	     
	     
	     try {
	    	 int[] nums = {1,5,6} ; 
		 System.out.println( nums[99] );
		   //System.out.println( nums[0] );
	     }catch( ArrayIndexOutOfBoundsException aib) {
	    	 
	    	 
	    	 System.out.println("OUT OF BOND");
	     }
	     System.out.println("END OF THE CODE");
		
		}
		}