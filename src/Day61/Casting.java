package Day61;

public class Casting {

	public static void main(String[] args) {
		Electronic e1 = new Computer() ;
		
		e1.turnOn();
		
		//if(e1 instranceof Computer){
		
		Computer cp = (Computer) e1;
		cp.code();
		
		//or
		
		((Computer) e1 ).code();
		//second way
		
		
	//}
		
 	}
}
