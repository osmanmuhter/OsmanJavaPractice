package Day51;

public class bankAccount {

	String accountName;
	long accountNumber;
	double balance;
	
	public bankAccount(String accountName, long accountNumber, double balance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String toString() {
		return "bankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
	
	public void deposit(double balance) {
		this.balance +=balance;
		
	}
	public void withdraw(double balance) {
		this.balance -=balance;
	}
	
	
	
	
}
