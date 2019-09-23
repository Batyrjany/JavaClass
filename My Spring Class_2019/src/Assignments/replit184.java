package Assignments;

import java.util.ArrayList;

public class replit184 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> words = new ArrayList<>();
		
		
		words.add("hello");
		
		words.add("hallo");
		
		words.add("hullo");
		
		words.add("hiello");
		
		test(words);
	}
	
	
	public static void test(ArrayList<String> words)
	{
		//write code here
		words.add(0,"hey");
		words.add(3,"yo");
		System.out.println(words);
	}
}
