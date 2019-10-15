package Day13;

public class MoreStringPractice {

	public static void main(String[] args) {

		// s1.contains("something")  ---> check for part of string inside another string
		//	s1.indesOf("s") ---> this will give you position of certain part of the string
		//			 01234567
		String s1 = "Osmanjan";
		System.out.println("does name contains u? ---> " + s1.contains("u"));
		
		
		String s2 = "Sherun";
		System.out.println("where is the char U in the name ? --->" + s2.indexOf("u"));
		
		// subString(beginning index, ending index)
		// it will return part of a string starting from beginnning till right before ending index
		
		String partOfString = s1.substring(1,4);
		System.out.println(partOfString);
	}

}