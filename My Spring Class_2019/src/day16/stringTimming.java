package day16;

public class stringTimming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  str = "   GOO   JAVA SPARTAN  ";
		System.out.println(str);
		
		
		// get JAVA SPARTAN from above string
		//System.out.println(str.trim());
		
		
		
		int indexO = str.lastIndexOf("O");
		String part = str.substring(indexO+1);
		
		
		System.out.println(part);// with spaces
		System.out.println(part.trim());// trimmed out of spaces

		System.out.println(str.substring(indexO+1)   );// with spaces
		System.out.println(str.substring(indexO+1).trim()   );// trimmed out of spaces

	}

}
