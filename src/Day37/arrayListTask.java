package Day37;
import java.util.*;
public class arrayListTask {

	public static void main(String[] args) {
		
		ArrayList<Double> priceList = new ArrayList();
		priceList.add(3.55);
		priceList.add(9.22);
		priceList.add(15.25);
		priceList.add(92.85);
		priceList.add(0.99);
		int count = priceList.size();
		for(int i = 0 ;i<count;i++) {
			if(priceList.get(i)>10)
			System.out.println("first way " +priceList.get(i));
		}
		for (double nums: priceList) {
			if( nums>10) {
				System.out.println(nums + "This is second way");
			}
		}
		
		ArrayList<Integer> nwList = new ArrayList<>() ;
		nwList.add(100);
		nwList.add(200);
		nwList.add(250);
		nwList.add(120);
		nwList.add(350);
		System.out.println(nwList);
		nwList.add(1,222);
		System.out.println(nwList);
		nwList.set(1, 333);
		System.out.println(nwList);
		
	}

}
