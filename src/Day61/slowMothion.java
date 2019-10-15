package Day61;

public class slowMothion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Starting");
	
	  for (int i=1; i <= 10; i++) {
		System.out.println("i  is " + i);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught");
		}
	
	}
	  System.out.println("Ending");
	}

}
