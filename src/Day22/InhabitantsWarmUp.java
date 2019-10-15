package Day22;

import java.util.*;
public class InhabitantsWarmUp {

	public static void main(String[] args) {
		
		System.out.println("Please Enter the number of inhabitants");
		Scanner scan =new Scanner (System.in);
		
		int inhabitants = scan.nextInt();
		int day = 0;
		
		while(inhabitants > 0) {
			System.out.println("Day is" + day + " [" + inhabitants + "]");
			inhabitants = inhabitants/2;
			day++;
		}
		System.out.println("---All die---");
	}

}
