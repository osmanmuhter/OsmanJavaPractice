package Day27;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] originalArray = {
				"Osman",
				"Sherin",
				"mustafa"
				, "Muhtar"
				, "Muyassar"
				, "Yusuf"
			
				
				
		};
		 String[] copyofOrg = Arrays.copyOf(originalArray, 3);
		 System.out.println(Arrays.toString(originalArray));
		 System.out.println(Arrays.toString(copyofOrg));

	}

}
