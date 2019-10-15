package Day47;

import java.util.Random;

public class InstanseBlock {

	int num;
	
	{
		System.out.println("Loading the system");
		System.out.println("Almost there");
		System.out.println("Welcome to T-Mobile");
		System.out.println("Hello Osman");
		Random r = new Random();
		num = r.nextInt(100);
	}
	
	public InstanseBlock() {
		System.out.println("Constructor");
	}
	
	public InstanseBlock(String name) {
		System.out.println("Constructor" + name);
	}
}
