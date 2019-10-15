package Day33;

public class getConcatination {
public static String gtConcatination(String[] combo) {
	String empty = "";
	int count = combo.length;
	for (int i =0;i<count;i++) {
		empty = empty +combo[i]+" ";
	}
	return empty;
}
	public static void main(String[] args) {
		String[] names = {"osman","miyassar","yusuf","muhtar","sherin","mustafa"};
System.out.println(gtConcatination(names));
	}

}
