/*
 * The Functionality of this program works as per the following steps
 * 1. Choose the TYPE of card: Debit/Credit
 * 2. Inherit from Account Class to verify Account login
 * 3. Once Logged in, it will do Debit/Credit withdraw money transaction only
 * 4. Ask to change the Debit/Credit card number
 */
package Inherit;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double debitBalance = 600; // Assumed balance in debit
		double creditBalance = 1000; // Assumed Credit limit
		String changeCard;
		String accountNumber;
		String password;
		double moneyWithdrawal;
		String permissionAllow = "yes";
		String permissionDeny = "no";

		// Choose the TYPE of card
		System.out.println("Enter: Credit / Debit");
		String chooseAcc = sc.next();

		switch (chooseAcc) {
		case "Debit":
			Debit debit = new Debit(debitBalance);
			System.out.println("Enter Account User number");
			accountNumber = sc.next();
			System.out.println("Enter password");
			password = sc.next();
			debit.getAccLogin(accountNumber, password); // Inherit from Account to verify Account login
			if (debit.isValid == true) {
				System.out.println("Enter money to withdraw");
				moneyWithdrawal = sc.nextDouble();
				debit.getWithdrawalTransaction(moneyWithdrawal);
				if (debit.isBalanceMore == true) {
					System.out.println("Remaining Balance: " + debit.getRemainingBalance()); // Money withdraw
																								// transaction
				} else if (debit.isBalanceMore == false) {
					System.out.println("Your total balance in Debit: " + debitBalance);
					break;
				}

			} else if (debit.isValid == false) {
				System.out.println("Check Card number or Password");
				break;
			}

			System.out.println("\nDo you want to change Debit Card number? Enter yes/no"); // Card change permission
			changeCard = sc.next();
			if (changeCard.equals(permissionAllow)) {
				System.out.println("Enter new debit card num");
				int newDebitNum = sc.nextInt();
				System.out.println("New Debit Card is: " + debit.setCardNum(newDebitNum));
			} else if (changeCard.equals(permissionDeny)) {
				System.out.println("Have a nice day");
				break;
			}
			break;

		case "Credit":
			Credit credit = new Credit(creditBalance);
			System.out.println("Enter Account user number");
			accountNumber = sc.next();
			System.out.println("Enter password");
			password = sc.next();
			credit.getAccLogin(accountNumber, password); // Inherit from Account to verify Account login
			if (credit.isValid == true) {
				System.out.println("Enter credit amount to use");
				moneyWithdrawal = sc.nextDouble();
				credit.balance(moneyWithdrawal);
				if (credit.isCreditLimitMore == true) {
					System.out.println("Credit limit left: " + credit.getBalanceAvaliable());
					System.out.println("Balance deposit"); // Balance deposit to credit Card
					double moneyDeposit = sc.nextDouble();
					System.out.println("Available Credit: " + credit.setBalanceDeposit(moneyDeposit));
				} else if (credit.isCreditLimitMore == false) {
					System.out.println("You have a Credit limit of: " + creditBalance);
					break;
				}
			} else if (credit.isValid == false) {
				System.out.println("Check Card number or Password");
				break;
			}

			System.out.println("\nDo you want to change Debit Card number? : Enter yes/no"); // Card change permission
			changeCard = sc.next();
			System.out.println("Enter new credit card num");
			if (changeCard.equals(permissionAllow)) {
				int newCreditNum = sc.nextInt();
				System.out.println("New Credit Card is: " + credit.setCreditCardNum(newCreditNum));
			} else if (changeCard.equals(permissionDeny)) {
				System.out.println("\nHave a nice day");
				break;
			}
			break;

		default:
			System.out.println("Choose Credit or Debit only");
			break;

		}
	}

}
