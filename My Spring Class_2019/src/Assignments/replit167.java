package Assignments;

public class replit167 {

	public static void main(String[] args) {
		
		System.out.println(coverString("java methods", "me") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
		  
		  String covered= ""; 

			
			  if(main.contains(coverME)) {
			
				  
				  covered= main.replaceAll(coverME, "["+coverME+"]");
				
			  }else {
			
				  covered="["+main+"]";;
		}
		  
		  
		  
		  
		  
	
		  return covered;
	}}