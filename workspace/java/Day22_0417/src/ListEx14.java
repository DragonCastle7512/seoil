import java.util.ArrayList;

public class ListEx14 {

	public static void main(String[] args) {

		ArrayList<String> city = new ArrayList<>();
		city.add("서울시");
		city.add("부산시");
		city.add("대전시");
		//Object 형변환을 제한적 허용(와일드 카드)
		ArrayList<? extends Object> objlist;
		objlist = city;
		for (Object obj : objlist)
			System.out.println(obj);
	}

}
