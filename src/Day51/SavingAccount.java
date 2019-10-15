package Day51;

public class SavingAccount extends bankAccount {

	double returnRate;
	
	
	
	public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {
		super(accountName, accountNumber, balance);
		this.returnRate = returnRate;
	}



	



	@Override
	public String toString() {
		return "SavingAccount [returnRate=" + returnRate + ", accountName=" + accountName + ", accountNumber="
				+ accountNumber + ", balance=" + balance + "]";
	}
	
	@Override
	public void deposit(double balance) {
		// TODO Auto-generated method stub
		super.deposit(balance+100);
	}
	
	@Override
	public void withdraw(double balance) {
		// TODO Auto-generated method stub
		super.withdraw(balance-10);
	}
}
