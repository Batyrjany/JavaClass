package day16;

public class IsEmptyMethod {

	// str.length()>0 ====>> isEmpty
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "";
		System.out.println(str.isEmpty()); // true
		
		String str2 = "xx";
		System.out.println(str2.isEmpty()); // false
    	
		String str3 = " ";
		System.out.println(str3.isEmpty()); // false

		
		
		String actualResult = "Amazon.com "+"";
		
	}

}
