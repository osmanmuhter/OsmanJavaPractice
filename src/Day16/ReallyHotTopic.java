package Day16;

public class ReallyHotTopic {

	public static void main(String[] args) {
	
		String s1 = "abc"; // using string literal
		
		String s2 = new String ("abc"); // using new keyword
		
		String s4 = new String ("abc");
		
		System.out.println( s1 == s2);
		
		String s3 = "abc";
		
		System.out.println(s1 == s3);
		
		System.out.println(s2 == s4);
				
		
		
		
	}

}
