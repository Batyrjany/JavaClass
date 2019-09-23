package Account;

import java.util.Scanner;

public class Login {

	public boolean login(Account account) {
		
		Scanner scan = new Scanner (System.in);
		
		String user_name;
		String password;
		
		System.out.print("Please Enter Your User Name :");
		user_name= scan.nextLine();
		System.out.print("Please Enter your Password :");
		password= scan.nextLine();
		
		
		
		if(account.getUser_name().equalsIgnoreCase(user_name) && account.getPassword().equals(password)) {
			
			return true;
		}else {
		
		return false;
		}
	}
	
}
