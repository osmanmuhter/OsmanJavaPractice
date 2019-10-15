package Day27;

import java.util.*;;

public class warmUpTask {

	public static void main(String[] args) {
	
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		
		String[] arrStr = str.split(" ");
		System.out.println(Arrays.toString(arrStr));
		
		
		
		for(int i =0;i<8;i++) {
			String one =arrStr[i];
			char [] cyberChars = one.toCharArray();
			System.out.println();
			System.out.println(one);
			for (int j =0;j<cyberChars.length;j++) {
				System.out.print(cyberChars[j] + "-");
				sout
			}
			
		}
		
		
	}

}
