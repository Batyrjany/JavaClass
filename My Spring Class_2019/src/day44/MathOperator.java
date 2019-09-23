package day44;

import java.util.Arrays;

public class MathOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathEquation oper =new MathEquation(12.12,56.18, '+');
		MathEquation oper1 =new MathEquation(12.08,56.00, '-');
		MathEquation oper2 =new MathEquation(23.13,77.1, '*');
		MathEquation oper3 =new MathEquation(41.22,6.33, '/');

		
		MathEquation[] arr =  {oper,oper1,oper2,oper3};
	for ( MathEquation each : arr) {
		each.calculate();
		
		System.out.println(each.getResult());
		
		
		System.out.println(each);
		
	}
	System.out.println("----------");
	
	System.out.println(Arrays.toString(arr));
	}

}
