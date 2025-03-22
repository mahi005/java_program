package collectionProgram;

import java.util.Iterator;
import java.util.Vector;

public class MainClass6 {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add("manual");
	v.add("selenium");
	v.add("API");
	v.add("null");
	v.add("API");
	v.add(new StringBuffer("Testing"));
	v.add(new Object());
	v.add(143);
	v.add(new StringBuilder("adv selenium"));
	Iterator itr= v.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
