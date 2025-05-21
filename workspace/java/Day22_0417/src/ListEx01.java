import java.util.HashSet;
import java.util.Set;

public class ListEx01 {

	public static void main(String[] args) {

		Set set = new HashSet();
		set.add(100);
		set.add(100.6);
		set.add("Seoil");
		set.add("Seoil");
		set.add(true);
		System.out.println("컬렉션 원소개수: "+set.size());
		System.out.println(set);
	}

}
