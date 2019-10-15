package mynewpackege;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 2 numbers :");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		String operator = scan.next();

//		if (operator.equals("+")) {
//			System.out.println("the result is " + (num1+num2));
//		} else if (operator.equals("-")) {
//			System.out.println("the result is " + (num1-num2));
//		}else if (operator.equals("*")){
//			System.out.println("the result is " + (num1*num2));
//		} 
//		

		switch (operator) {

		case "+":
			System.out.println("the result is" + (num1 + num2));
			break;

		case "-":
			System.out.println("the result is" + (num1 - num2));
			break;

		case "*":
			System.out.println("the result is" + (num1 * num2));
			break;

		case "/":
			System.out.println("the result is" + (num1 / num2));
			break;

		default:
			System.out.println("invalid entry");
			break;
		}
	}

}
