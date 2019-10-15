package Day27;
import java.util.*;
public class forEachLoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter a Name :");
		String userName = scan.next();
		char[] names = userName.toCharArray();
		for (char charNameStr : names) {
			System.out.print(charNameStr + "-");
		}
	}

}
