package Day19;

import java.util.Scanner;

public class charTesk {

	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner (System.in);
	
	String str = scan.next();
	
	int count = str.length();
	
	while (count >0) {
		
		count--;
		System.out.print(str.charAt(count)+ " ");
	}
	
	
	
	}

}
