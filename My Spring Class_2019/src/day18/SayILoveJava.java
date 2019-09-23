package day18;

import java.util.Scanner;

public class SayILoveJava {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String answer = "";
		
		while(!answer.equalsIgnoreCase("yes")) {
			System.out.println("Do you Love JAVA");
			
			answer = scan.next();
			
		}
		System.out.println("Finally correct answer");
		
		
		
	}

}
