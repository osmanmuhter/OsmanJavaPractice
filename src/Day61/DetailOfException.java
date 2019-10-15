package Day61;

import java.io.IOException;

public class DetailOfException {
public static void main(String[] args) {
	
	System.out.println("Beginning");
	
	try {
		System.out.println("DOING SOME IO INTENSIVE ACTIONS");
		System.out.println( "READING A FILE");
		//throw new Exception();   this is not work!!!!!
		//throw new FileNotFoundException; this is works, because file
		//because FileNotFoundException is sup class of IOException
		throw new IOException();
	} catch (IOException e) {
		System.out.println("Caught the fish!!!");
		// TODO: handle exception
	}
	System.out.println("Ending");
}
}
