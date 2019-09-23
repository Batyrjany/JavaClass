package Assignments;

public class replit170 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text ="bla bla";
		int maxLength = 3;
		
		
		
		
		
		
		System.out.println(limit(text,maxLength));
		
		
		
		
		
	}
	 public static String limit(String text, int maxLength)
	  {
		
		 
		 if(maxLength>0) {
				
				text=text.substring(0,maxLength);	
			}else {
				text=text;
			}
			
		 
		 
		 return text;
	    
	  }
	 
}