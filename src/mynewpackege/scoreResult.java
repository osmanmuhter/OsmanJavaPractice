package mynewpackege;

import java.util.Scanner;

public class scoreResult {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int score;

		String result;

		System.out.println("Please enter a number");
		score = scan.nextInt();

		if (score > 85) {
			result = "pass";
			System.out.println(result);
		}

		else {
			result = "Fail";
			System.out.println(result);
		}

	}

}
