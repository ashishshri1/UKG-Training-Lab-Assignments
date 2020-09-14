package lab2.q3;

import java.util.*;

class Account {
	private String memberName;
	private String accountNumber;
	private double accountBalance;

	public Account(String memberName, double accountBalance) {
		Random rand = new Random();
		this.accountNumber = "" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10)
				+ rand.nextInt(10);
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void deposit(double money) {
		this.accountBalance += money;
	}
}
