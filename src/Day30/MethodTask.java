package Day30;

import java.util.Scanner;

public class MethodTask {

	
	public static void printTheDoubleNumber(int num) {
		int mult = num * 2;
		System.out.println("The double of the number you entered is " + mult);
	}
	public static void checkForAge(int age) {
		
		if (age > 10) {
			System.out.println("Adult");
		}
		else 
			System.out.println("Not an Adult");
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number that you want double ");
		int nums = scan.nextInt();
		printTheDoubleNumber(nums);
		
		System.out.println("Please enter a age that you want to check does adult or not?");
		int ages = scan.nextInt();
		checkForAge(ages);
	}

}
