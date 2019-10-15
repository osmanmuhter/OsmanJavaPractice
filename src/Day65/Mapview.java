package Day65;
import java.util.*;
import java.util.Map.Entry;
public class Mapview {
public static void main(String[] args) {
	//Comparator<Integer> idCom = Comparator.reverseOrder();
	// will reverse the Collection order from less to high or high to less
	Map<String, Double> priceMap = new HashMap<>();
	System.out.println("PriceMap size: "+ priceMap.size());
	
	priceMap.put("Hangga", 4.44);
	priceMap.put("Jusay", 4.11);
	priceMap.put("kawa",  5.02);
	priceMap.put("manta", 5.11);
	System.out.println(priceMap);
	
	Set<String> allProducts = priceMap.keySet();
	System.out.println(allProducts);
	
	
	Collection<Double> allMyPrice = priceMap.values();
	System.out.println(allMyPrice);
	
	allMyPrice.remove(4.11);
	System.out.println(priceMap);
	
	Set<  Entry  <String, Double>    > myEntry = priceMap.entrySet();
	//getKey(); -> return the key of the entry
	//getValue(); -> return the value of the entry
	//setValue(); -> change the value of the entry
	
	for (  Entry   <String, Double> entry: myEntry) {
		System.out.println("entry : " + entry);
		System.out.println("entry.getKey() " + entry.getKey());
		System.out.println("engry.getValue() " + entry.getValue());
		if (entry.getValue() > 4.0) {
			
			entry.setValue(0.22);
			
		}
	}
	System.out.println(priceMap);
	
	SortedMap<Integer, String> studentMap =
			new TreeMap<>();
	
	studentMap.put(5, "Osman");
	studentMap.put(2, "Odfsman");
	studentMap.put(3, "ssman");
	studentMap.put(6, "Oan");
	studentMap.put(9, "sman");
		
	System.out.println(studentMap);
	//Comparator<Integer> idCom = Comparator.reverseOrder();
		// will reverse the Collection order from less to high or high to less
	
	
}
}
