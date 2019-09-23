package day14;

import java.util.Scanner;

public class StringReview {

	public static void main(String[] args) {
		/*
		 * 
		 * String class methods
		 * all except primitive types are 
 		 * also called refferal
		 * 
		 * 
		 * 
		 * 
		 * 1. length();
		 * 2. toUpperCase();
		 * 3. toLowerCase();
		 * 4. charAt(index);
		 * 5. equality
		 * 6. contains
		 * 7. indexOf
		 * 
		 * 
		 */
Scanner scan = new Scanner(System.in);

String name = "Batyr";


// 1. length();


System.out.println(name.length());

// 2. toUpperCase();


System.out.println(name.toUpperCase());

// 3. toLoweCase();


System.out.println(name.toLowerCase());

// 4. charAt(index);

System.out.println(name.charAt(0));
System.out.println(name.charAt(1));
System.out.println(name.charAt(2));
System.out.println(name.charAt(3));
System.out.println(name.charAt(4));

// 4. ******OR*****

char c1= name.charAt(0);
char c2= name.charAt(1);
char c3= name.charAt(2);
char c4= name.charAt(3);
char c5= name.charAt(4);

System.out.println(c1);
System.out.println(c2);
System.out.println(c3);
System.out.println(c4);
System.out.println(c5);

// 5. str.equal("value")

System.out.println(name.equals("Batyr"));
System.out.println(name.equalsIgnoreCase("Batyr"));

// 6. contains

System.out.println(name.contains("at"));

// 6.  ******OR******

boolean containsOrNot = name.contains("at");

System.out.println(containsOrNot);

// 7. indexOf

System.out.println(name.indexOf("a"));

// will show you the first letter's index only

System.out.println(name.indexOf("ty"));

//will show -1 when the char which entered is abcent

System.out.println(name.indexOf("wty"));

String uName=name.toUpperCase();

System.out.println(uName.indexOf("BATYR"));

System.out.println(name.toUpperCase().indexOf("BA"));



















scan.close();
	}

}
