package Inherit;

import java.util.Scanner;

public class Account {
	Scanner sc = new Scanner(System.in);

	boolean isValid;
	private String validAccountNumber = "222333";
	private String validPassword = "12345";

	public Account() {
		System.out.println("Start Verification");
	}
	
	// Account verification
	public String getAccLogin() {
		System.out.println("Enter Account user number");
		String accountNumber = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		if (accountNumber.equals(validAccountNumber) && password.equals(validPassword)) {
			isValid = true;
			return "";
		} else {
			isValid = false;
			return "Invalid";
		}
	}
	

}
