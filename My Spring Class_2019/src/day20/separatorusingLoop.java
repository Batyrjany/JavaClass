package day20;

public class separatorusingLoop {

	public static void main(String[] args) {
		

		
		
		// java20awesome----->>> javaawesome  20
		
				String mix = "Aonline132x";
		      
				String numberStr = "";
				int  x = 0;
				
				while(x<mix.length()) {
					char c = mix.charAt(x);
					
					if(c>='0' && c<='9') {
						
						System.out.println(c);
						numberStr = numberStr+c;
					}
					
					
					x++;
					
				}
				System.out.println(numberStr);
				
				
		     
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      // check whether c is between 0 -9 
		      
//		      
//		      if(c>='0' && c<='9') {
//		    	  System.out.println("number");
//		      }else {
//		    	  System.out.println("not number");
//		      }
//				
//		      if(c>='A' && c<='Z') {
//		    	  System.out.println("Uppercase");
//		      }else {
//		    	  System.out.println("not Uppercase");
//		      }
//		      
//		      
		      
		      
		      
	}

}
