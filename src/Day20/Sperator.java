package Day20;

import java.util.Scanner;

public class Sperator {

	public static void main(String[] args) {
		System.out.println("Please enter a name and number you want to make sperate");
		 Scanner scan = new Scanner(System.in);
		 String mix = scan.next();
		 
		 int i =0;
		 String reservedNum = "";
		 String reservedChar = "";
		 String otherStuff = "";
		 
		 while (i < mix.length()) {
			 char a =mix.charAt(i);
			 if (a >= 'a' && a<='z') {
				 reservedChar += a;
			 }else if (a >='0' && a <='9') {
				 reservedNum += a;
			 }else {
				 otherStuff += a;
			 }
			 i++;
		 }
		 System.out.println("the Character is " + reservedChar);
		 System.out.println("the Number is " + reservedNum);

		 System.out.println("the other stuff is " + otherStuff);
	}

}
