package mynewpackege;

import java.util.Scanner;

public class ternaryOperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("please enter a number you want");
		int userInput = scan.nextInt();
		String status;
		
		status = ( userInput > 0 ) ? "positive" : "nagitive" ;
		System.out.println(status);
		
		
		
	}

}
