package day38;

import java.util.ArrayList;

public class ArrayListTask3 {

	public static void main(String[] args) {
		


   ArrayList<Integer> num = new ArrayList<>();
		
		
		
		for (int i = 1; i <=100; i++) {
			
			num.add(i);
			
		}
		
		System.out.println(num);
		
		System.out.println();
		
   ArrayList<Integer> num1 = new ArrayList<>();
		
		for (int i = 100; i>0; i--) {
			
			num1.add(i);
			
		}System.out.println(num1);
	
	
		System.out.println("----------------------");
		
		
		for (int i = 0; i < num1.size(); i++) {
			
			//num.add(num1.get(i));
			
			  Integer eachIn = num1.get(i);
			  num.add(eachIn);
			
		}System.out.println(num);
	
	
	
	
	
	}

}
