package collectionProgram;

import java.util.HashSet;
import java.util.Iterator;

public class Mainclass8 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("manual");
		hs.add("selenium");
		hs.add("API");
		hs.add("null");
		hs.add("API");
		hs.add(new StringBuffer("Testing"));
		hs.add(new Object());
		hs.add(143);
		hs.add(new StringBuilder("adv selenium"));
		Iterator itr= hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}
}
