package Day65;
import java.util.*;
public class CollectionFrameWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCABCEFGADBHYKJSGD";
		char[] arrs = str.toCharArray();
		
		List<char[]> asList =Arrays.asList(arrs);
		List<Character> lst1 = new ArrayList<>();
			for (char chars : arrs) {
			lst1.add(chars);
			}
			Set <Character> myset = new HashSet(lst1);
			System.out.println(lst1);
			System.out.println(myset);
	}

}
