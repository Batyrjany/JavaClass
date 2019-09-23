package day12;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int dayNum;
		String dayWord;
		System.out.println("Enter the dayNum:");
	dayNum = scan.nextInt();
		switch(dayNum) {
		case 1:
			dayWord="Monday";
		//System.out.println(dayWord);
		break;
		case 2:
			dayWord="Tuesday";
		//	System.out.println(dayWord);
		break;
		case 3:
			dayWord="Wednesday";
			//System.out.println(dayWord);
		break;
		case 4:
			dayWord="Thursday";
			//System.out.println(dayWord);
		break;
		case 5:
			dayWord="Friday";
			//System.out.println(dayWord);
		break;
		case 6:
			dayWord="Saturday";
			//System.out.println(dayWord);
		break;
		case 7:
			dayWord="Sunday";
			//System.out.println(dayWord);
		break;
		default:
			dayWord="Invalid day";
		//System.out.println("dayWord");
		
		}
		System.out.println("The day is: "+ dayWord);
		

		
		scan.close();
		
		
	}

}
