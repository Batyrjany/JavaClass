package Assignments;

import java.util.Scanner;

public class mentoring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in); 
		int age=18;
		
		
		System.out.println("What is your age?");
		
age = scan.nextInt();
		

if (age>=18) {
	System.out.println("Acces granted");
	
}else {
	System.out.println("You ar too little");
}
	}

}
