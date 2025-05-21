class Point09 {
	int x, y;
	public Point09() {}
	public Point09(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Point09) {
			Point09 ptTmp = (Point09)obj;
			return ((x == ptTmp.x) && (y == ptTmp.y)) ? true : false;
		}
		return false;
	}
}

public class InterEx09 {

	public static void main(String[] args) {

		Point09 pt01 = new Point09();
		Point09 pt02 = new Point09();
		System.out.println((pt01 == pt02) ? "같다" : "다르다");
		System.out.println((pt01.equals(pt02)) ? "같다" : "다르다");
		
	}

}
