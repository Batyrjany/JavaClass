package day16;

public class warmUpTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = "Sunday is Java Day";
	System.out.println(str.toUpperCase());
	int count=str.length();
	System.out.println(count);
	System.out.println(str.indexOf("is"));
	System.out.println(str.indexOf("Java"));
	
	
	System.out.println(str.contains("Java"));
	System.out.println(str.indexOf("Java")>-1);//the same, if index is more than
	                                           // -1(which is no index) the you will 
	                                           // get that str contains the the word
	
	char  last = str.charAt(count-1);
	char  beforeLast = str.charAt(count-2);
	
	System.out.println(""+beforeLast+last);
	System.out.println(str.substring(count-2, count));

	System.out.println(str.toLowerCase().contains("java"));
	String low = str.toLowerCase();
	System.out.println(low.contains("java"));
	
	
	
	
	
	}

}
