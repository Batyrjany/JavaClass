package day30;

public class MethodWithParameters {

	public static void main(String[] args) {
		
//          String s = "abc";
//
//       System.out.println(s.substring(1, 3));
		
		
          printTheSum(10.5,20.9);
          printTheSum(11.5,200.9);
          printTheSum(103.5,202.9);
          
          reportName ("Batyr", "Janyyev");
		
	}

	public static void printTheSum(double a, double b) {
		
	
	double sum = a+b;
	
	System.out.println("The sum of numbers "+a+" and " + b+" is "+ sum);
	
	}
	
	public static void reportName (String name, String name1) {
		
		
		 int l = name.length();
		 int l1 = name1.length();
		 char c = name.charAt(0);
		 char c1 = name1.charAt(0);
		 int count = 0;
		 
		 
		System.out.println(l + " " + l1);
		System.out.println(c+" "+ c1);
		
		
		for (int i = 0; i<name.length() ; i++) {
			System.out.print(name.charAt(l-1-i) );
		}
		
		
		System.out.println();
		
		for (int j = name1.length()-1; j >= 0; j--) {
		
//	count--;

			System.out.println(""+j+"iteration of name1:" + name1.charAt(j) );
		}
		
	}

		
	}
