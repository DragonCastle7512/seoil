import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListEx03 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add("강감찬");
		list.add("홍길동");
		list.add("서울시");
		Iterator elemnt = list.iterator();
		while (elemnt.hasNext())
			System.out.println(elemnt.next());
	}

}
