package Assignments;

public class replit172 {

	public static void main(String[] args) {
		

		String a="apple";
		String b = "orange";
		System.out.println(biggerS( a , b));
		
		
		
	}
	
	
	
	public static String biggerS(String a ,String b)
	  {
		
		String c= "";
		if(a.length()>b.length()) {
			c=a;
		}else {
			c=b;
		}
		
		//System.out.println(c);
		
		
		
		return c;
	   
	  }
}
