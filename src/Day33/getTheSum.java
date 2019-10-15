package Day33;

public class getTheSum {
public static int sum(int[] nums) {
	int original =0;
	int count =nums.length;
	for (int i =0;i<count;i++) {
		original = original + nums[i];
	}
	return original;
}
	public static void main(String[] args) {
		int[] arrs = {1,2,3,4,5,6};
	System.out.println(sum(arrs));
	}

}
