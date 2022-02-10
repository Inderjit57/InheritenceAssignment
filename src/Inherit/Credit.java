// Credit Class does the money withdrwal and Calculate interest function only
package Inherit;

import java.util.Scanner;

public class Credit extends Account {
	Scanner sc = new Scanner(System.in);
	private int creditCardNum = 123456789;
	private double balanceAvaliable;
	private double creditLimit;
	private double interestCharge = 0.22;
	private double balanceDeposit;
	public int cvc;

	public Credit(double creditLimit) {
		System.out.println("Credit card number: " + creditCardNum);
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
		System.out.println("Enter credit amount to use");
		double moneyWithdrawal = sc.nextDouble();
		balanceAvaliable = (creditLimit - moneyWithdrawal);
		System.out.println("What is the CVC for Debit card");
		int cvc = sc.nextInt();
		if (cvc == creditCvc) {
			System.out.println(
					"Annual interest charge on :" + moneyWithdrawal + " = " + (moneyWithdrawal * interestCharge));
			return balanceAvaliable;
		}
		return 0;
	}
	public double getBalanceAvaliable() {
		return balanceAvaliable;
	}

	public void getBalanceDeposit() {
		System.out.println(balanceDeposit);
	}

	public double setBalanceDeposit(double moneyDeposit) {
		balanceDeposit = moneyDeposit;
		return (balanceAvaliable + moneyDeposit);

	}

}
