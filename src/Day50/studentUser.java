package Day50;

public class studentUser extends SlackUsers {

	int groupName;
	
	public studentUser(String displayName, int timeZone, String status, int groupName) {
		this.displayName = displayName;
		this.timeZone = timeZone;
		this.status = status;
		this.groupName = groupName;
	}
	
	
	public String toString() {
		return "studentUser [groupName=" + groupName + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
