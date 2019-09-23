package Assignments;

public class replit158 {

	public static void main(String[] args) {
		
		System.out.println(c_profits(120,120));
		
	}

	
	public static String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
		
		String c="";
		
	   if(buyPrice>sellPrice) {
		  
           c="loss";
	
	   }else if(buyPrice<sellPrice){
		   
		   c="profit";
		   
	   }else if(buyPrice==sellPrice) {
		   c="no loss";
	   }
	   return c;
	   
	  }
	
}
