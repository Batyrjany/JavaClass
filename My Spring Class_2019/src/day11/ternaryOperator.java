package day11;

import java.util.Scanner;

public class ternaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
		Scanner scan = new Scanner(System.in);
			String result;
	System.out.println("Enter your score:");	
	int score=scan.nextInt();
	if(score>75) {
		result="pass";
	}else {
		result="fail";
	}
		
	System.out.println("result is "+result);
		
scan.close();
	
*/
		
		//      OR           //

/*
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your score:");
		int score = scan.nextInt();
		String result = "";
		result = (score > 75) ? "pass" : "fail";

		System.out.println(result);
*/
	String label;
	double price =109.99;
		
	//String label = (price>100)? "expensive":"cheap";	
		//System.out.println(label);

	//if(price>100){
//      label= "expensive"; 
//    }else if(price>90){
//      label = "moderate" ; 
//    }else{
//      label = "cheap" ; 
//    }
//    just for your eyes , just observe , do not try at home 
   
	
	
	
	label = (price>100) ? "expensive" : ( (price>90) ? "moderate" : "cheap" )  ; 
    System.out.println(label);
    //String label2 = (price<=100 && price>90) ? "moderate" : "cheapOrExp" ; 
    
    
    
    

	
	
	
	
	
	
	
	}

}
