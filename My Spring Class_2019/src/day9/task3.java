package day9;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String username="batyr", password="123"; 
		String admin_user = "merdan";
		System.out.println("Enter username and password");
		String n1=scan.next();
		String n2=scan.next();
	
		boolean b = n1.equals(username);
		boolean b1 = n2.equals(password);
        boolean b2=n1.equals(admin_user);
	if(b && b1) {
		System.out.println("login match");
	}else if (b2 ){
		System.out.println("admin user logged in");
	}else {
		System.out.println("invalid");
	}
	}

}
