package Day46;

public class slackUser {

	private String name;
	private String email;
	private int groupNum;
	 
	public slackUser(String name,String email, int groupNum) {
		this.name = name;
		this.email = email;
		this.groupNum = groupNum;
	}
	
	public slackUser() {
		this("osman","osman.muhter@gmail.com",1);
		System.out.println("Default value setted");
		
	}

	public String toString() {
		return "slackUser [name=" + name + ", email=" + email + ", groupNum=" + groupNum + "]";
	}
	
	public void sendMessage(String channel, String content) {
		System.out.println("User <"+name+"> sent message <"+content + "> to channel <"+ channel +">");
	}
	
	
}
