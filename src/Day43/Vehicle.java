package Day43;

public class Vehicle {

	
	private String model;
	private String make;
	private int speed;
	
	public String getModel() {
		return model;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setModel(String mdname) {
		model = mdname;
	}
	public void setMake (String mkname) {
		make = mkname;
	}
	public void setSpeed (int spnumber) {
		speed = spnumber;
	}
	
	public void increaseSpeed(int increaseBy) {
		System.out.println();
		System.out.print("Increasing Speed now ");
		for (int i=0;i<increaseBy;i++) {
			speed= speed + 1;
		
			System.out.print(speed + "-");
		}
	}
	
	public void decreaseSpeed(int decreaseBy) {
		System.out.println();
		System.out.print("Decreasing speed now ");
		for (int i=0;i<decreaseBy;i++) {
			speed= speed - 1;
			System.out.print(speed + "-");
		}
	}
	
	public void getAllInfo() {
		System.out.println(" Model is --" + model + " Make is ---"+ make + " Speed is "+ speed);
	}
	
}
