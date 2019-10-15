package Day44;

public class Job {

	private String title;
	private String company;
	private int annualSalary;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	
	
	public Job() {
		title = "undefine";
		company = "unknown";
		
	}
	
	public Job(String title) {
		this.title = title;
	}
	
	public Job(String title, String company, int annualSalary) {
		this.title = title;
		this.company = company;
		this.annualSalary = annualSalary;
	}
	
	public String getAllInfo() {
		String allInfo;
		return  allInfo = "The title is " + title +" The company is " +
	company + " The annual salary is " +annualSalary;
	}

	@Override
	public String toString() {
		return "Job [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}

}
