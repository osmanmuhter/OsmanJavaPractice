package Day63;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class HandleOrDeclare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			playWithFire();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("caught the Fish");
		}
		
	
		
	}
	
	public static void playWithFire() throws IOException, RuntimeException {
		
		System.out.println("Playing with fire");
		
		throw new RuntimeException();
	}

}
