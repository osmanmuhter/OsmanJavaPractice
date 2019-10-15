package mynewpackege;

import java.util.Scanner;

public class amazonShopper {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Welcome Amazon Shopper");
		System.out.println("Please enter the price of product");
		
		double price = scan.nextDouble();
		
		System.out.println("Are you a Amazon Prime member? " + "\n Enter yes/no");
		String answer = scan.next();
		boolean a = answer.equals("yes");
		
		if (a == true ) {
			System.out.println("Free shipping");
		}
		else if ( (int)price > 35 ) {
			System.out.println("Free shipping");
		}
		else 
		{
			System.out.println("For shipping you need to add 5$");
		}
	}

}
