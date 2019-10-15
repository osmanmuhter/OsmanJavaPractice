package Day34;

public class printNames {
public static void passNames (String ... name) {
	System.out.println("You passed " + name.length + " arguments");
}
	public static void main(String[] args) {
	passNames("osman","Mustafa","Sherin","Han");
	}

}
