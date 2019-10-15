package Day41;

public class AirContitioner {

	
	private String brand;
	private float currentTemp;
	private boolean isOn;
	
	public void displayTheBrand() {
		System.out.println("The brand is " +brand);
		
	}
	
	public void showCurrentTemp() {
		System.out.println("The current temp is " +currentTemp);
	}
	
	public void displayAllInfo() {
		System.out.println(brand+" " + currentTemp+ " " + isOn);
	}
	
	public void turnOn() {
		if(isOn == false) {
			isOn = true;
			System.out.println(isOn);
		}
		
	}
	
	
	public void turnOff() {
		if (isOn == true) {
			isOn = false;
			System.out.println(isOn);
		}
	}
	
	public void increaceTemp(int x) {
		currentTemp += x;
	}
	
	public void decreaceTemp(int x) {
		currentTemp -= x;
	}
	
	public String getBrand() {
		return brand;
	}
	public float getTempture() {
		return currentTemp;
	}
	
	public void setBrand(String newBrand) {
		newBrand = brand;
	}
	
	public void setTempture(float nums) {
		currentTemp = nums;
	}
}
