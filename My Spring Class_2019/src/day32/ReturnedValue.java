package day32;

public class ReturnedValue {

	public static void main(String[] args) {
		
		
		
		givemeLastChar("Batyr");
		
		System.out.println();
		
		
		char cLast = givemeLastChar("Batyr");
		System.out.println(cLast);
		System.out.println(cLast+""+cLast);
	}

	public static char givemeLastChar(String name) {
		
		
		char last = name.charAt(name.length()-1);
		
		System.out.println(last);
		
		return last;
		
	}
	
	
}
