package mynewpackege;

import java.util.Scanner;

public class userNameAndPassword {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String userName = "simannn96";
		String passWord = "ar917913";

		System.out.println("Please enter your Username");
		System.out.println("Please enter your Password");
		String typeName = input.nextLine();
		String typePass = input.nextLine();

		boolean a = typeName.equals("simannn96");
		boolean b = typePass.equals("ar917913");
		boolean c = typeName.equals("admin");

		if ((a == true && b == true) || c == true) {
			System.out.println("=====================>\n Login succesful");
		} else {
			System.out.println("Username or Password doesn't match with our system");
		}

	}

}
