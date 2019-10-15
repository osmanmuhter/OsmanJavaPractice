package Day35;

public class WarmUpTask {

	public static String theLongestWorld(String... vararg) {
		String max = "";
		int mmax = max.length();
		for (String eachWords : vararg) {
			if ( max.length() < eachWords.length()) {
				max = eachWords;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = theLongestWorld("osman","Muhjhjstafa","Sherin","Abdugofur");
		
	System.out.println(result);	
		
	}

}
