package mynewpackege;

import java.util.Scanner;

public class terter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double price ;
		String label;
		
		System.out.println("Please type the price for the product");
		price = scan.nextDouble();
		
		label = (price > 100 ) ? "expansive":"cheap" ;
		System.out.println(label);
	}

}
