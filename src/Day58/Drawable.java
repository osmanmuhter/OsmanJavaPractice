package Day58;

public interface Drawable {

	public  void DRAWING_TOOL();
	
	void draw();

	default void methodLine(int count) {
		System.out.println("Drawing "+count +" line");
	}
	public  static void printDrawingTool() {
	}
	@Override
	String toString();
	
}
