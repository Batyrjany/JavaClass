package day24;

import java.util.Scanner;

public class ScannerAndArray {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

int [] arr = new int[3];

System.out.println("Enter the number:");

arr[0]=scan.nextInt();

System.out.println("Enter the number:");

arr[1]=scan.nextInt();

System.out.println("Enter the number:");

arr[2]=scan.nextInt();


for (int i =0; i<arr.length; i++) {
	
	System.out.print(arr[i]+",");
}


		
		
		
	}

}
