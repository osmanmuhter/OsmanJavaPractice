package mynewpackege;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println();

		System.out.println("How is weather today?");

		String weather = s.next() ;
				weather = weather.toLowerCase();
				
		switch (weather) {

		case "sunny":
			System.out.println("go swimming");
			break; //it will get out of the switch statement 

		case "windy":
			System.out.println("go fly a plane");
			break;

		case "rainy":
			System.out.println("stay home");
			break;

		case "snowy":
			System.out.println("go snowboarding");
			break;

		default:
			System.out.println("are you sure this is a right weather");
			break;
		}

	}
}
