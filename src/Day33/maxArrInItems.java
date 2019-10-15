package Day33;

public class maxArrInItems {
public static int gtMaxItem (int[] nums) {
	int max = 0;
	int count = nums.length;
	for (int i=0;i<count;i++) {
		if (max < nums[i]) {
			max = nums[i];
		} else
			continue;
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arrs = {3,2,6,7,5,11,2};
System.out.println("the maximum number in the array list is " + gtMaxItem(arrs));
	}

}
