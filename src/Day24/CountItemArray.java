package Day24;
import java.util.*;
public class CountItemArray {

	public static void main(String[] args) {
		
		int count=0;
		int[] nums = new int[] {23,346,231,55,22};
		System.out.println(Arrays.toString(nums));
		 for (int i=0;i<nums.length;i++) {
			 
			 if (nums[i] >100) {
				 count++;
			 }
			 
		 }
		 System.out.println(count);
	}

}
