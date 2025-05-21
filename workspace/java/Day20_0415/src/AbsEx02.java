import java.awt.Shape;

import net.daum.model01.ShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

public class AbsEx02 {

	public static void main(String[] args) {

		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		c.draw();
		r.draw();
		t.draw();
		System.out.println("\n =========================");
		
		ShapeClass ref = new Circ();
		ref.draw();
		ref = new Rect();
		ref.draw();
		ref = new Tria();
		ref.draw();
		System.out.println("\n ======================");
		
		ShapeClass[] arr = new ShapeClass[3];
		arr[0] = new Circ();
		arr[1] = new Rect();
		arr[2] = new Tria();
		for (int i = 0; i < arr.length; i++) {
			arr[i].draw();
		}
	}

}
