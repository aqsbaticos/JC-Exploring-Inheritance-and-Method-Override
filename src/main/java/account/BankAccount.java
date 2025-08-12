package account;

class BankAccount {

	protected double balance;

	public BankAccount(double startingBalance) {
		this.balance = startingBalance;
	}

	public double getBalance() {
		return this.balance;
	}
}
