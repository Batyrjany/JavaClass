package Assignments;

import java.util.ArrayList;

public class replit183 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> dubs = new ArrayList<>();
		
		
		dubs.add(12.23);
		dubs.add(25.13);
		dubs.add(56.41);
		dubs.add(11.03);
		
		test(dubs);
		
	}
	public static void test(ArrayList<Double> dubs)
	{
		//write code here
		dubs.remove(0);
		dubs.remove(0);
		System.out.println(dubs);
	}
}
