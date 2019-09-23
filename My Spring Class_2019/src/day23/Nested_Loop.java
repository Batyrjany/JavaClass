package day23;

public class Nested_Loop {

	public static void main(String[] args) {
		
// DRY PRINCIPLE ______>>> DO NOT REPEAT YOURSELF
		
		
		
		
		
		 for (int j = 0; j < 3; j++) {
			    
		      for (int i = 1; i < 6; i++) {
		        System.out.print(i + " ");
		      }
		      System.out.println();
		    
		    }
		
		 
		 for (int j = 0; j<4; j++) {
			 
			 
			System.out.println( ""+"\n"+"iteration "+ (j+1));
			 for(int i=15; i>4; i--)
				 System.out.print(i+" ");
			 
		 }
		 System.out.println();
		 
	}

}
