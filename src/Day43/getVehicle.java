package Day43;
import java.util.*;
public class getVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v1 = new Vehicle();
		v1.setModel("Toyota");
		v1.setMake("Supra");
		v1.setSpeed(125);
		
		Vehicle v2 = new  Vehicle();
		v2.setModel("Dodge");
		v2.setMake("Charger Helcat");
		v2.setSpeed(160);
		
		Vehicle v3 = new Vehicle();
		v3.setModel("INFINITI");
		v3.setMake("G37");
		v3.setSpeed(150);
		
		v1.getMake();
		v2.getMake();
		v3.getMake();
		
		v1.getAllInfo();
		v2.getAllInfo();
		v3.getAllInfo();
		
		v1.decreaseSpeed(7);
		v2.increaseSpeed(3);
		v3.decreaseSpeed(10);
	}

}
