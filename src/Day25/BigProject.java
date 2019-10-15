package Day25;
import java.util.*;
public class BigProject {

	public static void main(String[] args) {
	Scanner scan =new Scanner (System.in);
	String[] names = {"Online Java Programming",
					  "Online Software Development LifeCycle",
					  "Online Software QA Testing",
					  "Online Team Activity",
					  "Online Monitoring",
					  "Online Selenium",
					  "Online SQL",
					  "Online API Testing"
	};
	
	int[] courseID = {143,166,168,170,163,203,169,171};
	for (int j=0;j<names.length;j++) {
		System.out.println("The course ID for "+ names[j] +" is " +courseID[j]);
	}
	System.out.println("Please type the name of courses");
	String custom = scan.next();
	if (custom.contains("Programming")) {
		System.out.println("The course id of " + names[0] + " is " + courseID[0]);
	}
	else if (custom.contains("Team")) {
		System.out.println("The course id of " + names[3] + " is " + courseID[3]);
	}
	else if (custom.contains("API")) {
		System.out.println("The course id of " + names[7] + " is " + courseID[7]);
	}

	int count = 0;
	 for (int k=0;k<names.length;k++) {
		 if (names[k].contains("Software")) {
			 count++;
		 }
	 }
	 System.out.println(count +" Courses has Software major");
}}
