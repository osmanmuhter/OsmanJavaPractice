package Day29;

import java.util.Arrays;

public class Two2DArra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pizza = {
				{
					"green pepper","mashroom","olive"
				},
				{
					"Cucumber","Pineapple","Melon"
				},
				{
					"Chicken","Beef","Shirmp"
				}
		};
		System.out.println(Arrays.deepToString(pizza));
		for (String[] topping : pizza) {
			System.out.println();
			for (String each : topping) {
				if ()
				System.out.print(each + "|");
			}
				
		}
	}

}
