package Day26;
import java.util.*;
public class CharArraysToString {

	public static void main(String[] args) {
		String str1 = "osman dilnara";
		char[] taskchar = str1.toCharArray();
		String str2 = new String (taskchar);
		System.out.println(Arrays.toString(taskchar));
		System.out.println(str2);
		
	}

}
