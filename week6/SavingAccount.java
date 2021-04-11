package week6;

public class SavingAccount extends BankAccount{
	private double interestRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public String toString(){
		String info;
		info = "";
		return info;
	}
	
	public void payInterest(){
		
	}
}
