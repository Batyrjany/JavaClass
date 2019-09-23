package Assignments;

public class replit173 {

	public static void main(String[] args) {
		
		String target= "aaa";
		System.out.println(removeFirst(target));
		
		
		//System.out.println(target);
		
	}
	
	
	
	
	public static String removeFirst(String target) {
		
		target = target.substring(1,target.length());
		return target;
	    
	    
	    
	  }
	}