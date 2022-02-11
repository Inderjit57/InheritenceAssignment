// Account Class verify the Login function
package Inherit;

import java.util.Scanner;

public class Account {
	Scanner sc = new Scanner(System.in);

	boolean isValid;
	private String validAccountNumber = "1234";
	private String validPassword = "12345";

	public Account() {
		System.out.println("Start Verification");
	}

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
