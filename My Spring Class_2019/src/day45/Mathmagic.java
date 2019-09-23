package day45;

import day44.MathEquation;

public class Mathmagic {

	public static void main(String[] args) {
		

		
		MathEquation2 oper =new MathEquation2(12.12,56.18, '+');
		MathEquation2 oper1 =new MathEquation2(12.08,56.00, '-');
		MathEquation2 oper2 =new MathEquation2(23.13,77.1, '*');
		MathEquation2 oper3 =new MathEquation2(41.22,6.33, '/');

		oper.calculate();
		System.out.println(oper.getResult());
		
		oper1.calculate();
		System.out.println(oper1.getResult());
		
		
		System.out.println("------------");
		oper.calculateX(100,200);
		System.out.println(oper.getResult());
		
		oper1.calculateX(130,100);
		System.out.println(oper1.getResult());
		
		
		
		
		
		
		
		
	}

}
