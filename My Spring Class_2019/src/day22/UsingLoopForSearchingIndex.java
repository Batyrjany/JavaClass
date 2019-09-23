package day22;

public class UsingLoopForSearchingIndex {

	public static void main(String[] args) {

		
		
		String str = "ABCAADKAB";
		
		
		// TASK 1 :
		//loop through character using substring
		//and print them out with - in between
		// avoid the dash in the last character
		
		
		int l = str.length();
		
		int x = 0;
		
		
		for(x=0; x<l ; x++) {
		
	   
			
			if(x!= l-1) {
			System.out.print(str.substring(x,x+1)+"-");
			}else {
				System.out.print(str.substring(x,x+1));

			}
				
			
				
			
	
		
		

		}
		
	}

}
