package day15;

public class charToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'A';
		int cNum = c1;
		System.out.println(cNum); // itwill give ascii dec value of the character
		
		
		
		
		String name = "Batyr";
		char f1= name.charAt(0);
		char l1= name.charAt(name.length()-1);
		int n1=f1;
		int n2 = l1;
		
		System.out.println(f1);
		System.out.println(l1);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(f1+l1);//adding ascii dec of char(66+144)
		System.out.println(f1+""+l1); // +""+
		//****or
		System.out.println(""+f1+l1); // ""+ 
		System.out.println("Sum of ASCII code is:"+f1+l1); // it won't give the sum of ASCII 

		
		
		
		
		char character0 = '0';
		int zeroAsciiNumber = character0;
		System.out.println(zeroAsciiNumber);
		
		char characterA = 'A';
		System.out.println((int) characterA);
		
	}

}
