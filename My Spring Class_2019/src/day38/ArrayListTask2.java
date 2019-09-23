package day38;

import java.util.ArrayList;

public class ArrayListTask2 {

	public static void main(String[] args) {
		
      
		
		
		ArrayList<Integer> num1 = new ArrayList<>();
		
		for (int i = 1; i <=100; i++) {
			
			num1.add(i);
			
		}System.out.println(num1);
		
		
		int count =0;
		for (Integer each : num1) {
			
			
			if(each%3==0 && each%5== 0)
				count++;
		}System.out.println("The target count is : "+ count);
	}

}
