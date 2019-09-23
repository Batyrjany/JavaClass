package Assignments;

import java.util.Scanner;

public class replit95 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 0;
		double totalPrice = 0;
		
		
		
		for (int i =0 ; i<=10; i++) {
		
			
			do{
		  System.out.println("Enter Item" +count+" and its price:");
		  item=scan.next();
		  price=scan.nextDouble();
		  
		  shoppingListReport +="Item"+count+": "+item+" Price: "+price+", ";		  
		  totalPrice +=price;
		  count++;
		  
		  System.out.println("Add one more item?");
		  
		  countinue = scan.next();
		  
		}while(countinue.equalsIgnoreCase("yes"));
			
			shoppingListReport=shoppingListReport.substring(0, shoppingListReport.length()-2);
		if(!countinue.equalsIgnoreCase("yes"));
			break;
		}
		
		System.out.println(shoppingListReport);
		System.out.println("Total price: "+ totalPrice);
		
}
}