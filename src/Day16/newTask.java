package Day16;

public class newTask {

	public static void main(String[] args) {

		String str;
		str = "Sunday is Java Day";
		String upperStr = str.toUpperCase();

		System.out.println(upperStr);

		String lastTwo = str.substring(str.length() - 2);

		System.out.println(lastTwo);

		int positionOfIs = str.indexOf("is");

		System.out.println("The position of is on the " + positionOfIs);

		int firstSpace = str.indexOf(" ");
		
		System.out.println(str.indexOf(" ",7));
		System.out.println(str.indexOf(" ",10));
		
		System.out.println(str.substring(10 , 15));
		

	}

}
