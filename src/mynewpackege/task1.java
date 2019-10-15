package mynewpackege;

import java.util.Scanner;
 

public class task1 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the year you born");
		
		int year = Input.nextInt(); 
		int age = 2019 - year;
		
		System.out.println("you born in "  + year );
		System.out.println("And you are " + age +" years old" );
				
	}

}
