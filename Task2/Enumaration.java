import java.util.Enumeration;
import java.util.Vector;

public class Enumaration {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add("Milu");
		v.add("Gyana");
		v.add(true);
		
		System.out.println(v);
		Enumeration elements = v.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
	}
}
