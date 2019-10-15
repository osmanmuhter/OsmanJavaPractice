package Day55;

public class HourlyEmployee extends Employee {

	private int id;
	private String name;
	private int MonthlyHourWorked;
	private double hourlyRate;
	
	public  HourlyEmployee(int id, String name, int MonthlyHourWorked, double hourlyRate) {
		super();
		this.id = id;
		this.name = name;
		this.MonthlyHourWorked = MonthlyHourWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonthlyHourWorked() {
		return MonthlyHourWorked;
	}

	public void setMonthlyHourWorked(int monthlyHourWorked) {
		MonthlyHourWorked = monthlyHourWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void calculateAnualSalary() {
		double anual = MonthlyHourWorked * hourlyRate * 12;
		System.out.println("The salary is "+ anual);
	};
	
	
	
	
}
