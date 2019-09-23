package day12;

import java.util.Scanner;

public class ConditionalReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String weather;
		String action;
		
		System.out.println("How is the weather today?");
		
		weather=scan.next();
		/*	
		if (weather == ("sunny")) {
			action="go out";
			System.out.println(action);
		}else {
			action = ("stay home");
			System.out.println(action);
		}
		
		if (action==("go out")){
	System.out.println("I will go out");
		}	else if (action==("stay home")) {
			System.out.println("i will stay home");
		}
	scan.close();	
	*/
	//	action = (weather.equals("sunny"))?"go out" :"stay home";
	//action = (weather.equalsIgnoreCase("sunny"))?"go out" :"stay home";
		action = (weather.equalsIgnoreCase("sunny") || weather.equalsIgnoreCase("nice"))
				          ?"go out" :"stay home";
		
	
	System.out.println("The action according to weather is: "+action);
	}

}
