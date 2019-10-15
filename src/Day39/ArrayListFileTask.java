package Day39;
import java.nio.file.*;
import java.util.List;

public class ArrayListFileTask {
	
	public static List<String> getTextFileAsList( String filePath) {
		List<String> allLines = null;
		try {
			allLines = Files.readAllLines(Paths.get(filePath));
			
		} catch (Exception e) {
			System.out.println("Wrong file path probably");
		}
		return allLines;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<String> lst1 = getTextFileAsList("osman.txt");
		
		System.out.println(lst1);
		
	}

}
