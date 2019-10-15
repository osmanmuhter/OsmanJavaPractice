package Day33;

public class GetFirstCharNlastWord {
public static String Magic (String words) {
	String empty ="" ;
	int firstSpace = words.indexOf(" ");
	int count = words.length();
	String firstWord = words.substring(0, 1);
	int lastWordIndex = words.lastIndexOf(" ");
	String lastWord = words.substring(lastWordIndex+1, count);
	empty = firstWord +  lastWord;
	return empty;
}
	public static void main(String[] args) {
		String sentense = "I love you";
		System.out.println(Magic(sentense));
	}

}
