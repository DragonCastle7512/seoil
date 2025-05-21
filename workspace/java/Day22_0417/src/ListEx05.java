import java.util.Enumeration;
import java.util.Vector;

public class ListEx05 {

	public static void main(String[] args) {

		Vector v = new Vector();
		for (int i = 1; i <= 5; i++)
			v.add(new Integer(i*10));
		Enumeration en = v.elements();
		while (en.hasMoreElements())
			System.out.println(en.nextElement());
	}

}
