package Day22;
import java.util.*;
public class getCharOneByOne {

	public static void main(String[] args) {
		System.out.println("Please type name");
		Scanner scan =new Scanner (System.in);
		
		String name = scan.next();
		
		
		for (int i =0;i <name.length();i++) {
		  String eachChar = name.substring(i,i+1);
		   if (!(i==name.length()-1)) {
			   System.out.print(eachChar+ "-");
		   } else
		   {
			   System.out.println(eachChar);
		   }
		}
	}

}
