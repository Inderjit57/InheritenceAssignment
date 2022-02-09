package Inherit;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Debit debit = new Debit(600); // Assumed balance
		debit.setAccLogin();
		if (debit.isValid = true) {
			System.out.println("Remaining Balance: " + debit.getTransaction());
		} else if (debit.isValid = false) {
			System.out.println("Check Card number or Password");
		}

	}

}
