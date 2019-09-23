package day19;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		  
	    // while loop 
	    // do while 
	    // for loop  // for each loop 
	    
//	    int x = 1 ; 
//	    while(x<6) {
//	      System.out.println( x++ );
//	    }
	    /*
	     *do {
	       action to be repeated
	       } while (a condition is true );
	     * 
	     * COMPARE TO WHILE LOOP 
	     * Do while loop 
	     * check the condition after the first iteration 
	     * 
	     * */
	    Scanner scan = new Scanner(System.in);
	    System.out.println("what is the target");
	    
	    int y = 1 ; 
	    int target = scan.nextInt();

	    do {
	      
	      System.out.print(y  + " ");
	      y +=2 ; 
	      
	    }while(y<= target) ;
	    /*        y     y after iteration   
	     * iter 1  --   1       2               2<=5
	     * iter 2  --   2       3               3<=5
	     * iter 3  --   3       4               4<=5
	     * iter 4  --   4       5               5<=5
	     * iter 5  --   5       6               6<=5
	     * */
	    
	    System.out.println();
	    
	    System.out.println("y value: " + y);  // 6 
	    do {
	      y -= 2 ; 
	      System.out.print( y + " ");
	    } while ( y > 1);
	    
	    /*        y     y after iteration   
	     * iter 1  --   5      5>1             
	     * iter 2  --   4      4>1       
	     * iter 3  --   3      3>1       
	     * iter 4  --   2      2>1       
	     * iter 5  --   1      1>1       
	     * */
	    
		
		
		
	}

}
