import java.util.List;
import java.util.ArrayList;

public class ListEx09 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		ArrayList<String> al = new ArrayList<>();
		list.add("hong ail dong");
		list.add("lee sun shin");
		
		String result;
		for (int i = 0; i < list.size(); i++) {
			result = list.get(i);
			System.out.println(result.toUpperCase());
		}
		System.out.println("\n======================");
		for (String name : list)
			System.out.println(name.toUpperCase());
	}

}
