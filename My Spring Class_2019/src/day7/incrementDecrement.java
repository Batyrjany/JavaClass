package day7;

public class incrementDecrement {

	public static void main(String[] args) {
		// increment----increasing value by one ++ b++ ++b
		// decrement----decreasing value by one -- b-- --b
		// if ++ comes after variable name -- post increment, it means
		// increase the value and only reflect the change next time
		// variable showed again
		// if ++ comes before variable name -- pre increment, it means
		// increase the value right away and reflect the change right away
		
		
		int x = 3;
	    
		 //x=++x;
		//System.out.println(x++);
		//int result = x++ + 5;
		//int result = ++x + 5;
		
		//System.out.println(result);
		
		//x= x++ + ++x;
		x = x++ + --x + x-- + x;
		
		System.out.println(x);
		
		
		
		
		//System.out.println(++x); pre increment reflect it right away
		//System.out.println(x--); post decrement
		//System.out.println(x); 
		//System.out.println(--x);
		
	}

}
