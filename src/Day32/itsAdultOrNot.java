package Day32;

public class itsAdultOrNot {
public static boolean isAdultOrNot(int num) {
	if (num >= 18) {
		return true;
	}
	else
		return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 5;
		int age2 = 15;
		int age3 = 21;
		
		System.out.println(isAdultOrNot(age));
		System.out.println(isAdultOrNot(age2));
		System.out.println(isAdultOrNot(age3));
		boolean result = isAdultOrNot(age3);
		System.out.println(result);
	}

}
