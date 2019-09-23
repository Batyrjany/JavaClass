package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class replit125 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			int k = 0;
			double total = 0;
			double avgTemp = 0;
			double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
					scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
	  
System.out.println(Arrays.toString(temps));
		

for (int i = 0; i < temps.length; i++) {
	
	avgTemp += temps[i];
	k++;
	
	
}

if (k>0) 
	
	avgTemp/=temps.length;


System.out.println(avgTemp);
	}

}
