package Exercise_contr_get_set;

import java.util.Scanner;

public class Main {

	
	
	
	public static void main(String[] args) {
		

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Welcome to Exercise Programm ...");
		
		String exercises  = "Valid exercises\n"
				+ "Burpee\n"
				+ "Pushup\n"
				+ "Situp\n"
				+ "Squat";
		
		System.out.println(exercises);
		
		System.out.println("Create an Exercise Programm...");
		
		System.out.println("Burpee Count: ");
		int burpee=scan.nextInt();
		System.out.println("Pushup Count: ");
		int pushup=scan.nextInt();
		System.out.println("Situp Count: ");
		int situp=scan.nextInt();
		System.out.println("Squat Count: ");
		int squat=scan.nextInt();
		
		scan.nextLine();
		
		
		Exercise e = new Exercise(burpee, pushup, situp,squat);
		
		System.out.println("Starting An Exercise Programm...");
		
		
		
		
		while(e.isExerciseDone()==false) {
			System.out.println("Exercise Type ( Burpee, Pushup, Situp, Squat) ;");
			
			String type = scan.nextLine();
			
			System.out.println("What's the quantity you want to do?");
			int count = scan.nextInt();
			scan.nextLine();
			
			e.move(type, count);
			
		}
		System.out.println("You have Successfully ended your Programm... Congrats!");
	}
	
	
	
	
	
	
	
	
}
