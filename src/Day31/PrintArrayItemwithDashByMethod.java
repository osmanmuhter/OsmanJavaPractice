package Day31;

public class PrintArrayItemwithDashByMethod {
	
	public static void printArrayswithDash(int[] nums) {
		for (int numnum : nums) {
			System.out.print(numnum + "-");
		}
	}
	public static void main(String[] args) {
	int arrs[] = {1,3,5,6,8,6};
	printArrayswithDash(arrs);
	}

}
