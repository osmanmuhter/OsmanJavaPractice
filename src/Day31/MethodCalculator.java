package Day31;

import java.util.Scanner;

public class MethodCalculator {
public static void Calculator (String sign,int a, int b) {
	int result = 0;
	if ( sign.contains("+")) {
		result = a + b;
	}
	else if (sign.contains("-")) {
		result = a - b ;
	}
	else if (sign.contains("*")) {
		result = a * b ;
	}
	else if (sign.contains("/")) {
		result = a / b ;
	}
	else if (sign.contains("%")) {
		result = a % b ;
	}
	else {
		System.out.println("Invalid code");
	}
	System.out.println(result);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter first number");
		int a1 = scan.nextInt();
		System.out.println("Please enter second number");
		int b1 = scan.nextInt();
		System.out.println("Type one of blow");
		System.out.println("\'+\' or \'-\' or \'*\' or \'/\' or \'%\' ");
		String userOption = scan.next();
		Calculator(userOption, a1, b1);
		
	}

}
