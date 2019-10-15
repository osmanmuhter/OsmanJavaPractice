package Day46;
import java.util.*;
public class SlackAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slackUser u1 = new slackUser();
		slackUser u2 = new slackUser("Mustafa","mustafa.jadit@gmail.com",2);
		slackUser u3 = new slackUser("Sherin","Sherinmuhter@gmail.com",3);
		slackUser u4 = new slackUser("Yusuf","Yusufmuhtar@gmail.com",4);
		
		ArrayList<slackUser> arr = new ArrayList<slackUser>();
		arr.add(u1);
		arr.add(u2);
		arr.add(u3);
		arr.add(u4);
		for (slackUser each: arr) {
		each.sendMessage("osmanjan", "i love u");
			System.out.println(each);
			
		}
	}

}
