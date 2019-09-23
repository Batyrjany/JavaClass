package day19;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		
		
		
		
		
		String sentence = "";
		
		//while(!sentence.contains("java")) {
		
		while (!sentence.toUpperCase().contains("JAVA")) {
		
		System.out.println("enter your sentence");
			sentence = scan.nextLine();
			
			
		}
		
		System.out.println("END");
		
		
	}

}
