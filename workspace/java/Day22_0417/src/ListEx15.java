import java.util.Arrays;
import java.util.List;

public class ListEx15 {

	static void printList(List<?> list) {
		for (Object obj : list)
			System.out.println(" "+obj);
	}
	public static void main(String[] args) {

		List<Integer> li01 = Arrays.asList(10, 20, 30);
		printList(li01);
		
		List<String> li02 = Arrays.asList("one", "two");
		printList(li02);
	}

}
