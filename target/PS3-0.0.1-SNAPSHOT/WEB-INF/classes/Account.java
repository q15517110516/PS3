
import java.util.Date;

import Exception.InsufficientFundsException;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	public Account(int id, double balance, double annualInterestRate) {

		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public double getMonthlyInterestRate() {
		return getAnnualInterestRate() / 12;
	}

	public void Withdraw(double Amount) throws InsufficientFundsException {
		if (Amount <= balance) {
			balance -= Amount;
		} else {
			System.out.println("Insufficient funds");
			double needs = Amount - balance;
			throw new InsufficientFundsException(needs);

		}
	}

	public void Deposit(double Amount) {
		balance += Amount;
	}
}

}
