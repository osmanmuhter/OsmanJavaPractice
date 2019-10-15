package Day56;

public class Circle extends Shape {
	double areaOfCircle;
	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public  void  calculateParimeter() {
	double c =2 * Math.PI * radius;
	System.out.println("Calculated parimeter is :" + c);
	}
	public  void calculateArea() {
	double a = Math.PI * radius* radius;
		System.out.println("Calculated area is : " + a);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}
}
