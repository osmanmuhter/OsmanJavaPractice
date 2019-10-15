package Day63;

public class MultiException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			
			throw new ArithmeticException();
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e1) {
		//use "|" sign to handle multiple exception at same time
			// TODO: handle exception
			System.out.println("Target multi exceptions");
		}
		catch (Exception e) {
			System.out.println("No target exception");
		}
	}

}
