
package Day56;

public class Rectangle extends Shape {

	protected double width;
	protected double height;
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	@Override
	public void calculateParimeter() {
		// TODO Auto-generated method stub
		System.out.println("Parimeter is :" +(2*width+2*height));
	}
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area is :"+width*height);
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
	}
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle("blue", 5, 4);
		r1.calculateArea();
		r1.calculateParimeter();
		
		Circle c1 = new Circle("red",3);
		 c1.calculateArea();
	}
	}
	
	
	
}
