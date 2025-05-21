// 인터페이스에 오는 모든 변수는 public static final로 인식되는 정적 상수만 올 수 있다.
interface IColor12 {
	int RED = 1; //정적 상수
	public static final int GREEN = 2;
	public static final int BLUE = 3;
	void setColor(int c);
	public abstract int getColor();
}
abstract class AbsColor12 implements IColor12 {
	int color = GREEN;
	@Override
	public void setColor(int c) {
		color = c;
	}
}
class SubClass12 extends AbsColor12 {

	@Override
	public int getColor() {
		return 0;
	}
}
public class AbsEx12 {

	public static void main(String[] args) {

		SubClass12 sub = new SubClass12();
		sub.setColor(IColor12.RED);
		System.out.println(sub.getColor());
	}

}
