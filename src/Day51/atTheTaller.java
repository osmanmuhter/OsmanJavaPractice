package Day51;

public class atTheTaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount s1 = new SavingAccount("Osman",12345,95000,4.5);
		System.out.println(s1);
		s1.deposit(100);
		System.out.println(s1.balance);
		s1.withdraw(59);
		System.out.println(s1.balance);
	}

}
