package mynewpackege;

import java.util.Scanner;

public class bestBuy {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		double iphone = 599.99;
		double ipad =  899.99;
		
		System.out.println("Please enter your budget");
		double yourBudget = input.nextDouble();
		System.out.println("Your budget is " + (int)yourBudget );
		
		int phoneCount, tabletCount ;
		System.out.println("Please enter the number of iPhone and iPad");
		phoneCount = input.nextInt();
		tabletCount = input.nextInt();

		double totalPrice = iphone * phoneCount + ipad * tabletCount ;
		
		System.out.println("The total price are " + (int)totalPrice );
		
		if ( yourBudget < totalPrice ) {
			
			System.out.println("out of budget");
			System.out.println("You need extra " + (totalPrice - yourBudget) +"$");
			
			
		}
		else {
		
		System.out.println("I will take it");	
			
		}
	}}
