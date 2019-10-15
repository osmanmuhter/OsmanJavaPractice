package Day54;

public class superCar {

	
	final String model;
	final String make;
	final Engine engine;
	
	
	public superCar(String model, String make, Engine engine) {
		this.model = model;
		this.make = make;
		this.engine =engine;
	}
	
	public void start() {
		engine.start();
	}
	
	public void starting() {
		System.out.println("make is<"+make+"> and model is<"+model+"> and has <"+engine.cilinderCount+" cilinder");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine e1 = new Engine("Turbo",8);
		
		superCar s1 = new superCar("Charger","Dodge",e1);
		
	}

}
