package mynewpackege;

import java.util.Scanner;

public class checkNameEquality {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String myName = "Osman" ;
		
		System.out.println("Please input your name");
		String typeName = input.nextLine() ; 
		
		boolean a = typeName.equals("Osman");
		
		if (a == true ) {
			System.out.println("Yes this is my name");
		}
		else {
			System.out.println("Sorry, Re-type that again");
		}
		
	}

}
