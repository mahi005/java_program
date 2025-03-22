package collectionProgram;

import java.util.Iterator;
import java.util.LinkedList;
public class Mainclass7 {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("manual");
		li.add("selenium");
		li.add("API");
		li.add("null");
		li.add("API");
		li.add(new StringBuffer("Testing"));
		li.add(new Object());
		li.add(143);
		li.add(new StringBuilder("adv selenium"));
		Iterator itr= li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
