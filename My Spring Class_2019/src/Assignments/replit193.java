package Assignments;

public class replit193 {

	public static void main(String[] args) {
		
String check ="Nurses Run";

System.out.println(isPalindrome(check));
	

	}
	public static boolean isPalindrome(String check) {
		
		boolean pal=true;	
		String rev ="";	

			for (int i = check.length()-1; i >= 0; i--) {
				rev+=check.charAt(i);
				if(rev.replaceAll(" ", "").equalsIgnoreCase(check.replaceAll(" ", ""))) {
					pal=true;
				}else {
					pal=false;
				}
			}//System.out.println(pal);
		
		
		return pal;
	    
	  }
}
