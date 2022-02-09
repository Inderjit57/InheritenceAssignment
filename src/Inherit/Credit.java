package Inherit;

public class Credit extends Account {
	private int creditCardNum = 123456789;
	private double balanceOwe;
	private double moneyWithdrawal;

	public credit(){
        System.out.println("this is the constructor for credit");
    }

	private int getCreditCardNum() {
		return cardNum;
	}

	private setCreditCardNum(int cardNum){
       this.cardNum = cardNum;
   }
}
