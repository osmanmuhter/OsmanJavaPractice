package Day34;

public class SentenceBuilder {
public static void sentenseBuilder(String...words) {
	String empty = "";
	for(String eachWords : words) {
	empty += eachWords + " ";	
	}
	System.out.println(empty + " ");
}
public static void lastCharacterBuilder (String ...words) {
	String empty = "";
	for (String eachWord : words) {
		int index = eachWord.length();
		char lastChar = eachWord.charAt(index-1);
		empty += lastChar + " ";
	}
	System.out.println(empty);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sentenseBuilder("Osman","Hates" ,"His " , "xxx");
lastCharacterBuilder("osman","yusuf","Sherin","Muyassar","Mustafa");
	}
	

}
