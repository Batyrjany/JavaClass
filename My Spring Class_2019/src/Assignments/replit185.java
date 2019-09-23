package Assignments;

public class replit185 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s =  "1as*nclkn23...>>986";
		
		System.out.println(extractNum("1as*nclkn23986"));
		//extractNum(s);
		
	}
	public static String extractNum(String s) {
	    
		
		String y = "";
		  for (int i = 0; i < s.length(); i++) {
			
			if( Character.isDigit(s.charAt(i))) {
				
				y+=s.charAt(i);
				
			}
			  
		}return y;
		  
		  
		  
		   
		  }
}
