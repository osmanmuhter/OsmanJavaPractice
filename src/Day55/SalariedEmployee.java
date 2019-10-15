package Day55;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(int id, String name, int MonthlyHourWorked, double hourlyRate) {
		super(id, name, MonthlyHourWorked, hourlyRate);
		// TODO Auto-generated constructor stub
	}


	private int id;
	private String name;
	private int MonthlySalary;
	
	
	public void CalculateAnualSalary() {
		
	}


	@Override
	public String toString() {
		return "SalariedEmployee [id=" + id + ", name=" + name + ", MonthlySalary=" + MonthlySalary + "]";
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


	public int getMonthlySalary() {
		return MonthlySalary;
	}


	public void setMonthlySalary(int monthlySalary) {
		MonthlySalary = monthlySalary;
	}
	
}
