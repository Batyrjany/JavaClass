package day51;

public class SavingAccount extends BankAccount {

	
	double returnRate;
	public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {
		super(accountName, accountNumber, balance);
		this.returnRate=returnRate;
		
		
	}
	@Override
	public String toString() {
		return "SavingAccount [returnRate=" + returnRate + ", accountName=" + accountName + ", accountNumber="
				+ accountNumber + ", balance=" + balance + "]";
	}
	@Override
	public void deposit(int param) {
		//this.balance+=param+100;
		//super.deposit(param);
	 super.deposit(param);
	}
	@Override
	public void withdraw(int param) {
	this.balance-=param-10;
		//super.deposit(param);
		
		super.deposit(param-10);
		
	}
	
	
}
