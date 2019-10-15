package mynewpackege;

public class weatherCheck {

	public static void main(String[] args) {
		String weather = false;
		String result;
		
		result = ( weather.equalsIgnoreCase("sunny")  ) ? "go out!":"stay home";
		System.out.println(result);
	}

}
