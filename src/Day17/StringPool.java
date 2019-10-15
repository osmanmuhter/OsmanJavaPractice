package Day17;

import java.util.Scanner;

public class StringPool {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		String massage = s.nextLine();
		String sender = "<Mike Smith>";
		String phoneNumber = "[202-123-3456]";
		String massageBody = "{I love programming and problem solving}";
		
		System.out.println(sender.replace("<", " ")+ sender.replace(">", " "));
		System.out.println();
		
	}

}
