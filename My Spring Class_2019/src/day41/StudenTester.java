package day41;

import day40.BankAccount;

public class StudenTester {

	public static void main(String[] args) {
		

		Student batyr = new Student();
		
		batyr.name="Batyr";
		batyr.age =36;
		batyr.ssn = 7778899L;
		
		batyr.giveName();
		batyr.giveAge();
	
		
		batyr.giveSSN();// private class will not compile when it's private class
		                // default class will compile when it is in one package else will not
		
		
		//we have to import the claas which is in the other package
		BankAccount acc1 = new BankAccount();
		
		//acc1.add100Dollar();
	}

}
