package Day42;

import java.util.*;

public class ArrListTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//First way to create ArrayList  - one by one
		ArrayList<Integer> numArr = new ArrayList<>();
		
		numArr.add(1);
		numArr.add(2);
		numArr.add(3);
		numArr.add(4);
		numArr.add(5);
		
		System.out.println(numArr);
		
		// Second way to create ArrayList - by using for loop
		ArrayList<Integer> listNm = new ArrayList<>();
		
		for(int i =1; i<=5;i++) {
			listNm.add(i);
		}
		System.out.println(listNm);
		
		
		// Third way to create ArrayList - by one shot 
		
		List<Integer> lst1 = Arrays.asList(1,2,3,4,5);
		System.out.println(lst1);
		
		// Update the ArrayList item by using .set method
		numArr.set(0, 1*2);
		numArr.set(1,2*2);
		numArr.set(2,3*2);
		numArr.set(3,3*2);
		numArr.set(4,4*2);
		System.out.println(numArr);
		
		// Reverse the item by using Collection Class - must import java.util.*
		Collections.reverse(listNm);
		System.out.println(listNm);
		
		ArrayList<Integer> ranList = new ArrayList<>();
		for (int j =0;j<5;j++) {
			Random rn = new Random();
			int ranNums = rn.nextInt(10) + 1;
			ranList.add(ranNums);
		}
		System.out.println(ranList);
		
	}

}
