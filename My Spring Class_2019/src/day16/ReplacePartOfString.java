package day16;

public class ReplacePartOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Date is  03_25_2019";
		
		
		System.out.println(str.replace('_', '-'));
		
		
		System.out.println(str.replace("is", "will be"));

		System.out.println(str.replace(str, "03_25_2019"));

		
		
		
		
		String str2 = "AAAAAABBBBBBCCCCC";
		
		System.out.println(str2.replace('A', 'Z'));//will replace all A we have

		
		
		
	}

}
