package Day22;
import java.util.*;
public class IndexOfTask {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number");
		Scanner scan =new Scanner (System.in);
		 String name = scan.next();
		 
		 int indexofFirst = name.indexOf("a");
		 int indexofSecond = name.indexOf("a",indexofFirst + 1);
		 int indexofThird = name.indexOf("a",indexofSecond + 1);
		 
		 System.out.println("first a char at " + indexofFirst + " Place");
		 System.out.println("second a char at " + indexofSecond + " Place");
		 System.out.println("Third a char at " + indexofThird + " Place");
	}

}
