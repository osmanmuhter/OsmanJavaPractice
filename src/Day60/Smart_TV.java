package Day60;

public class Smart_TV extends TV {

	int chanelCount = 200;

	@Override
	public void play() {
		System.out.println("Playing");
	}

	public static void main(String[] args) {
		TV s1 = new Smart_TV();
		System.out.println(s1.channelCount);
		
	}
	
	@Override
	public int getChanelCount() {
		// TODO Auto-generated method stub
		return super.getChanelCount();
	}
	

}
