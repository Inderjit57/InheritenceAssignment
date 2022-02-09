package Inherit;

import java.util.Scanner;

public class Debit extends Account {
	Scanner sc = new Scanner(System.in);

	private int cardNum = 123456789;
	private double balance;
	public double remainingBalance;

	public Debit(double balance) {
		System.out.println("Debit cardnumber " + cardNum);
		this.balance = balance;
	}

	public double getTransaction() {
		System.out.println("Enter money to withdraw");
		double moneyWithdraw = sc.nextDouble();
		remainingBalance = balance - moneyWithdraw;
		return remainingBalance;
	}

}
