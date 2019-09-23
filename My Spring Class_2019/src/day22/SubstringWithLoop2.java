package day22;

public class SubstringWithLoop2 {

	public static void main(String[] args) {
	

		
		//TASK 3
		// ABCDE ---->>>>AB BC CD DE
		
		String str= "ABCDEBCD";
		
		int i = 0;
		int l = str.length();
		
	for (i=0; i<l-1; i++) {
	
	String one = str.substring(i,i+2);
	
	if(i!= l-2) {
		System.out.print(one+"-");
	}else {
		System.out.print(one);
	}
	
	
	}

	}
}
