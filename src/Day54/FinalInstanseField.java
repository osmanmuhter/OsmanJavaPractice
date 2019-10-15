package Day54;

public class FinalInstanseField {

	//Final Field must be initialized 
	//Before the object creation completed
	final int NUM =100;
	final int NUM1 = getNumber();
	final int NUM2;
	final int NUM3;
	
	{
		NUM2 = 200;
	}
	
	public FinalInstanseField() {
		NUM3 = 300;
		
	}
	
	
	private int getNumber() {
		// TODO Auto-generated method stub
		return 150;
	}
	
	public static void main(String[] args) {
		
		
		FinalInstanseField f1 = new FinalInstanseField() ;
		System.out.println(f1.NUM);
		System.out.println(f1.NUM2);
		System.out.println(f1.NUM1);
		System.out.println(f1.NUM3);
		
		System.out.println("The end");
	}
}
