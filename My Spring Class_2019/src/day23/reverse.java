package day23;

public class reverse {

	public static void main(String[] args) {
		
String str = "Batyr";


String reversed = "";
String reversed1 = "";	
	
for (int i= str.length()-1; i>=0 ; i--)
		
		reversed+=str.substring(i, i+1);
	
	System.out.println(reversed+" ");
	
	
	
	
	for (int i =str.length()-1; i>=0; i--)
		
		reversed1 += str.charAt(i);
	System.out.print(reversed1);
	
	}

}
