/* 매개변수 다형성 문법
 * 코드 라인이 줄어들고, 중복 코드를 줄임
*/

import net.daum.model01.ShapeClass;
import net.daum.model02.*;

public class AbsEx03 {

	static void 입고01(ShapeClass ref) {
		ref.draw();
	}
	static void 입고02(Circ c) {
		c.draw();
	}
	static void 입고02(Rect r) {
		r.draw();
	}
	static void 입고02(Tria t) {
		t.draw();
	}
	public static void main(String[] args) {

		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		입고01(c); 입고01(r); 입고01(t);
		System.out.println("\n==================");
		입고02(new Circ());
		입고02(new Rect());
		입고02(new Tria());
	}

}
