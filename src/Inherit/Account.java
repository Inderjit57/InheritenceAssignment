package Inherit;

import java.util.Scanner;

public class Account {
	Scanner sc = new Scanner(System.in);

	boolean isValid;

	public Account() {
		System.out.println("Start Verification");
	}

//	public String accountLogin;
//	public String accountPassword;
	public String validAccountNumber = "1234";
	public String validPassword = "12345";

	public String setAccLogin() {
		System.out.println("Enter Card number");
		String accountNumber = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		if (accountNumber.equals(validAccountNumber) && password.equals(validPassword)) {
			isValid = true;
			return "";
		} else {
			isValid = false;
			
		}
		return "Invalid";
	}

//	public String getAccNum() {
//		return accountLogin;
//	}

}
