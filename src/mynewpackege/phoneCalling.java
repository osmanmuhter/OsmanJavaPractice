package mynewpackege;

import java.util.Scanner;

public class phoneCalling {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	int areaCode, localNumber ;
	
	System.out.println("Please enter your area code and local number");
	areaCode = input.nextInt();
	localNumber = input.nextInt();
	
	System.out.println("Calling phone number is" + "(" + areaCode + ")" + "-" +localNumber );
	
	}

}
