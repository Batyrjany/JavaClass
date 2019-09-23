package day18;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan =new Scanner(System.in);
		
		
//		int x ;
//		int y =10;
//		if  (y>15) {
//			x=10;
//		}else {
//			x=5;
//		}
//		
//		System.out.println(x);
//		
		
		System.out.println("Enetr 5$ or 10$ bill");
		int bill = scan.nextInt();
		int x = 5;
		int y =10;
		
		while (bill != x && bill!=y) {
			
			System.out.println("Enetr 5$ or 10$ bill");
			bill = scan.nextInt();
		
		}
			
		System.out.println("Tank You");
		
		
	}

}
