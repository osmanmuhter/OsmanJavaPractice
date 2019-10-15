package Day58;

public class Triangle implements Shape {

	int height;
	int base;
	private void calculateArea(int height , int base) {
		double res = (height + base)/2;
		System.out.println("Area is " + res);
		
	}
	public Triangle(int height, int base) {
		super();
		this.height = height;
		this.base = base;
	}
	
}
