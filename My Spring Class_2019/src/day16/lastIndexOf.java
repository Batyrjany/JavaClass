package day16;

public class lastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                //0123456789012
	String str = "Java is fun !";
	
	// give me part of string from location 6 till 10

	int index = str.lastIndexOf(" ");
	System.out.println("Last lastIndex is "+index);//Last lastIndex is 11
	
	System.out.println("Last lastIndex is "+str.lastIndexOf("a"));//Last lastIndex is 3
	
	}

}
