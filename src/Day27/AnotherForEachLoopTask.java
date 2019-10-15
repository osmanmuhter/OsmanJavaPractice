package Day27;

import java.util.Scanner;

public class AnotherForEachLoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter a sentense :");
		String userName = scan.nextLine();
		
		String[] eachWord = userName.split(" ");
		
		for (String eachWords :eachWord ) {
			System.out.println(eachWords + "");
		}
		
	}

}
