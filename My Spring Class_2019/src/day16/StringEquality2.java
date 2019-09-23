package day16;

public class StringEquality2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// STRING POOL IS A SPECIAL LOCATION INSIDE HEAP
		
		// TO STORE UNIQUE STRING LITERAL
		
		
		
		
		String s1 = "abc"; //  using string literal
		String s2 =  new String("abc");//using new keyword
		String s3 = "abc"; 
		

		
		System.out.println( s1==s2 );//FALSE, S1 IS STRING LITERAL, S2 IS IN NEW KEYWORD
		
		System.out.println( s1==s3 );// TRUE,  BECAUSE IN BOTH S1 AND S3 USING STRING LITERAL
		

	

		
	}

}
