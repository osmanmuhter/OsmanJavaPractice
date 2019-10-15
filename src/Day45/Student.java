package Day45;

public class Student {

	
	String name;
	int age;
	boolean tired;
	String major;
	
	
	public Student() {
		this("No name");
		System.out.println("no arg");
	}
	
	public Student(String name) {
		System.out.println("One arg" + name);
		
	}
	
	public Student(String name,int age, boolean tired,String major) {
		this.name=name;
		this.age = age;
		this.tired = tired;
		this.major = major;
	}
	
	public Student(boolean tired) {
		this("osman",22,tired,"Computer Sience");
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", tired=" + tired + ", major=" + major + "]";
	}
	
	
}
