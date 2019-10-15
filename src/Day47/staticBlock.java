package Day47;

public class staticBlock {

	public static String school;
	public static boolean isRamadan;
	static {
		school = "CyberTek School";
		System.out.println("Welcome to our school: " + school);
		System.out.println("Let the journey begin");
		
	}
	static {
		if(isRamadan) {
			System.out.println("Use ramadan schedule");
			
		}
		else 
			System.out.println("Use normal schedule");
	
	}
}
