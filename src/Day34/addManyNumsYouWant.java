package Day34;

public class addManyNumsYouWant {
public static void addNumsYouWant (int... manyNums) {
	int sum =0;
	for (int nums: manyNums) {
		sum += nums;
		
	}
	System.out.println(sum);
		
		

}
	public static void main(String[] args) {
		addNumsYouWant(1,2,3,4,5,6,7,8,11,223,24);
	}

}
