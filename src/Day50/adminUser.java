package Day50;

public class adminUser extends SlackUsers {
	
	int adminLevel;
	public adminUser(String displayName, int timeZone, String status, int adminLevel) {
		this.displayName = displayName;
		this.timeZone = timeZone;
		this.status = status;
		this.adminLevel = adminLevel;
	}
	
	public String toString() {
		return "adminUser [adminLevel=" + adminLevel + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
