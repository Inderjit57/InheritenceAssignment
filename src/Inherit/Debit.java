// Debit Class does the withdrwal function only
package Inherit;

public class Debit extends Account {

	private int cardNum = 444555;
	private double balance;
	public double remainingBalance;
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
	public double getWithdrawalTransaction(double moneyWithdraw) {
		System.out.println("Debit cardnumber: " + getCardNum());
		if (moneyWithdraw < balance) {
			isBalanceMore = true;
			remainingBalance = (balance - moneyWithdraw);
			return remainingBalance;
		} else if (moneyWithdraw > balance) {
			isBalanceMore = false;

		}
		return 0;
	}

	public double getRemainingBalance() {
		return remainingBalance;
	}

}
