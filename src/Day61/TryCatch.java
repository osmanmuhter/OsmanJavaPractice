package Day61;
import java.util.*;
public class TryCatch {
public static void main(String[] args) {
	
	Scanner s1 = new Scanner(System.in);
	try {
		System.out.println("Please enter first number");
		int a = s1.nextInt();
		System.out.println("Please enter second number");
		int b = s1.nextInt();
		
		System.out.println("The result is of a/b is "+ a/b);
	} catch (ArithmeticException e) {
		System.out.println("Do not enter 0 on the second input");
	}
	
}
}
