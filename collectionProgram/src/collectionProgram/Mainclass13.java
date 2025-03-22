package collectionProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Mainclass13 {
	public static void main(String[] args) {
		LinkedHashMap hm= new LinkedHashMap();
		hm.put("Qspider", "testing");
		hm.put("jspider", "java");
		hm.put("pyspider", "python");
		hm.put("Automation", "Selenium");
		hm.put("Automation", "Cypress");
		hm.put("Developer", "java");
		hm.put(null, "Btm");
		hm.put(null, "silk Board");
		hm.put("C", null);
		hm.put("Q", null);
		hm.put(123, "Student");
		hm.put("boys", 90);
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
