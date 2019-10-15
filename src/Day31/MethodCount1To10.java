package Day31;
import java.util.*;
public class MethodCount1To10 {
public static void oneToN (int num) {
	for (int i =1;i<=num;i++) {
		System.out.print(i + " ");
	}
	
}
public static void NtoDown (int nu) {
	for (int i =nu;i>0;i--) {
		System.out.print(i + " ");
	}
}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a number you want to count from one to than number");
		int nums = scan.nextInt();
		System.out.println("And please enter a number you want to count down");
		int nunu = scan.nextInt();
		
		oneToN(nums);

		System.out.println();
		NtoDown(nunu);
		
		
		
	}

}
