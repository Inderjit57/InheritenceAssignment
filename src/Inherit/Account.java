// Account Class verify the Login function
package Inherit;

public class Account {

	boolean isValid;
	private String validAccountNumber = "1234";
	private String validPassword = "12345";

	public Account() {
		System.out.println("Start Verification");
	}

	public String getAccLogin(String accountNumber, String password) {
		if (accountNumber.equals(validAccountNumber) && password.equals(validPassword)) {
			isValid = true;
			return "";
		} else {
			isValid = false;
			return "";
		}
	}

}
