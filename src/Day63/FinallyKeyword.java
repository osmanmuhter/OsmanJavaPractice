package Day63;

public class FinallyKeyword {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println("try block");
		} catch (Exception e) {
			System.out.println("Caught");
			// TODO: handle exception
		}
		finally {
			System.out.println("This code will run no metter we have exception or not");
		}
		System.out.println("End");
	}
}
