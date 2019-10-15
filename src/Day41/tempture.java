package Day41;

public class tempture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AirContitioner contitioner = new AirContitioner();
		contitioner.setBrand("Honda");
		contitioner.setTempture(55.4f);
		System.out.println(contitioner.getBrand());
		System.out.println(contitioner.getTempture());
	}

}
