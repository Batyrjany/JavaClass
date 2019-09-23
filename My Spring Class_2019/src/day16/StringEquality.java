package day16;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "abc"; //  using string literal
		String s2 =  new String("abc");//using new keyword
	
		
		System.out.println( s1==s2 );//will show false because string
		                              //cannot asked for equality
		                             //both have different addresses
		
		String s3 =s1;
		System.out.println( s1==s2 );//the same , both have different addresses
		System.out.println( s1==s3 );// it true because s1 was reassigned with new String s3
	                                 // s1 and s3 have the same address
	
	

	
	
	
	}

}
