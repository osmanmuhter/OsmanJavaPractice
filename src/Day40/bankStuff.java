package Day40;

public class bankStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount newAccount = new BankAccount();
		newAccount.accountHolder = "Osman Muhtar";
		newAccount.balance = 8000.00;
		
		newAccount.showAccountHolder();
		newAccount.showBalance();
		newAccount.add100Dollar();
		newAccount.showBalance();
	}

}
