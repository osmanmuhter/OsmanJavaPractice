package Day46;

public class HouseBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CyberHouse h2 = CyberHouse.someHouse(1,"Lee Xiao");
		CyberHouse h3 = CyberHouse.someHouse(2, "Fan bb");
		
		CyberHouse.neibourhoodName = "Lee Hwy";
		System.out.println(CyberHouse.neibourhoodName);
		System.out.println(h3.houseNumber);
		System.out.println(h2.design);
		
		h2.neibourhoodName = "osman";
		System.out.println(h2.neibourhoodName);
	}

}
