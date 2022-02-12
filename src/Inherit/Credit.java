// Credit Class does the money withdrwal and Calculate interest function only
package Inherit;

public class Credit extends Account {
	private int creditCardNum = 222333;
	private double balanceAvaliable;
	private double creditLimit;
	private double interestCharge = 0.22;
	public boolean isCreditLimitMore;

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

	public double balance(double moneyWithdrawal) {
		if (moneyWithdrawal < creditLimit) {
			isCreditLimitMore = true;
			System.out.println("Credit Card num is: " + getCreditCardNum());
			balanceAvaliable = (creditLimit - moneyWithdrawal);
			System.out.println(
					"Annual interest charge on :" + moneyWithdrawal + " = " + (moneyWithdrawal * interestCharge));
			return balanceAvaliable;
		} else {
			isCreditLimitMore = false;
			return 0;
		}
	}

	public double getBalanceAvaliable() {
		return balanceAvaliable;
	}

	public double setBalanceDeposit(double moneyDeposit) {

		return (balanceAvaliable + moneyDeposit);

	}

}