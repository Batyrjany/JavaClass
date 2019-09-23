package Assignments;

public class replit188 {

	public static void main(String[] args) {
		
    String line = "error foo bar";
		System.out.println(isError(line));

	}
	
	public static boolean isError(String line) 
	  {
		boolean Error = false ;
		for (int i = 0; i < line.length()-5; i++) {
			
			if(line.startsWith("error")) {
				Error=true;
			}
		}
		return Error;		
			}
		
		
		
	    
	  }

