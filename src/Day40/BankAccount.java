package Day40;

public class BankAccount {

	String accountHolder;
	double 	balance;
	
	public void showAccountHolder() {
		System.out.println(accountHolder);
		
		
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
	 
	public void add100Dollar() {
		balance += 100;
	}
}
