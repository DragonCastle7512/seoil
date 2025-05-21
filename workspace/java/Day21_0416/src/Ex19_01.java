import net.daum.model01.IShapeClass;
import net.daum.model02.*;

public class Ex19_01 {

	public static void main(String[] args) {

		IShapeClass ref;
		pr(new Circ());
		pr(new Rect());
		pr(new Tria());
	}
	static void pr(IShapeClass i) {
		i.draw();
	}

}
