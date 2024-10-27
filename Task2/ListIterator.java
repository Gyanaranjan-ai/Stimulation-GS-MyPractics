import java.util.ArrayList;
import java.util.List;

public class ListIterator {
	
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(23);
		l.add("Gyana");
		l.add(true);
		
		java.util.ListIterator listIterator = l.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("---------------");
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
//		l.remove(2);
		listIterator.add("miku");
		
		System.out.println(l);
//		listIterator.set(200);
		System.out.println(l);
	}

}
