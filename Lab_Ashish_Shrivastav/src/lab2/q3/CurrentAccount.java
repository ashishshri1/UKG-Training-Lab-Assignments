package lab2.q3;

class CurrentAccount extends Account {
	String tradeLicenseNumber;

	public CurrentAccount(String memberName, String tradeLicenseNumber, double initialBalance) {
		super(memberName, initialBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}

	public double getBalance() {
		return this.getAccountBalance();
	}

	public void withdraw(double money) {
		if (money <= this.getAccountBalance())
			this.setAccountBalance(this.getAccountBalance() - money);
	}

}
