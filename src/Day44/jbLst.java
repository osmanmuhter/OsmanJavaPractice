package Day44;
import java.util.*;

public class jbLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Job nwJobs = new Job("Developer","Intel",128000);
		Job nwJobs1 = new Job("Game Developer","Apple",128000);
		Job nwJobs2 = new Job("Programmer","Riot",128000);
		Job nwJobs3 = new Job("Dealer","Tesla",128000);
		ArrayList<Job> Jobs = new ArrayList<>();
		Jobs.add(nwJobs);
		Jobs.add(nwJobs1);
		Jobs.add(nwJobs2);
		Jobs.add(nwJobs3);
		System.out.println();
		System.out.println(nwJobs.getTitle());
		System.out.println(nwJobs.getCompany());
		System.out.println(nwJobs.getAnnualSalary());
		String allInfo = nwJobs.getAllInfo();
		for (Job each : Jobs) {
			System.out.println(each);
		}
		
		
	}

}
