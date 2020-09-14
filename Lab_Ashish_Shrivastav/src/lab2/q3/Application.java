package lab2.q3;

import java.util.*;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your user name: ");
		String memberName = sc.nextLine();
		System.out.print("Enter account type (savings/current): ");
		String accountType = sc.nextLine();
		double initialBalance;
		if (accountType.equals("savings")) {
			System.out.print("Enter initial balance (>500): ");
			initialBalance = sc.nextDouble();
			if (initialBalance < 500.0)
				initialBalance = 500.0;
			System.out.print("Enter maximum withdraw limit: ");
			double maxWithdrawLimit = sc.nextDouble();
			SavingsAccount s = new SavingsAccount(memberName, maxWithdrawLimit, initialBalance);
			while(true) {
				System.out.println("1: Deposit");
				System.out.println("2: Withdraw");
				System.out.println("3: Display");
				System.out.println("0: Exit");
				System.out.print("Enter your choice: ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before deposit = "+s.getAccountBalance());
					System.out.print("Enter amount of money to deposit: ");
					double money=sc.nextDouble();
					s.deposit(money);
					if(showBalance)
						System.out.println("Balance after deposit = "+s.getAccountBalance());
				}
				else if(choice==2) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before withdraw = "+s.getAccountBalance());
					System.out.print("Enter amount of money to withdraw: ");
					double money=sc.nextDouble();
					s.withdraw(money);
					if(showBalance)
						System.out.println("Balance after withdraw= "+s.getAccountBalance());
				}
				else if(choice==3) {
					System.out.println("Balance = "+s.getAccountBalance());
				}
				else if(choice==0) {
					break;
				}
			}

		} else if (accountType.equals("current")) {
			System.out.print("Enter initial balance: ");
			initialBalance = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter trade license number: ");
			String tradeLicenseNumber = sc.nextLine();
			CurrentAccount c = new CurrentAccount(memberName, tradeLicenseNumber, initialBalance);
			while(true) {
				System.out.println("1: Deposit");
				System.out.println("2: Withdraw");
				System.out.println("3: Display");
				System.out.println("0: Exit");
				System.out.print("Enter your choice: ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before deposit = "+c.getAccountBalance());
					System.out.print("Enter amount of money to deposit: ");
					double money=sc.nextDouble();
					c.deposit(money);
					if(showBalance)
						System.out.println("Balance after deposit = "+c.getAccountBalance());
				}
				else if(choice==2) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before withdraw = "+c.getAccountBalance());
					System.out.print("Enter amount of money to withdraw: ");
					double money=sc.nextDouble();
					c.withdraw(money);
					if(showBalance)
						System.out.println("Balance after withdraw= "+c.getAccountBalance());
				}
				else if(choice==3) {
					System.out.println("Balance = "+c.getAccountBalance());
				}
				else if(choice==0) {
					break;
				}
			}
		}
		sc.close();
	}
}
