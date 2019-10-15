package Day36;
import java.util.*;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList lst1 = new ArrayList();
lst1.add("osman");
lst1.add("oca");
lst1.add(new Integer(15) );
lst1.add(Character.valueOf('d') );
System.out.println(lst1);
int count = lst1.size();
for (int i =0;i<count;i++) {
	
	System.out.println(lst1.get(i));
}

	}

}
