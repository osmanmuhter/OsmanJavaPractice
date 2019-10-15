package Day26;
import java.util.*;
public class ToCharArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		String userWord = scan.next();
		System.out.println("And enter a char you want to count");
		String userChar = scan.next();
		char userLookingFor = userChar.charAt(0);
		char[] turnChar = userWord.toCharArray();
		
		int count=0;
		int size = turnChar.length;
		 for (int i =0;i<size;i++) {
			 if (turnChar[i]==userLookingFor) {
				 count++;
			 }
		 }
		 System.out.println(Arrays.toString(turnChar));
		 System.out.println("And your word contains " + count + " "+userLookingFor+ " letter");
	}

}
