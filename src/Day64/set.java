package Day64;

import java.util.*;
public class set {
public static void main(String[] args) {
	List<Integer> mylst = Arrays.asList(3,3,3,3,43,34,93);
	
	Set<Integer> myset = new HashSet<>(mylst);
	System.out.println(mylst);
	System.out.println(myset);
	
	Set<Integer> myset2 = new HashSet<>(Arrays.asList(3,3,3,3,3,34,35,93));
	System.out.println(myset2.size());
	System.out.println(myset2);
	//retainAll will keep the common part of two collection
	myset.retainAll(myset2);

	
	
	TreeSet<Integer> myTreeset = new TreeSet<>();
	myTreeset.add(-100);
	myTreeset.add(10);
	myTreeset.add(120);
	myTreeset.add(190);
	myTreeset.add(130);
	myTreeset.add(50);
	myTreeset.add(-20);
	myTreeset.add(30);
	myTreeset.add(350);
	System.out.println(myTreeset);
	System.out.println("Lowest element" + myTreeset.first());
	System.out.println("Highst element" + myTreeset.last());
	//headSet will output the elemnt by the number you input
	// and true will inculude the value that you input
	System.out.println(myTreeset.headSet(10));
	System.out.println(myTreeset.headSet(10,true));
	//tailSet will continute the begin that the number you entered
	System.out.println(myTreeset.tailSet(10));
} 
}
