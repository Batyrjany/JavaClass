package day34;

public class warmUp {

	public static void main(String[] args) {
		
		
		
		
		
		System.out.println(isPalindrome("hannah"));
		System.out.println(isPalindrome("race car"));
		System.out.println(isPalindrome("Batyr"));
		

	}
public static boolean isPalindrome(String name) {
	
	
	String reversed="";
	name = name.replaceAll(" ", "");
	
	for (int i = name.length()-1; i >=0; i--) {
		
		reversed+=name.charAt(i)+"";
	}System.out.println(reversed);
			
	boolean b =true;
	if(reversed.equals(name)) {
		
		b=true;
	}else {
		b=false;
	}
	//return b;
	
	return reversed.equals(name);
}



}
