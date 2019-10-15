package Day32;

public class getBiggerNums {
public static int biggestNum(byte a , byte b) {
	if (a > b) {
		return a;
	}
	else 
		return b;
}
	public static void main(String[] args) {
		System.out.println((biggestNum((byte)6,(byte) 2)));
		
	}

}
