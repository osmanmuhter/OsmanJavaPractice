package Day20;

import java.util.Scanner;

public class aCountTask {

	public static void main(String[] args) {
		
		System.out.println("please type a name you want to count A contains in a string");
		Scanner scan =new Scanner (System.in);
		String str =scan.next();
		
		int count =0;
		int x =0;
		
		do {
			
			char c=str.charAt(x);
			if(c=='a') {
				System.out.println("found one A bingo!");
				++count;
			}
			x++;
		} while (x<str.length());
		
		System.out.println("in your string ,there is contains :" + count + "A character");
	}

}
