package day11;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan =new Scanner(System.in);
	
	System.out.println("Enter the price:");
	
	double price = scan.nextDouble();
	String label;
	
	
	label =(price>100)? "expensive":"cheap";
	 
	
	System.out.println("The price is "+ label);
	
	scan.close();
	
	}

}
