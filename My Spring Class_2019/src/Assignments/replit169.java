package Assignments;

public class replit169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text = "one-two-three-bla-bla-bla-four";
		String badWord = "bla";
		
	      System.out.println( clean(text , badWord));
		
		
	}
	
	
	
	
	public static String clean (String text ,String badWord) {
		
		
		//String clear= "";
		if(text.contains(badWord)) {
			text = text.replaceAll(badWord,"");
			
			
		}else {
			text=text;
		}
		//System.out.println(clear);
		
		
		
		
		
		return text;

	      
	  }
	}
