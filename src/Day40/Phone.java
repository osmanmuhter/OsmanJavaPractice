package Day40;

public class Phone {
	
	String type;
	String OS;
	int capacity;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Phone p1 = new Phone();
 p1.type = "Smart Phone";
 p1.OS = "IOS";
 p1.capacity = 128;
	}
	public static void ring() {
		System.out.println("Ringing");
	}
	public static void dial(int nums) {
		System.out.println("");
	}
	

}
