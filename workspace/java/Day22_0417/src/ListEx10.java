import java.util.Enumeration;
import java.util.Hashtable;

public class ListEx10 {

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("apple", "사과");
		ht.put("orange", "오렌지");
		ht.put("grape", "포도");
		String val = ht.get("grape");
		if(val != null) System.out.println("grape => "+val);
		Enumeration<String> em = ht.keys();
		while (em.hasMoreElements()) {
			String k = em.nextElement();
			System.out.println(k+" "+ht.get(k));
		}
		
	}

}
