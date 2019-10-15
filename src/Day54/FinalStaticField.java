package Day54;

public class FinalStaticField {

	public static final String RACE = "HUMAN";
	public static final int MAX_SPEED ;//All CAPS FOR FINAL FIELD IS RECOMMENDED;
	
	static {
		MAX_SPEED= 150;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(MAX_SPEED);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
	}

}
