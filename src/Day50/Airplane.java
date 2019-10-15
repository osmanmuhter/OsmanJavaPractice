package Day50;

public class Airplane extends Vehicle {

	private int wingCount;
	
	public Airplane() {
		
	}
	
	
	public Airplane(String brand,String model, int year, int wingCount) {
		super();
		setBrand(brand);
		setModel(model);
		
		this.year = year;
		this.wingCount = wingCount;
	}


	public String toString() {
		return "Airplane [wingCount=" + wingCount + ", year=" + year +"brand " + getBrand()+" Model "+getModel()+"]" ;
	}


	public void setwingCount(int wingCount) {
		this.wingCount = wingCount;
	}
}
