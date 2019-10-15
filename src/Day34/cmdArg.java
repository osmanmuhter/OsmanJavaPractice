package Day34;

public class cmdArg {

	public static void main(String... args) {
		System.out.println(args.length);
		for(String eachWords: args) {
			System.out.println(eachWords + " ");
		}
		
	}

}
