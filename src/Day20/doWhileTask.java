package Day20;

import java.util.Scanner;

public class doWhileTask {

	private static final String Do = null;

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name"); 
		String name =scan.next();
		int count = name.length();
		int x = 0;
		
		do {
			System.out.print(name.charAt(x)+ " ");
			x++;
		}
			while(x < count);
		
		 
		 
		
	}

}
