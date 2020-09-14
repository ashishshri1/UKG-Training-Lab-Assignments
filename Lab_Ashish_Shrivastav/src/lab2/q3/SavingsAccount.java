package lab2.q3;

class SavingsAccount extends Account {
	private int interest = 5;
	private int maxWithdrawLimit;
	public SavingsAccount(String memberName,int maxWithdrawLimit)
	{
		super(memberName,500);
		this.maxWithdrawLimit=maxWithDrawLimit;
	}
	public int getBalance() {
		return accountBalance+interest;
	}
	public void withdraw(double m) {
		if(m<maxWithDrawLimit)
			accountBalance-=m;
	}
}
