package Day29;

public class SkipSlideTask {

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
		
		inner: // <== this is label can name the loop 
			for (int i = 0;i<pizza.length;i++) {
				System.out.println("Slice number : " + (i+1));
				
				for (int j=0;j<pizza[i].length;j++) {
					if (pizza[i][j] =="Cucumber")
						break inner;
					System.out.println(pizza[i][j] + "\t");
					
				}
				System.out.println();
			}
		
	}

}
