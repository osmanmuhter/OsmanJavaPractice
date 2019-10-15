package Day54;

public class FinalParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    printItems("abc def");
	}

	private static void printItems(final String items) {
		// TODO Auto-generated method stub
		// final method parameter will ensure the argument 
		//items = "Some other item";
		System.out.println("The item is " + items);
	}

}
