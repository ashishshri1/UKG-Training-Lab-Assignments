package lab2.q3;

class SavingsAccount extends Account {
	private double interest = 5;
	private double maxWithdrawLimit;

	public SavingsAccount(String memberName, double maxWithdrawLimit, double initialBalance) {
		super(memberName, initialBalance);
		this.maxWithdrawLimit = maxWithdrawLimit;
	}
	
	public double getBalance() {
		return this.getAccountBalance() + interest;
	}

	public void withdraw(double money) {
		if (money <= maxWithdrawLimit && this.getAccountBalance() - money >= 500)
			this.setAccountBalance(this.getAccountBalance() - money);
	}
}
