class Point07 {
	int x, y;
	public Point07() {}
	public Point07(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		String result = "(x좌표값: "+x+", y좌표값: "+y+")";
		return result;
	}
}
public class InterEx07 {

	public static void main(String[] args) {

		Point07 pt = new Point07(100, 200);
		System.out.println(pt);
	}

}
