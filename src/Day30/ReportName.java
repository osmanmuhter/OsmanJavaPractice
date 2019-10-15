package Day30;

import java.util.Scanner;

public class ReportName {
	public static void ReverseName(String first, String last) {
		String reverse ="";
		String reverse2 ="";
		int count1 =first.length();
		int count2 = last.length();
		for (int i = count1 - 1;i>=0;i--) {
			reverse = reverse + first.charAt(i);
		}
		for (int j = count2 -1;j>=0;j--) {
			reverse2 = reverse2 +last.charAt(j);
		}
		System.out.println("The reverse version of your name is " +reverse +" " + reverse2);
	}
	public static void reportName(String FirstName, String LastName) {
		int lengOfFir = FirstName.length();
		int lengOfLas = LastName.length();
		char firstIn = FirstName.charAt(0);
		char lastIn = LastName.charAt(0);
		System.out.println("The length of " + FirstName + " is " + lengOfFir);
		System.out.println("The length of " + LastName + " is " + lengOfLas);
		System.out.println("And the initial name is " + firstIn +lastIn);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the name that you want report");
		String firsNlast = scan.next();
		String lastN = scan.next();
		
		reportName(firsNlast,lastN);
		ReverseName(firsNlast, lastN);
	}

}
