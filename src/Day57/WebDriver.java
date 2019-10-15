package Day57;

import java.util.ArrayList;

public interface WebDriver {

	String PURPOSE = "Automating Browser";
	
	public abstract void openBowser();
	public abstract void navigateTo(String url);
	public abstract void quit();
	
	public abstract String findElementByID(int id) ;
	public abstract ArrayList<String> findElementByTagName(String tagName);
}
