import java.util.HashMap;
import java.util.Map;

public class ListEx11 {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<>();
		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem"};
		for (String s : sample)
			m.put(s, !m.containsKey(s) ? 1 : m.get(s)+1);
		System.out.println(m.size());
		System.out.println(m.containsKey("to"));
		System.out.println(m);
	}

}
