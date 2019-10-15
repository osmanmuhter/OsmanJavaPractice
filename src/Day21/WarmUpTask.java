package Day21;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		

		int sum= 0;
		int count=0;
		
		do {
			System.out.println("Please enter first number you want to add");
			int x =scan.nextInt();
			System.out.println("Please enter second number you want to add ");
			int y =scan.nextInt();
			sum = x + y;
				count++;
				if (count ==3) {
					System.out.println("You lost");
					break;
			}
			
			
		} while (sum <100);
		
		System.out.println("Correct, you entered number sum is " + sum);
		System.out.println("And the time you tried this sum are "+ count +" times");
	}

}
