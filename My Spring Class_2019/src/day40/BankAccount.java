package day40;

public class BankAccount {



		// 2 instance variable/fields  
		  String accountHolder; 
		  double balance;
		  
		  
		  // create an instance method(non-static method)
		  // called showAccountHolder --> printOut Account Holder name
		  
	public void showAcountHolder() {
		System.out.println("Account holder name is: "+ accountHolder);
	}
		  

		  // create an instance method showBalance and print out the balance 
	
	public void showBalance() {
		System.out.println("Account balance is: "+ balance);
	}
	
	
	  // OPTIONAL 
		  // create an instance method called add100Dollar does not accept any parameters 
		  // and return no value 
		  // increase the balance of the account by 100 ; 
	public void add100Dollar() {
		 //void add100Dollar()  {// default will not compile in another package
			// private void add100Dollar() {// private will ot compile out of it's class
			 
			 balance += 100;
	}
		
		  public void addDollar(int amount) {
			  balance+=amount;
			  
		  }
		  // Create another class called BankActivity with main method 
		  // create bank account object 
		  // set account holder name and balance value 
		  // call your showAccountHolder and showBalance method
		  
		  // OPTIONALLY CALL YOUR add100Dollar 
		  // and call your showBalance method again to see whether balance has changed 
		 
}
