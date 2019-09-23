package Assignments;

import java.util.ArrayList;

public class replit198 {

	public static void main(String[] args) {
		
		ArrayList <Boolean>b = new ArrayList<>();
		b.add(true);
		b.add(false);
		b.add(false);
		
		repeatAL( b);
	}

	
	public static void  repeatAL(ArrayList<Boolean> b) {
	
		b.addAll(b);
		System.out.println(b);
	}
}
