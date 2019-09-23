package day16;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	                //01234567890123456789	
		String str = "Ahmad Omar Al Alousi";
		
		// give me part of string from location 6 till 10
		
		int space1 = str.indexOf(" ");
		int space2 = str.indexOf(" ",space1+1);
		int space3 = str.indexOf(" ",space2+1);

		
		String word = str.substring(space1+1,space2);
		System.out.println(word);
		
		String word2 = str.substring(space2+1,space3);
		System.out.println(word2);
		
		
		System.out.println(str.indexOf("A"));
		System.out.println(str.indexOf("A",1));
		System.out.println(str.indexOf("A",10));
		System.out.println(str.indexOf("A",11));
		System.out.println(str.indexOf("A",12));
		
	}

}
