package Day27;
import java.util.*;
public class getSumFromEachForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
System.out.println("Please enter 5 numbers");
		int[] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
		int sum = 0;
		int max = 0;
		
		for (int each:nums) {
			sum += each;
			if (max < each) {
				max = each;
			}
		}
		
		System.out.println("the sum is " + sum);
		System.out.println("the maximum number is " + max);
	}

}
