package Day33;

import java.util.Arrays;

public class combineArra {
public static double[] addArr(double[] a1,double[] a2) {
	int count= a1.length;
	int count2 = a2.length;
	double[] combined = new double[count+count2];
	for (int i=0;i<count;i++) {
		combined[i] = a1[i];
	}
	for (int j =0;j<count2;j++) {
		combined[count+j] = a2[j];
	}
	return combined;
	
}
public static void main(String[] args) {
	double[] first = {2.44,3.67,2.52,2.88};
	double[] second = {3.65,88.22,12.34};
	System.out.println(Arrays.toString((addArr(first, second))));
}
}
