package Day57;

import java.util.ArrayList;

public class ChromeDriver implements WebDriver {

	int screenSize;
	double positionX;
	
	public ChromeDriver(int screenSize, double positionX) {
		super();
		this.screenSize = screenSize;
		this.positionX = positionX;
	}
	
	@Override
	public void openBowser() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void navigateTo(String url) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String findElementByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ArrayList<String> findElementByTagName(String tagName) {
		ArrayList<String> allElements = new ArrayList<>();
		
		return null;
	}
	
	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver(17, 1.11);
		c1.findElementByID(id)
	}
}
