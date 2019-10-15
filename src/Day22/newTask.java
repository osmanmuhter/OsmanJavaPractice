package Day22;

import java.util.Scanner;

public class newTask {

	public static void main(String[] args) {
		
			System.out.println("Please type name");
			Scanner scan =new Scanner (System.in);
			
			String name = scan.next();
			
			for (int i = 0;i<name.length();i+=2) {
				String douChar = name.substring(i,i+2);
				if (!(i==name.length())) {
					System.out.print(douChar + " ");
				}
				else {
					System.out.print(douChar);
				}
			}
	}

}
