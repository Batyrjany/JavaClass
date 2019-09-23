package Assignments;

public class replit166 {

	public static void main(String[] args) {
		
	 System.out.println( uniqueChars("wooden-spoon") ) ;
		 
	
		
}
	  
	  public static String uniqueChars(String str) {
		
		  //TODO: write your below
		   
		  String unique="";
	 
	  for (int i = 0; i < str.length(); i++) {
		String letter = str.substring(i,i+1);
		if(!unique.contains(letter)) {
		unique+=letter;
		}	
	  }	
			
return unique;

		
	  }
}

		  
		  