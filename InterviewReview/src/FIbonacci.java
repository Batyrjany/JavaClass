
public class FIbonacci {

	public static void main(String[] args) {
		

		int n1 = 0 ;
		int n2 = 1 ;
		int n3     ;
		int n  = 10;
		
		for (int i = 0; i < n; i++) {
			
			
			System.out.println(n1 + " ");
			
			n3 = n1 + n2 ;
			
			n1 = n2 ;
			 
			n2 = n3 ;
			
		}

		
	}

}
