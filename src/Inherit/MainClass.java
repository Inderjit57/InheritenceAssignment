package Inherit;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double debitBalance = 600;	// Assumed balance in debit
		double creditBalance = 1000;	// Assumed Credit limit
		
		//Choose the TYPE of card
		System.out.println("Enter Credit or Debit");
		String chooseAcc = sc.next();

		switch (chooseAcc) {
		case "Debit":
			Debit debit = new Debit(debitBalance); 
			//debit.getAccLogin(); // Inherit from ParentClass; Account
			if (debit.isValid = true) {
				System.out.println("Remaining Balance: " + debit.getWithdrawalTransaction());
			} else if (debit.isValid = false) {
				System.out.println("Check Card number or Password");
				break;
			}
			System.out.println("enter new debit card num");
			int newDebitNum = sc.nextInt();
			System.out.println("New Debit Card is: " + debit.setCardNum(newDebitNum));

			break;
		case "Credit":
			Credit credit = new Credit(creditBalance); 
			//credit.getAccLogin(); // Inherit from ParentClass; Account
			if (credit.isValid = true) {
				System.out.println("Credit limit left: " + credit.balanceOwe());
			} else if (credit.isValid = false) {
				System.out.println("Check Card number or Password");
				break;
			}
			System.out.println("enter new credit card num");
			int newCreditNum = sc.nextInt();
			System.out.println("New Credit Card is: " + credit.setCreditCardNum(newCreditNum));
			break;

		default:
			System.out.println("Choose credit or debit only");
			break;

		}
	}

}
