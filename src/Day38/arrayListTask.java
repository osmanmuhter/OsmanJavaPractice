package Day38;
import java.util.*;
public class arrayListTask {

	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> numList = new ArrayList<>();
Integer sum = 0;
Integer avarege =0;
for (int i =0;i<100;i++) {
	numList.add(i,i+1);
	sum += i+1;
	System.out.println(numList);
}
System.out.println("Avarege is " +sum/100);
System.out.println("Sum is " +sum);

ArrayList<Integer> otherLst = new ArrayList<>();
for (int k =100;k>0;k--) {
	otherLst.add(k);
	System.out.println(otherLst);
}
for (Integer eachNum : otherLst) {
	if (eachNum%3==0 && eachNum%5==0) {
		
	}
	
}
for (int j =0;j<otherLst.size();j++) {
	numList.add(otherLst.get(j));
	
}

	}

}
