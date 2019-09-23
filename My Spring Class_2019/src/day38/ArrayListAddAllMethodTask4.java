package day38;

import java.util.ArrayList;

public class ArrayListAddAllMethodTask4 {

	public static void main(String[] args) {
		

		
			


			   ArrayList<Integer> num = new ArrayList<>();
					
					
					
					for (int i = 1; i <=5; i++) {
						
						num.add(i);
						
					}
					
					System.out.println(num);
					
					System.out.println();
					
			   ArrayList<Integer> num1 = new ArrayList<>();
					
					for (int i = 6; i>0; i--) {
						
						num1.add(i);
						
					}System.out.println(num1);
				
				System.out.println("---------------------");
					
				
				
				/// addAll method of ArrayList class
				/// this will add all item from num1 to num	
					
				//	num.addAll(num1);
				
				
			//	System.out.println(num);
				
				//System.out.println();
				
				
				
				/// addAll method of ArrayList, second overloaded version
				/// this will add all item from num1 to num	
				
				num.addAll(3, num1);
				
				System.out.println(num);
				}

			}
