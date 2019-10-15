package Day13;

import java.util.Scanner;

public class StringClassPractice {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "ABC";

		boolean b1 = s1.equals("abc");
		boolean b2 = s1.equals(s2);

		System.out.println(b1);
		System.out.println(b2);

		
		//getting the length oftring object
		
		int countOfCharacter = s1.length();
		System.out.println(s1.length());
		
		
		//TASK 1
		/*
		 * ASK USER FOR TWO NAMES
		 * CHECK FOR THE EQUALITY WITHOUT CARING ABOUT THE CASE
		 * PRINT RESULT
		 * 
		 * also compare the length of the names
		 *   if name 1 has more character ---> print second character
		 *   else print 3rd character 
		 *  
		 *  OPTIONAL 
		 *  STORE THE LAST CHARACTER OF THE NAME 2 IN CHAR VARIABLE
		 *  AND CREATE SWITCH STATEMENT TO CHECK FEW CASES AS BELOW
		 *  
		 *  case 'a' ---> print name ended with a 
		 *  case 'b' ---> print name ended with b
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("please enter two names");
		String name1 = "" ;
		String name2 = "" ;
		name1 = scan.next();
		name2 = scan.next();
		
		System.out.println("IS It SAME name >"+name1.equalsIgnoreCase(name2));
		
		int firstName = name1.length();
		int SecondName = name2.length();
		
		if (firstName > SecondName) {
			System.out.println(name1.charAt(1));
		} else
			System.out.println(name1.charAt(2));
		
		char lastChar2 = name2.charAt(--SecondName);
		
		switch (lastChar2) {
		case 'a':
			System.out.println(name2);
			
			break;

		case 'b':
			System.out.println(name2);
			break;
		}
		
		
		
		
	}

}
