package day30;

public class NumberGame {

	public static void main(String[] args) {
		
		
		
		// TASK 2
		/*
		 * 
		 * 2.1
		 * Create a static method with no return type
		 * called printTheDoubledNumber
		 * it takes 1 int as a parameter
		 * and it will print out doubled number on the console 
		 * 
		 * 2.2
		 * 
		 * create another static method with no return
		 * called checkForAge 
		 * it takes 1 int age as a parameter
		 * inside the body, check whether the age is more than 18
		 * if the age is more than 10 -->> print adult
		 * if not print  no an adult
		 * 
		 */
		
		
		int i=21;
		printTheDoubledNumber(10); //-->> 20
		checkForAge(21); // -->> adult
		checkForAge(i);
		checkForAge(17);
		
		
	}

	                                       // parameter
	public static void printTheDoubledNumber (int num) {
		// body goes here
		
		
		int doubledNum = num*2;
		System.out.println(num+" was doubled -->> "+doubledNum);
		
	}
	
	
	public static void checkForAge (int age) {
		
		
		//int i  =age;
		
		if(age>18) {
			System.out.println("adult");
		}else {
			System.out.println("not adult");
		}
		
	}
	
}
