package Day16;

import java.util.Scanner;

public class newNew {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		System.out.println("Please enter a name");
		String str = s.next();
		System.out.println("You entered name is " + str );
		boolean a = str.startsWith("A");
		boolean b = str.endsWith("x");
		System.out.println((a = b) ? "The name is start with A and end with x":"Nothing match with requirment");
		
		int lastIndex = str.lastIndexOf("a");
		System.out.println(lastIndex);
		
		int lengthOfStr = str.length();
		
		if (lengthOfStr > 2) {
			
			if (lengthOfStr % 2 == 1) {
				char middleLetter = str.charAt(((lengthOfStr + 1)/2)-1);
				System.out.println(middleLetter);
			}
			else if (lengthOfStr % 2 == 0) {
				String anotherMiddle = str.substring(lengthOfStr/2,(lengthOfStr/2)+2);
				System.out.println(anotherMiddle);
			}
			
				
			
		}
		else 
			System.out.println("Invalid name");
		
		
		
	}

}
