package Day17;

public class WhileLoop {

	public static void main(String[] args) {
	
		int x = 49;
		
		while (x< 100) {
			x +=1;
			if (!(x%2 ==0)) {
			System.out.println("odd number is " + x);
			}
			else if (x>=50 || x<=100) {
			System.out.println("even number is" + x);
		}
			
		
		
	}

}
}
