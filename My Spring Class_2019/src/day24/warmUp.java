package day24;

public class warmUp {

	public static void main(String[] args) {
		

		
		for(int i=1; i<=5; i++) {
			String a = "java";
			
			System.out.println("\n"+"iteration : " +i);
			for(int j=0; j<6; j++)
				
				System.out.print(a+" ");
			
		}
		
		System.out.println();
		
		
		
		for (int y = 1; y<=5; y++) {
			
			for (int z = 1; z<=y; z++) {
			
				System.out.print(" "+z);
				
		}
			System.out.println();
					

	}

		
	
		
        //for(int f = 1; f<=26; f++) { the same
		
		for (int q=1; q<=10; q++) {
		for(int f = 'A'; f<='Z'; f++) {
			
			
		for (int c = 'A'; c<=f; c++) {	
				System.out.print((char)c+" ");
				
		}
			System.out.println();
					

	}
	}
					

	}		
		
}
