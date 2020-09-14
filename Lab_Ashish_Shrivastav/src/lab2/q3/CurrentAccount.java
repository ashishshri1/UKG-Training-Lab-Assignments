package lab2.q3;

class CurrentAccount extends Account{
	String tradeLicenseNumber;
	public double getBalance() {
		return accountBalance;
	}
	public void withdraw(double withdrawMoney) {
		if(withdrawMoney<=accountBalance)
			accountBalance-=withdrawMoney;
	}
	
}
