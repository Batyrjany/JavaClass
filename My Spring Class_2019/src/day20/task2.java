package day20;

public class task2 {

	public static void main(String[] args) {
		

		

		String mix = "AonLine132X";
      
		String LetterStr = "";
		int  x = 0;
		
		while(x<mix.length()) {
			char c = mix.charAt(x);
			
			if(c>='A' && c<='Z') {
				
				System.out.println(c);
				LetterStr = LetterStr+c;
			}
			
			
			x++;
			
		}
		System.out.println(LetterStr);
		
		
	}

}
