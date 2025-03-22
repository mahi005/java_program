package collectionProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Mainclass14 {
	public static void main(String[] args) {
		TreeMap tm= new TreeMap();
		tm.put("Qspider", "testing");
		tm.put("jspider", "java");
		tm.put("pyspider", "python");
		tm.put("Automation", "Selenium");
		tm.put("Automation", "Cypress");
		tm.put("Developer", "java");
		tm.put("boys", 90);
		Set s=tm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
