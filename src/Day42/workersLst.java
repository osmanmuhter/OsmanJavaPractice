package Day42;

import java.util.*;

public class workersLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.name = "Osman";
		e1.age = 22;
		e1.title = "Task Manager";
		e1.salary = 150000.00;

		Employee e2 = new Employee();

		e2.name = "Apatsum";
		e2.age = 27;
		e2.title = "Task Manager";
		e2.salary = 190000.00;

		Employee e3 = new Employee();

		e3.name = "Nirex";
		e3.age = 33;
		e3.title = "Task Manager";
		e3.salary = 90000.00;

		Employee e4 = new Employee();

		e4.name = "Jhon";
		e4.age = 53;
		e4.title = "Task Manager";
		e4.salary = 23000.00;
		
		ArrayList<Employee> myPeople = new ArrayList<>();
		myPeople.add(e1);
		myPeople.add(e2);
		myPeople.add(e3);
		myPeople.add(e4);
		myPeople.add(new Employee() );
		
		for (int i =0; i< myPeople.size(); i++) {
			
			Employee each =myPeople.get(i);
			
			each.printAllInfo();
		}
	}

}
