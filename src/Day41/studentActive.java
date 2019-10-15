package Day41;

public class studentActive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		teacher osman = new teacher();
//		System.out.println(osman.name);
//		System.out.println(osman.major);
//		System.out.println(osman.ssn);
		
		osman.setName("Osmanjan");
		osman.setMajor("IT");
		osman.setSSN(1234567l);
		System.out.println(osman.getMajor());
		System.out.println(osman.getName());
		System.out.println(osman.getSSN());
	}

}
