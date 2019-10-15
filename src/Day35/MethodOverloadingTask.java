package Day35;

public class MethodOverloadingTask {

	public static int addNums (int a, int b) {
		int sum;
		sum = a + b ;
		return sum;
	}
	public static int addNums (int a, int b, int c) {
		int sum =a + b + c;
		return sum;
	}
	public static void addNums (int a, int b, int c , int d) {
		int sum = a + b + c + d;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(addNums(1, 5));
System.out.println(addNums(1, 2,3));
addNums(2, 3,5,7);

	}

}
