package Day47;
import java.util.*;
public class StudentUtility {

	private static ArrayList<String> studentList;
	
	static {
		System.out.println("Welcome to StudentUtility");
	}
	
	static {
		loadAllMyData();
		System.out.println("All data has been loaded");
		
	}
	public static void main(String[] args) {
		
		displayAllStudent();
	}
	
	public static void displayAllStudent() {
		int i =1;
		for(String each : studentList) {
			System.out.println("No : "+(i++)+" student is " + each);
		}
	}
	
	public static void addStudent(String name) {
		studentList.add(name);
	}
	
	public static void updateStudent(int index, String name) {
		studentList.set(index, name);
	}
	
	public static void removeStudent (int index) {
		studentList.remove(index);
	}
	
	public static void resetStudent() {
		studentList.clear();
	}
	
	private static void loadAllMyData() {
		studentList = new ArrayList<String>();
		studentList.add("osman");
		studentList.add("sherin");
		studentList.add("yusuf");
		studentList.add("muhtar");
		studentList.add("muyassar");
		studentList.add("mustafa");
		studentList.add("sutuk");
		studentList.add("nafisa");
		studentList.add("aruna");
		studentList.add("mvldur");
	}
}
