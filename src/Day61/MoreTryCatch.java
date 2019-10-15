package Day61;
import java.util.*;
public class MoreTryCatch {
public static void main(String[] args) {
	
	
	Scanner s1 = new Scanner(System.in);
	
	
	try {
		int[] nums = {1,2,3,4,5,6};
		System.out.println("Please type which index you want to print");
		int x = s1.nextInt();
		System.out.println(nums[x]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("out of range ");
	}
	
}
}
