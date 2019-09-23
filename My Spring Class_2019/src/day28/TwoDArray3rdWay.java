package day28;

import java.util.Arrays;

public class TwoDArray3rdWay {

	public static void main(String[] args) {


		int [] nums = {1,2,3,23};
		
		int [][] data = {{2,14,3},{4,5},{9,7}};
		
		for (int[] rows : data) {
			
			for (int cell : rows) {
				
				System.out.print(cell +" ");
				
			}
			
			
		}
		
		System.out.println();
		
		
		
		
		
		for (int i = 0; i < data.length; i++) {
			
			System.out.print("Row number "+ (i+1)+": ");
			
			for (int j = 0; j < data[i].length; j++) {
				
				System.out.print(data[i][j]+" ");
				
			}
		System.out.println();
		}
		
	}

}
