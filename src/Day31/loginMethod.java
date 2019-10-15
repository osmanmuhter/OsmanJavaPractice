package Day31;
import java.util.*;
public class loginMethod {

	
	public static void login(String Log,String Pass,boolean checkBox) {
		System.out.println("----You entered----");
		System.out.println("Username: "+ Log);
		System.out.println("PassWord: " + Pass);
		if(checkBox == true) {
			System.out.println("you checked remember me box");
		}
		else
			System.out.println("You didn't check the remember me box");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your user name");
		String username = scan.next();
		System.out.println("Please enter your password");
		String password = scan.next();
		System.out.println("Do you want computer to remember this account?");
		System.out.println("Please say \"yes\" or \"no\" ");
		String answer = scan.next();
		boolean result = true;
		if(answer.contains("yes")) {
			result = true;
		}
		else
			result = false;
		login(username, password, result);
		

	}

}
