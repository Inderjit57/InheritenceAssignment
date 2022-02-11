// Debit Class does the withdrwal function only
package Inherit;

import java.util.Scanner;

public class Debit extends Account {
	Scanner sc = new Scanner(System.in);

	private int cardNum = 444555;
	private double balance;
	public double remainingBalance;
	private double moneyWithdraw;
	public boolean isBalanceMore;

	public Debit(double balance) {
		this.balance = balance;
	}

	// Getter and Setter for updating CardNumber
	public int setCardNum(int cardNum) {
		this.cardNum = cardNum;
		return cardNum;
	}

	public int getCardNum() {
		return cardNum;
	}

	// Getter method to widthdraw money and show remaining balance
	public double getWithdrawalTransaction() {
		System.out.println("Debit cardnumber: " + getCardNum());
		System.out.println("Enter money to withdraw");
		moneyWithdraw = sc.nextDouble();
		if (moneyWithdraw < balance) {
			isBalanceMore = true;
			remainingBalance = (balance - moneyWithdraw);
			return remainingBalance;
		} else {
			isBalanceMore = false;
		}
		return 0;
	}

}
