package day35;

public class MethodOverloadingExamples {

	 public static void main(String[] args) {
		    
		    String name = "Java";
		    
		    System.out.println(  name.indexOf("a") );
		    System.out.println(  name.indexOf("a",2) );
		    
		    System.out.println(  name.replace('a', 'B')    );
		    System.out.println(  name.replace("va", "java")    );
		    System.out.println();
		    
		    
		  
		    System.out.println(nums(5,6));
		    System.out.println();
		    System.out.println(nums(3,5,9));
		    System.out.println();
		    nums(3,5,9,2);

		  }

	 
	 public static int nums(int n, int n2) {
		
//		 n=5;
//		 n2=6;
		 int sum = n+n2;
		 
		 return sum;
		 
		 
	 }
	 public static int nums(int num, int num2, int num3) {
			
		 
//		 num=3;
//		 num2=5;
//		 num3=9;
		
		 int sum1 = num+num2+num3;
		 
		 return sum1;
		 
		 
	 }
 public static void nums(int x, int y, int z, int w) {
			
		 
//		 x=3;
//		 y=5;
//		 z=9;
//		 w=2;
		
		 System.out.println( x+y+z+w);
		
		 
		 
	 }
		}
