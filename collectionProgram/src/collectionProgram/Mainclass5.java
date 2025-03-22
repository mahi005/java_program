package collectionProgram;
import java.util.ArrayList;
import java.util.Iterator;
//-------------ArrayList-------------------------------------------------------------------------------
public class Mainclass5 {
public static void main(String[] args) {
	ArrayList al= new ArrayList();
	al.add("java");
	al.add(100);
	al.add("sql");
	al.add(null);
	al.add(new StringBuffer("Testing"));
	al.add(new Object());
	al.add("java");
	al.add(null);
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(al.get(4));
}
}
