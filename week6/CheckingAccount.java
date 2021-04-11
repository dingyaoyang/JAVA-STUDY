package week6;

public class CheckingAccount extends BankAccount{
	private double serviceChange;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String accountNum, double balance, double serviceChange) {
		super(accountNum, balance);
		this.serviceChange = serviceChange;
	}

	public double getServiceChange() {
		return serviceChange;
	}

	public void setServiceChange(double serviceChange) {
		this.serviceChange = serviceChange;
	}
	public String toString(){
		String info;
		info = "";
		return info;
	}
	
	public void assessServiceCharge(){
		
	}
}
