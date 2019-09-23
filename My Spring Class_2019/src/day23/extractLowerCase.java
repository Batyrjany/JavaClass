package day23;

public class extractLowerCase {

	public static void main(String[] args) {
		

		
		String str = "5 Little Monkey Jumping on The Bed";
		
		
//		char eachChar ='H';
//		
//		System.out.println(eachChar>='a');
//		
//		System.out.println(eachChar<='z');
//		
//		
//		if(eachChar>='a' && eachChar<='z') {
//			
//			
//			System.out.println("IT'S lower case");
//			
//		}
//		System.out.println("THE END");
//
//	
	
	
	
	char lcase = 'a';
	String alllowercase="";
	for(int i = 0; i<str.length(); i++) {
		char lcase1=str.charAt(i);
		if(lcase1>='a' && lcase1<='z') {
		
			System.out.println("it's lowercase : "+ lcase1);
		}
	}
	}

}
