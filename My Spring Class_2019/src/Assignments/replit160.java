package Assignments;

public class replit160 {

	public static void main(String[] args) {
		
		
		
		// HOW TO CALL THE VALUE IN MAIN METHOD
		
	}
	
	
	
	
	public  double waterTax(double units)
	  {
	    double bill = 0.0;
	    
	    //your code here
	   
	    if(units>0 && units<=50){
	    	   bill = units*0.60;}
	    	   if(units>50 && units<=100){
	    	   bill = units*0.90;}
	    	   if(units>100 && units<=150) {
	    	   bill = 50+(units*0.90);}
	    	   else if (units>150){
	    	   bill = 100+(units*0.90);}
	    	   System.out.println(bill);
	    
	    
	    //end your code here
	    
	    
	    return bill;
	  }//end waterTax
	  
	  
	}