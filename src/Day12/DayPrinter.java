package Day12;

import java.util.Scanner;

public class DayPrinter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number between 1 - 7");
		
		int dayNum = scan.nextInt();
	String dayWord;
	switch (dayNum) {
	case 1:
		System.out.println(dayWord = " monday ");
		break;
		
	case 2:
		System.out.println(dayWord = " tuesday ");
		break;
		
	case 3:
		System.out.println(dayWord = "Wednesday");
		break;
		
	case 4:
		System.out.println(dayWord = "Thursday");
		break;
		
	case 5:
		System.out.println(dayWord = "Friday");
		break;
		
	case 6:
		System.out.println(dayWord ="Saturday");
		break;
		
	case 7:
		System.out.println(dayWord = "Sunday");
		break;
		
		default:
			System.out.println("Invalid input");
			break;

	
		}
	}

}
