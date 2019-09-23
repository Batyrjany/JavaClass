package day31;

public class warmUp {
	
	
	
	
	public static void countFrom1To10() {
		
		
		for (int i = 0; i <=10; i++) {
			
			
			System.out.println(i+" ");
		}
				
				System.out.println();
		
	}

	public static void countFrom1ToN(int n) {
		
		//int n = 5;
		
		for (int i = 1; i <=n; i++) {
					
					
					System.out.print(i+" ");
				}
						
						System.out.println();
		
		
	}
	
	public static void countDown(int n) {
		
		//int n =10;
		for (int i = n; i >=1; i--) {
			
			
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		

		countFrom1To10();
		
		countFrom1To10();
		
		countFrom1ToN(20);
		
		countFrom1ToN(7);
		
		countDown(8);
		
	}

}
