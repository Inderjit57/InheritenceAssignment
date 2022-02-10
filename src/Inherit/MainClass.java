/*
 * The Functionality of this program works as per the following steps
 * 1. Choose the TYPE of card: Debit/Credit
 * 2. Inherit from Account Class to verify Account login
 * 3. Once Logged in, it will do the Debit/Credit transaction
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

		// Choose the TYPE of card
		System.out.println("Enter Credit or Debit");
		String chooseAcc = sc.next();

		switch (chooseAcc) {
		case "Debit":
			Debit debit = new Debit(debitBalance);
			debit.getAccLogin(); // Inherit from Account to verify Account login
			if (debit.isValid == true) {
				System.out.println("Remaining Balance: " + debit.getWithdrawalTransaction()); // Money withdraw transaction
			} else if (debit.isValid == false) {
				System.out.println("Check Card number or Password");
				break;
			}
			System.out.println("Do you want to change Debit Card number?"); // Card change permission
			changeCard = sc.next();
			if (changeCard.equals("Yes")) {
				System.out.println("enter new debit card num");
				int newDebitNum = sc.nextInt();
				System.out.println("New Debit Card is: " + debit.setCardNum(newDebitNum));
			} else if (changeCard.equals("No")) {
				System.out.println("Have a nice day");
				break;
			}
			break;
			
		case "Credit":
			Credit credit = new Credit(creditBalance);
			credit.getAccLogin(); // Inherit from Account to verify Account login
			if (credit.isValid == true) {
				System.out.println("Credit limit left: " + credit.balanceOwe());
			} else if (credit.isValid == false) {
				System.out.println("Check Card number or Password");
				break;
			}
			System.out.println("Do you want to change Debit Card number?"); // Card change permission
			changeCard = sc.next();
			System.out.println("enter new credit card num");
			if (changeCard.equals("Yes")) {
				int newCreditNum = sc.nextInt();
				System.out.println("New Credit Card is: " + credit.setCreditCardNum(newCreditNum));
			} else if (changeCard.equals("No")) {
				System.out.println("Have a nice day");
				break;
			}
			break;

		default:
			System.out.println("Choose credit or debit only");
			break;

		}
	}

}
