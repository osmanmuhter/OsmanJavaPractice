package Day24;
import java.util.*;
public class getRandomNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int[] nums= new int[8];
		
		
		for( int j=0;j<8;j++) {
			nums[j] =rand.nextInt(55);
			
		}
		System.out.println(Arrays.toString(nums));
		
	}

}
