package Day20;

public class forLoopGetChar {

	public static void main(String[] args) {
		String name = "Mustafa Sherin Osman Yusuf Muhtar Miyassar ";
		int count = name.length();
		//Normal order
		for (int i = 0; i < count; i++) {
			System.out.print(name.charAt(i)+ " ");
		}
		System.out.println();
		//Reverse order
		for (int i = count -1 ; i >=0; i--) {
			System.out.print(name.charAt(i)+  " ");
		}
	}

}
