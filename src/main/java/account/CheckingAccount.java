package account;

public class CheckingAccount extends BankAccount {

	private double fee = 5.0;

	public CheckingAccount(double startingBalance) {
		super(startingBalance);
	}

	public void deductMonthlyFee() {
		balance = balance - fee;
		System.out.println("Fee deducted. New balance: " + balance);
	}
}
