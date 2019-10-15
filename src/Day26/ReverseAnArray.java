package Day26;
import java.util.*;
public class ReverseAnArray {

	public static void main(String[] args) {
		int[] numbers = {22,34,26,4,7,8};
		int count = numbers.length;
		int lastIndex = count-1;
		
		for (int i =0;i<count/2;i++) {
			int temp = numbers[i];
			numbers[i]=numbers[lastIndex - i];
			numbers[lastIndex - i] = temp;
		}
		System.out.println(Arrays.toString(numbers));
		
	}

}
