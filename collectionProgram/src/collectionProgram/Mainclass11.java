package collectionProgram;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Mainclass11 {
	public static void main(String[] args) {
		PriorityQueue   pq = new PriorityQueue();
	       pq.add("Alia");
	       pq.add("Tamanah");
	       pq.add("Priyanka");
	       pq.add("Katrina");
		   pq.add("Kirti");
		   pq.add("Sridevi");
		   pq.add("Alia");
		Iterator itr= pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}
}
