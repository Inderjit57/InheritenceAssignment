// Credit Class does the money withdrwal and Calculate interest function only
package Inherit;

import java.util.Scanner;

public class Credit extends Account {
	Scanner sc = new Scanner(System.in);
	private int creditCardNum = 222333;
	private double balanceAvaliable;
	private double creditLimit;
	private double interestCharge = 0.22;
	public int cvc;

	public Credit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	// Getter and Setter for updating CardNumber
	public int getCreditCardNum() {
		return creditCardNum;
	}

	public int setCreditCardNum(int cardNum) {
		this.creditCardNum = cardNum;
		return creditCardNum;
	}

	public double balance() {
		System.out.println("Credit Card num is: "+getCreditCardNum());
		System.out.println("Enter credit amount to use");
		double moneyWithdrawal = sc.nextDouble();
		balanceAvaliable = (creditLimit - moneyWithdrawal);
		System.out.println(
					"Annual interest charge on :" + moneyWithdrawal + " = " + (moneyWithdrawal * interestCharge));
			return balanceAvaliable;
	}
	public double getBalanceAvaliable() {
		return balanceAvaliable;
	}

	public double setBalanceDeposit(double moneyDeposit) {
		
		return (balanceAvaliable + moneyDeposit);

	}

}
