package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add("Gyana");
		l.add(true);
		
//		System.out.println(l);
		java.util.Iterator iterator = l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------------------");
	}

}
