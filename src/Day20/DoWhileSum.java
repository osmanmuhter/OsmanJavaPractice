package Day20;

public class DoWhileSum {

	public static void main(String[] args) {
		
		int x = 0;
		int reserved = 0;
		
		do {
			reserved += x;
			x++;
			if (reserved >40) {
				break;}
		} while(x <=10);
		
		System.out.println("the sum of 1 to 10 is "+ reserved);
	}

}
