package day32;

public class Converter {

	public static void main(String[] args) {
		

	System.out.println(meterToCm(10));
	
	System.out.println(FeetToInch(12));
	
	System.out.println(FaToCelcius(88));
		
	int cel = (int) FaToCelcius(88);
	
	System.out.println(cel);
		
		
	}
    public static int meterToCm (int m) {
  
    	int converted = m*100;
    	return converted;
    	
    }

 public static int FeetToInch (int m1) {
  
	 
	 int converted1 =  m1/12;
    	return converted1;
    }
 public static double FaToCelcius (double f) {
	  
	 
	 double convertedFaToC = (f-32)*5/9;
return convertedFaToC;
 	
 }

}
