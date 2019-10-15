package Day21;

public class task2one {

	public static void main(String[] args) {
		
		for (int i =1;i<=100;i++) {
			if(!(i%2 ==0)) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i =1;i<=100;i++) {
			if (!(i%4 ==0)) {
				continue;
			}
			System.out.print(i +" ");
		}
		System.out.println();
		
		for (int i =1;i<=100;i++) {
			if ((i%3 ==0)&&(i%3 ==0)) {
				continue;
			}
			System.out.print(i +" ");
		}
		
	}

}
