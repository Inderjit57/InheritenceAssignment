package Inherit;

import java.util.Scanner;

public class Credit extends Account {
	Scanner sc = new Scanner(System.in);
	private int creditCardNum = 123456789;
	private double balanceOwe;
	private double creditLimit;
	private double interestCharge = 0.22; // Assumed Annual Interest Rate

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

	public double balanceOwe() {
		System.out.println("Enter credit amount to use");
		double moneyWithdrawal = sc.nextDouble();
		balanceOwe = (creditLimit - moneyWithdrawal);
		System.out.println("Annual interest charge on :" + balanceOwe + " = " + (balanceOwe * interestCharge));
		return balanceOwe;
	}
}
