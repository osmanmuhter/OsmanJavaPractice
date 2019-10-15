package Day56;

public abstract class Shape {

	String color;

	public Shape(String color) {
		
		this.color = color;
	}
	
	public abstract void  calculateParimeter();
	public abstract void calculateArea();
	public abstract String toString() ;
		
	
	
	
	
}
