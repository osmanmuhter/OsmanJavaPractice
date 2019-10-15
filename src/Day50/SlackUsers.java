package Day50;

public class SlackUsers {

	String displayName;
	int timeZone;
	String status;
	
	public SlackUsers() {
		
	}
	
	public SlackUsers(String displayName, int timeZone, String status) {
		
	}
	
	public void sendMessage(String messages) {
		System.out.println("<" +displayName +"> is sending <"+ messages+".>" );
	}
	
	public void changeStatus(String status) {
		this.status = status;
	}
}

