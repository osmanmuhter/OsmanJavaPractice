package Day46;

public class CyberHouse {

	int houseNumber;
	String design;
	
	static String neibourhoodName;
	
	private CyberHouse(int houseNumber,
			String design) {
		this.houseNumber = houseNumber;
		this.design = design;
	}
	
	public static CyberHouse someHouse(int houseNumber, String design) {
		CyberHouse s1 =new CyberHouse(houseNumber, design);
		return s1;
	}
}
