package Assignments;
import java.util.*;
public class replit53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
				String storageType, screenType, cpu;
				int ram = 0 ;
				Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE
		    
		    double price=0d;
		    
		   
		    System.out.println("Select screen size:");
		    double screenSize=scan.nextDouble();
		    if (screenSize ==13.3){
		    price += 200;
		     
		    }else if(screenSize ==15.0) {
		    	
		        price += 300;
		       
		    }else if(screenSize ==17.3){
		        price += 400;
		    }else {
		      System.out.println("Invalid screen size:");
		          }
		    
		    System.out.println("Select CPU type:");
		    cpu=scan.next();
		    switch (cpu){
		      case "i3":
		        price += 150;
		        break;
		      case "i5":
		        price += 250;
		        break;
		      case "i7":
		        price += 350;
		        break;
		      default:
		      System.out.println("Invalid CPU type:");
		    }
		    
		     System.out.println("Select RAM size:");
		    ram=scan.nextInt();
		if (ram%4==0) {
		   
		      price += (ram/4)*50;
		}else {
			System.out.println("Invalid RAM size:");
		}
		  
		    
		    System.out.println("Select storage type:");
		    String storage=scan.next();
		    System.out.println("Enter memory size:");
		    int memory=scan.nextInt();
		    if(storage.equals("HDD")) {
		    	price+= ((memory/500)*50);
		    }else if(storage.equals("SSD")){
		    	price+= ((memory/500)*100 );
		    }else {
		    	System.out.println("Invalid memory size:");
		    }
		    System.out.println("Enter screen resolution:");
		    String resolution=scan.next();		    
		    if(resolution.equals("FULLHD")) {
		    	price += 100;
		    } else if(resolution.equals("4K")) {
		    	
		    	price += 200;
		    }
		    	System.out.println("Laptop price is: " + "$"+ price);
		
		
		
	}

}
