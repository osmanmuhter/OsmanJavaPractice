package Day26;
import java.util.*;
public class StringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String taskStr = "Imaqtpie";
//		int count = taskStr.length();
		
//		char[] taskChar = new char[count];
//		
//		for (int i=0;i<count;i++) {
//			
//			taskChar[i] = taskStr.charAt(i);
//		}
		char [] myChars = taskStr.toCharArray();
		System.out.println(Arrays.toString(myChars));
		
		
	}

}
