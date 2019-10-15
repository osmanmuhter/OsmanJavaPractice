package Day63;
import java.util.*;
public class Collection {
public static void main(String[] args) {
	
	List<Double> ls1 = new LinkedList<>();
	ls1.add(1D);
	ls1.add(6D);
	ls1.add(7D);
	ls1.add(11D);
	ls1.add(23D);
	ls1.add(12D);
	ls1.add(87D);
	ls1.add(12D);
	System.out.println(ls1);
	List<Double> partOfList = ls1.subList(1, 7);
	System.out.println(partOfList);
	System.out.println("-----update the value of first item");
	partOfList.set(0, 6.9999);
	System.out.println(ls1);
	System.out.println(partOfList);
	
	//what if we want to create an independent list with portion of 
	// the original list item;
	
	List<Double> independentLst = new ArrayList<>( partOfList);
	List<Double> independentLst2 = new ArrayList<>(ls1.subList(1, 5));
	
	List<Double> Lst2 = new ArrayList<>();
	Lst2.add(2d);
	Lst2.add(5d);
	Lst2.add(6d);
	Lst2.add(1d);
	Lst2.add(76d);
	Lst2.add(5d);
	Lst2.add(8d);
	Lst2.add(11d);
	//instead of for( Double each: Lst2){
	//System.out.println("item value " + each);
	 // we can use another code below;
	
	Lst2.forEach(each -> System.out.println("Item value is " + each));
	
	
}
}
