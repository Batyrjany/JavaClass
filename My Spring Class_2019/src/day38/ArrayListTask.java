package day38;

import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {
		

		ArrayList<Integer> num = new ArrayList<>();
		
		
		
		for (int i = 1; i <=100; i++) {
			
			num.add(i);
			
		}
		
		System.out.println(num);
		
		
		int sum = 0;
		
		for (int i = 0; i < num.size(); i++) {
			
			
			sum+=num.get(i);
		}
		
        System.out.println();   
		
		int average = sum/num.size();
            
            System.out.println("the average is "+ average);
	}

}
