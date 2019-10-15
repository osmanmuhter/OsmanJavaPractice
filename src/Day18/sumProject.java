package Day18;

import java.util.Scanner;

public class sumProject {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("please enter a number you want to get sum ");
		int sum = 0;
		int count = 0;
		int x = scan.nextInt();
		 while  (count <= x) {
			 sum = sum + count;
			 System.out.println("count is :" + count + "sum is:" + sum);
			 count++;
		 }
	}

}
