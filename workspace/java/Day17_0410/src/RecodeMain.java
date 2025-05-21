import net.daum.dto.Rectangle;

public class RecodeMain {

	static void area(Object obj) {
		if(obj == null) return;
		//Java 21에서 추가된 레코드 패턴
		if(obj instanceof Rectangle(int width, int height)) {
			//instanceof 형변환 유무 판단 연산자
			System.out.println("사각형 면적: "+(width*height));
		}
	}
	static void area2(Object obj) {
		switch (obj) {
			case Rectangle(int width, int height) -> System.out.println("사각형 면적: "+width*height);
			case null, default -> System.out.println("unknown");
		}
	}
	
	public static void main(String[] args) {

		Rectangle rect = new Rectangle(10, 5);
		area(null);
		area(rect);
		System.out.println();
		area2(rect);
		area2(null);
	}

}
