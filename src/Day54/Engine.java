package Day54;

public class Engine {

	
	final String engineType;
	final int cilinderCount;
	
	public Engine(String engineType, int cilinderCount) {

		this.engineType = engineType;
		this.cilinderCount = cilinderCount;
	}

	public  void start() {
		System.out.println("engine <" + engineType + ">");
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", cilinderCount=" + cilinderCount + "]";
	}
	
}
