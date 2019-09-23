package day12;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		
		int dayNum;
		String dayWord;
		System.out.println("Enter the dayNum:");
	dayNum = scan.nextInt();
//		switch(dayNum) {
//		case 1:
//			dayWord="Weekdays";
//		//System.out.println(dayWord);
//		break;
//		case 2:
//			dayWord="Weekdays";
//		//	System.out.println(dayWord);
//		break;
//		case 3:
//			dayWord="Weekdays";
//			//System.out.println(dayWord);
//		break;
//		case 4:
//			dayWord="Weekdays";
//			//System.out.println(dayWord);
//		break;
//		case 5:
//			dayWord="Weekdays";
//			//System.out.println(dayWord);
//		break;
//		case 6:
//			dayWord="Weekend";
//			//System.out.println(dayWord);
//		break;
//		case 7:
//			dayWord="Weekend";
//			//System.out.println(dayWord);
//		break;
//		default:
//			dayWord="Invalid day";
//		//System.out.println("dayWord");
//		
//		}
	switch(dayNum) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
		
		
		dayWord="Weekdays";
	break;
	case 6:
	case 7:
		
		dayWord="Weekend";
	break;
default:
		
		
		dayWord="invalid day";
	}
	
		System.out.println("The day is: "+ dayWord);
		

		
		scan.close();
		

	}

}
