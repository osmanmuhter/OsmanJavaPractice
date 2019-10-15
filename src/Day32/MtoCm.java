package Day32;

public class MtoCm {
public static double MtoCm (double meter) {
	return 100* meter ;
	
}
public static double  FtoInch (int feet) {
	return 12 * feet;
}
public static double FtoSelsius (int fi) {
	return ((fi-32)*5)/9 ;
}
	public static void main(String[] args) {
		System.out.println(MtoCm(2.5)+"cm");
		System.out.println(FtoInch(5)+ "inch");
		System.out.println(FtoSelsius(85) + " c");
	}

}
