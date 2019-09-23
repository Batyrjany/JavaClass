package day22;

public class SubstringWithLoop {

	public static void main(String[] args) {
		
		
		
		
//TASK 2
		//
		
		
		
		
		String str = "ABCDEFGHIJKL";
		
		//print two letters at a time.
		
		
		int x = 0;
		
	int l =str.length();
	
	
	for (x=0; x<l; x+=2) {
		String eachtwo = str.substring(x, x+2);
		if(x!=l-2) {
			System.out.print(eachtwo+"-");
		}else {
			System.out.print(eachtwo);
		}
	}
	
		
	}

}
