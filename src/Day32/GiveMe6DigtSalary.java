package Day32;

public class GiveMe6DigtSalary {
public static long giveMe6DigtSalary () {
	return  16000L ;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long nums = giveMe6DigtSalary();
System.out.println(nums);
System.out.println(giveMe6DigtSalary());
long sumsIn2Year = nums + giveMe6DigtSalary();
System.out.println(sumsIn2Year);
	}

}
