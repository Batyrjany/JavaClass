package Assignments;

import java.util.Scanner;

public class replit51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		  
		
		   String numPeople="a";
//		   
		   double tip=0;
		   System.out.println("Split:");
		   String split = scan.next();
		   System.out.println("Number of people:");
		   int people = scan.nextInt();
		   System.out.println("Check amount:");
		   double checkAmount= scan.nextDouble();
		   System.out.println("Service Quality:");
		   String quality= scan.next();
		   
		   
		   switch (people) {
		case 1:
			numPeople = "&";
			break;
		case 2:
			numPeople = "&&";
			break;
		case 3:
			numPeople = "&&&";
			break;
		case 4:
			numPeople = "&&&&";
			break;
		case 5:
			numPeople = "&&&&&";
			break;
		case 6:
			numPeople = "&&&&&&";
			break;	
		default:
			numPeople = people+"&";
			break;
		}
		   
		   System.out.println("Number of people entered: "+ numPeople);
		   switch (quality) {
			case "Poor":
				tip = checkAmount * 5/100;
				break;
			case "Fair":
				tip = checkAmount * 10/100;
				break;
			case "Good":
				tip = checkAmount * 15/100;
				break;
			case "Great":
				tip = checkAmount * 20/100;
				break;
			case "Excellent":
				tip = checkAmount * 25/100;
				break;
			
			default:
				tip = 0;
				break;
			}
		   
		   System.out.println("Total to pay: "+ (checkAmount+tip));
 
		   System.out.println("Total tip: "+ tip);
		   System.out.println("Total per person: " + ((checkAmount+tip)/people));
		   System.out.println("Tip per person: "+ tip/people);
		   
		   
		   
		   
		   
		   
		   scan.close();
		   
		  // if (splitOrNot)
		  //   System.out.println("Yes");
		  // }else if(!splitOrNot){
		  //   System.out.println("Not");
		  // }
		   
		   
		   
	
		
		
	}

}
