package collectionProgram;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Mainclass10 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("Alia");
		ts.add("Tamanah");
		ts.add("Priyanka");
		ts.add("Katrina");
		ts.add("Kirti");
		ts.add("Sridevi");
		ts.add("Alia");
		Iterator itr= ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}
}
