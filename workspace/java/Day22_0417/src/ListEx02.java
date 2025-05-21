import java.util.List;
import java.util.ArrayList;

public class ListEx02 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(7);
		list.add("홍길동");
		list.add("홍길동");
		list.add(100.7);
		list.add(true);
		System.out.println("컬렉션 원소개수: "+list.size());
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
