package BankDemo;

public class CheckingAccount {

	int acno;
	double balance = 0.0;

	public CheckingAccount(int acno) {
		// TODO Auto-generated constructor stub

		this.acno = acno;
	}

	public void desposite(double amount) {

		balance = balance + amount;
	}

	public void withdraw(double amount) throws Insuffientfund  {

		if (amount <= balance) {

			balance = balance - amount;
		} else {

			double needs = amount - balance;
			throw new Insuffientfund(needs);
		}
	}

	public double getBalance() {
		return balance;

	}
}
