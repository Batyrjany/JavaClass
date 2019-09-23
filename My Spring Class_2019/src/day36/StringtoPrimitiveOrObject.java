package day36;

public class StringtoPrimitiveOrObject {

	public static void main(String[] args) {
		


		/*
		 * From string to primitives
		 * parseX method will take String
		 * and return -->primitive value
		 */
		
		String str1 = "True" ;
		
		//String str1 = "ABC" ;
		
	boolean	b1 = Boolean.parseBoolean(str1);
	boolean b2 = Boolean.parseBoolean("ABC");
	boolean b3 = Boolean.parseBoolean("True");
	
	System.out.println(b1);
	System.out.println(b2);	
	System.out.println(b3);
	
	/*
	 * From String to wrapper Class object
	 * valueOf method will take String
	 * and return-->Wrapper class object
	 * 
	 */
	System.out.println();
	   String d = "3.14";
	   Double d1 = Double.valueOf(d);
	   System.out.println(d1.toString());
	   double d2 = d1 ;//--> auto Un boxing
	   
	   
	   // invalid conversation*****
	   //System.out.println(Double.parseDouble("3.14abc"));
		
		
		
	}

}
