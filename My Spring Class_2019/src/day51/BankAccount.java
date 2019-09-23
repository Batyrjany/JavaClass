package day51;

public class BankAccount {

	String accountName;
	long accountNumber;
	double balance;
	public BankAccount(String accountName, long accountNumber, double balance) {
	
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		
	}
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
	public void deposit(int param) {
		this.balance+=param;
	
		
	}
	public void withdraw(int param) {
		this.balance-=param;
		
		
	}

	public static void main(String[] args) {
		BankAccount b = new BankAccount("1234",123456789L, 1000);
		SavingAccount s = new SavingAccount("Batyr",123456L,1200, 2.3);
		
		System.out.println(b);
		System.out.println(b.accountName);
		b.withdraw(100);
		System.out.println(b.balance);
		System.out.println("-----");
		System.out.println(s);
		s.deposit(10);
		System.out.println(s.balance);
		
	}
		

		

	}




