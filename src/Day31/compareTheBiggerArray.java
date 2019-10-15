package Day31;

import java.util.Arrays;

public class compareTheBiggerArray {
public static void biggerArrayis (int first[],int second[]) {
	int indexf = first.length;
	int indexs = second.length;
	if (indexf > indexs) {
		System.out.println(Arrays.toString(first) + " is the largest one");
	}
	else 
		System.out.println(Arrays.toString(second) + " is the largest one ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] firs = {1,2,3,4};
		int[] seco = {1,2,3,4,5};
		biggerArrayis(firs, seco);
	}

}
