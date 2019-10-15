package Day55;

public abstract class Employee {

	 int id;
	 String name;
	 int MonthlyHourWorked;
	 double hourlyRate;
	 int MonthlySalary;
	
	public  Employee(int id, String name, int MonthlyHourWorked, double hourlyRate) {
		
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
		
	}
	
public void CalculateAnualSalary() {
		
	}


	@Override
	public String toString() {
		return "SalariedEmployee [id=" + id + ", name=" + name + ", MonthlySalary=" + MonthlySalary + "]";
	}


	

	


	public int getMonthlySalary() {
		return MonthlySalary;
	}


	public void setMonthlySalary(int monthlySalary) {
		MonthlySalary = monthlySalary;
	}
}
