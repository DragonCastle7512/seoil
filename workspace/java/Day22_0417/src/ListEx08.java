/* 제네릭이 필요한이유
 * 불필요한 업/다운 캐스팅을 하지　않아서　안정성과　실행속도를　높임
 */

import java.util.ArrayList;
import java.util.List;

public class ListEx08 {

	public static void main(String[] args) {

		List cityList = new ArrayList();
		cityList.add("Seoul");
		cityList.add("busan");
		cityList.add("deajeon");
		String temp = null;
		for (int i = 0; i < cityList.size(); i++) {
			if(cityList.get(i) instanceof String)
				temp = (String)cityList.get(i);
			System.out.println(temp.toUpperCase());
		}
	}

}
