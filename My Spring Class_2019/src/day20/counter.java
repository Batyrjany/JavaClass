package day20;

import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		String str=scan.next();
		
		int count=0;
		int x = 0;
		do {
			
			char c= str.charAt(x);
			//if (c=='a') {
			if(c=='a' || c=='A')	{
				System.out.println("Bingo! at "+x);
				count++;
			}
			
			//System.out.print(str.charAt(x));
			x++;
			
		}while(x<str.length());
		
		System.out.println(count);

	}

}
